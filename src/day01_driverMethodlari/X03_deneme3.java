package Day01_drivermethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X03_deneme3 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

       // 1. testotomasyonu sayfasina gidelim. https://www.netflix.com/

            driver.get("https://netflix.com");


            //2. Sayfa basligini(title) yazdirin

        System.out.println(driver.getTitle());
        //Netflix - Watch TV Shows Online, Watch Movies Online

        // 3. Sayfa basliginin “Test Otomasyonu” icerdigini test edin

        String actualTitle=driver.getTitle();
        String expectedTitle="Test Otomasyonu";
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title Testi PASS");
        } else System.out.println("Title Testi FAILED");

            //Title Testi Failed
        //4. Sayfa adresini(url) yazdirin

        System.out.println(driver.getCurrentUrl());
        //https://www.netflix.com/

        //5. Sayfa url’inin https://www.netflix.com/ oldugunu test edin.

        String actualURL="https://www.netflix.com/";
        String expectedURL="https://www.netflix.com/";
        if (actualURL.contains(expectedURL)){

            System.out.println("Url testi PASS");

        }else System.out.println("Url testi FAILED");

        //6. Sayfa handle degerini yazdirin

        System.out.println(driver.getWindowHandles());
      //  [9250E5DB94181A8F4B1D379DF1A8633E]

        //7. Sayfa HTML kodlarinda “netflix” kelimesi gectigini test edin

        String actualSource= driver.getPageSource();
        String expectedWord="netflix";

        if (actualSource.contains(expectedWord)){

            System.out.println("Source testi PASSED");
        }else System.out.println("Source testi FAILED");
        //Source testi PASSED
      // 8. Sayfayi kapatin.

        Thread.sleep(3000);

        driver.close();


    }
}
