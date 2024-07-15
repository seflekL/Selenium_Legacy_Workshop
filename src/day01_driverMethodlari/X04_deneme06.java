package Day01_drivermethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class X04_deneme06 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        /*
  1. testotomasyonu sayfasina gidelim. https://www.youtube.com/
2. Sayfa basligini(title) yazdirin
3. Sayfa basliginin “Test Otomasyonu” icerdigini test edin
4. Sayfa adresini(url) yazdirin
5. Sayfa url’inin https://testotomasyonu.com/ oldugunu test edin.
6. Sayfa handle degerini yazdirin
7. Sayfa HTML kodlarinda “otomasyon” kelimesi gectigini test edin
8. Sayfayi kapatin.
         */



        //  1. testotomasyonu sayfasina gidelim. https://www.youtube.com/

            driver.get("https://Youtube.com");



            //2. Sayfa basligini(title) yazdirin

        System.out.println(driver.getTitle());


       // 3. Sayfa basliginin “Test Otomasyonu” icerdigini test edin

        String actualTitle= driver.getTitle();
        String expectedTitle="Test Otomasyonu";

        if (actualTitle.contains(expectedTitle)){

            System.out.println("Title Testi Pass");
        } else System.out.println("Title Testi Fail");

        //4. Sayfa adresini(url) yazdirin

        System.out.println(driver.getCurrentUrl());

        //5. Sayfa url’inin https://testotomasyonu.com/ oldugunu test edin.

            String actualURl=driver.getCurrentUrl();
            String expectedURL="https://testotomasyonu.com/";

            if  (actualURl.equals(expectedURL)){

                System.out.println("Url Testi Pass");

            }else System.out.println("Url Testi Fail");

            //6. Sayfa handle degerini yazdirin

        System.out.println(driver.getWindowHandle());

        //7. Sayfa HTML kodlarinda “otomasyon” kelimesi gectigini test edin

            String actualURL= driver.getPageSource();
            String expectedword="otomasyon";

        if (actualURL.contains(expectedTitle)){
            System.out.println("Source Url testi PASS");
        } else System.out.println("Source Urltesti Failed ");


        Thread.sleep(3000);

//   8. Sayfayi kapatin.
        driver.quit();


    }
}
