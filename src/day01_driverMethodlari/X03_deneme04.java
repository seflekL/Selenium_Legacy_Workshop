package Day01_drivermethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X03_deneme04 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");

        WebDriver driver= new ChromeDriver();

       // 1. testotomasyonu sayfasina gidelim. https://www.trendyol.com.tr/

            driver.get("https://www.trendyol.com.tr/");

        //2. Sayfa basligini(title) yazdirin
      //  https://www.trendyol.com/en/select-country
        System.out.println(driver.getTitle());

        //Trendyol: One Stop Fashion Shop

        //3. Sayfa basliginin “Test Otomasyonu” icerdigini test edin

        String actualTitle= driver.getTitle();
        String expectedTitle= "Test Otomasyonu";

        if (actualTitle.contains(expectedTitle)){

            System.out.println("Title Testi Passed");
        } else System.out.println("Title Testi Failed");

        //4. Sayfa adresini(url) yazdirin

        System.out.println(driver.getCurrentUrl());

        //5. Sayfa url’inin https://testotomasyonu.com/ oldugunu test edin.

        String actualURL= driver.getCurrentUrl();
        String expectedUrl="https://testotomasyonu.com/";

        if (actualURL.equals(expectedUrl)){

            System.out.println("URL Testi Passed!");
        }else {
            System.out.println("URL Testi Failed");

            //6. Sayfa handle degerini yazdirin

            System.out.println(driver.getWindowHandles());
            //[481B0BB2BDDDA018B88E803C6C37FEFB]

            //7. Sayfa HTML kodlarinda “otomasyon” kelimesi gectigini test edin

              String actuaHTML= driver.getPageSource();
              String expetectedHTML="trendyol";

              if (actuaHTML.contains(expetectedHTML)){

                  System.out.println("HTML Testi Passed!");

                 } else System.out.println("HTML testi Failed");
                    //HTML Testi Passed!
        }  // 8. Sayfayi kapatin.

        Thread.sleep(10000);

        driver.close();

    }
}
