package pdf01_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class L01_pdfPractice {

    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //1. testotomasyonu sayfasina gidelim. https://www.testotomasyonu.com/

        driver.get("https://www.testotomasyonu.com/");

       //2. Sayfa basligini(title) yazdirin

        System.out.println(driver.getTitle());

        //3. Sayfa basliginin “Test Otomasyonu” icerdigini test edin
        String expectedTitle="Test Otomasyonu";
        String actualtitle=driver.getTitle();

        if (actualtitle.contains(expectedTitle)){

            System.out.println("Title testi PASSED!");

        }else System.out.println("Title testi FAILED!");

       //4. Sayfa adresini(url) yazdirin

        System.out.println(driver.getTitle());

        //5. Sayfa url’inin https://testotomasyonu.com/ oldugunu test edin.

        String expectedUrl="https://testotomasyonu.com/";
        String acutalUrl= driver.getCurrentUrl();

        System.out.println(driver.getCurrentUrl());

        if (actualtitle.equals(expectedUrl)){
            System.out.println("Url testini PASSED!");

        }else System.out.println("Url testi FAILED!");
       //6. Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());

        //7. Sayfa HTML kodlarinda “otomasyon” kelimesi gectigini test edin
        String actualHTML= driver.getPageSource();
        String aranaWord="otomasyon";

        if (actualHTML.contains(aranaWord)){

            System.out.println("Aranan word testi PASSED!");
        } else System.out.println("Aranan word FAILED!");

        //8. Sayfayi kapatin

        driver.close();
    }
}
