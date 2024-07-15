package pdf01_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.List;

public class L05_Locators {

    public static void main(String[] args) {

        //1- Bir test class’i olusturun ilgili ayarlari yapin

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2- https://www.testotomasyonu.com/ adresine gidin

        driver.get(" https://www.testotomasyonu.com/");
        //3- arama kutusuna phone yazip aratin
        driver.findElement(By.id("global-search")).sendKeys("phone"+ Keys.ENTER);
        //4- Category bolumunde 8 element oldugunu test edin
        List<WebElement> kategoritestList= driver.findElements(By.className("panel-list"));
        int kategoriTestSAYI=8;
                if (kategoritestList.size()==kategoriTestSAYI){

                    System.out.println("Kategeori 8 testi Passed!");

        }           else System.out.println("Kategori 8 testi Failed!");

        //5- Category isimlerini yazdirin
        System.out.println(ReusableMethods.getStringList(kategoritestList));

        for (WebElement eachElement : kategoritestList) {

            System.out.println(eachElement.getText());

        }

        //6- Sayfayi kapatin

        driver.quit();
    }
}
