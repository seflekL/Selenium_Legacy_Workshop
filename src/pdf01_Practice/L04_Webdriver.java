package pdf01_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class L04_Webdriver {

    public static void main(String[] args) {




       // 1.Yeni bir class olusturalim (Homework)
        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       // 2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook” oldugunu test edin,
        // degilse dogru basligi yazdirin.
        driver.get("https://www.facebook.com/");
        System.out.println(driver.getTitle());
        String actualTitle= driver.getTitle();
        String expectedTitle="facebook";
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title testi Passed!");

        }else System.out.println("Title testi Failed!");
       // 3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i yazdirin.
            String expectedWord="facebook";
            String actualURL=driver.getCurrentUrl();

            if (actualURL.contains(expectedWord)){

                System.out.println("Url  kelime testi Passed!");
                System.out.println("Url  kelime testi Failed!");
            }

       // 4.https://www.walmart.com/ sayfasina gidin.
        driver.navigate().to("https://www.walmart.com/");
       // 5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.

        String acutalTitleWal= driver.getTitle();
        String expectedTitleWal="“Walmart.com”";
        if (acutalTitleWal.equalsIgnoreCase(expectedTitleWal)){
            System.out.println("Walmart title testi Passed!");
        }else System.out.println("Walmart title testi Failed!");
        System.out.println(driver.getTitle());
        // 6. Tekrar “facebook” sayfasina donun
        driver.navigate().back();
       // 7. Sayfayi yenileyin
        driver.navigate().refresh();
       // 8. Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().fullscreen();
       // 9.Browser’i kapatin
        driver.quit();
    }
}
