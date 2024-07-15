package pdf01_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class L07_LocatorsV3 {

    public static void main(String[] args) {


        //1- bir class olusturun
        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //2- https://www.testotomasyonu.com/ adresine gidin
        driver.get("https://www.testotomasyonu.com/");
        //3- Browseri tam sayfa yapin
        driver.manage().window().maximize();
        //4- Sayfayi “refresh” yapin
        driver.navigate().refresh();
        //5- Sayfa basliginin “Test Otomasyonu” ifadesi icerdigini test edin
         String actualTitle= driver.getTitle();
         String exptectedTitle= "Test Otomasyonu";
         if (actualTitle.contains(exptectedTitle)){
             System.out.println("Test title otomosyonu Passed! ");
         }else System.out.println("Test tile otomasyonu Failed!");

        //6- Furniture linkine tiklayin
      WebElement aa=driver.findElement(By.xpath("//*[@src='https://www.testotomasyonu.com/uploads/category/169087055784395-removebg-preview.png']"));

      //7- price range filtresinde min degere 40, max degere 200 yazip filtreleyin

        //8- filtreleme sonucunda urun bulunabildigini test edin

        //10-Ilk urunu tiklayin

        //11- Urun fiyatinin 40 ile 200 arasinda oldugunu test edin

        //12-Sayfayi kapatin
        driver.quit();
    }
}
