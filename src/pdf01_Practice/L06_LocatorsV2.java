package pdf01_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.List;

public class L06_LocatorsV2 {

    public static void main(String[] args) {

       // 1- Bir test class’i olusturun ilgili ayarlari yapin

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       // 2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com/");
       // 3- Category bolumundeki elementleri locate edin
        List<WebElement>categoryElement=driver.findElements(By.className("panel-title"));
        // 4- Category bolumunde 3 element oldugunu test edin

        if (categoryElement.size()==3){

            System.out.println("Categori Panel Testi Passed!" );
        }else System.out.println("Categori Panel Testi Failed!");

       // 5- Category isimlerini yazdirin
        System.out.println(ReusableMethods.getStringList(categoryElement));
        // 6- Sayfayi kapatin
        driver.quit();
    }
}
