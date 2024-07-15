package Day01_drivermethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X03_deneme {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        /*


7. Sayfa HTML kodlarinda “otomasyon” kelimesi gectigini test edin
8. Sayfayi kapatin.
         */

        //1. testotomasyonu sayfasina gidelim. https://www.testotomasyonu.com/

        driver.get("https://www.testotomasyonu.com/");
       //2. Sayfa basligini(title) yazdirin

        System.out.println(driver.getTitle());
        //Test Otomasyonu - Test Otomasyonu

       // 3. Sayfa basliginin “Test Otomasyonu” icerdigini test edin

        String expectedTitle="Test Otomasyonu";
        String actualTitle=driver.getTitle();

        if (actualTitle.contains(expectedTitle)){

            System.out.println("Title testi PASS");
        } else System.out.println("Title testi FAIL");


        //  4. Sayfa adresini(url) yazdirin

        System.out.println(driver.getCurrentUrl());
        //https://www.testotomasyonu.com/

        //5. Sayfa url’inin https://testotomasyonu.com/ oldugunu test edin.

        String actualURL="https://testotomasyonu.com/";
        String expectedUrl="https://testotomasyonu.com/";

        if (actualURL.equals(expectedUrl)){
            System.out.println("Url testi PASS");
        } else System.out.println("URL Testi FAIL");

        //6. Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());
        //6E66BA6A367F9C4CBADEFEC72E2496EB
        //7. Sayfa HTML kodlarinda “otomasyon” kelimesi gectigini test edin

        String  expectedContent="otomasyon";
        String  actualContent=driver.getPageSource();
        if (actualContent.contains(expectedContent)) {

            System.out.println("Content testi PASS");
        }else System.out.println("Conten testi FAILED");


        Thread.sleep(1000);
        driver.quit();
    }
}
