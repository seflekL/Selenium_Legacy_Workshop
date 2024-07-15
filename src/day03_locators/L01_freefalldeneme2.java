package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class L01_freefalldeneme2 {

    public static void main(String[] args) {

        System.setProperty("Webdriver.chorme.driver","src/resources/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //test sayfasina gdin
        driver.get("https://testotomasyonu.com");

        //phone icin arama yapin

        WebElement armaBox= driver.findElement(By.id("global-search"));
        armaBox.sendKeys("phone"+ Keys.ENTER);

      List<WebElement>arananElementlist=driver.findElements(By.xpath("//*[@class='prod-img']"));

      if (arananElementlist.size()>0){
          System.out.println("Aranan Element testi Passed");

      }else System.out.println("Arana Element testi Failed");

        for (WebElement eachElememt : arananElementlist) {

           System.out.println(eachElememt.getText());

        }
        arananElementlist.get(0).click();

        WebElement urunsensetivecaseText=driver.findElement(By.className("prod-detail"));

        String expectedWord="phone";
        String actualSource=urunsensetivecaseText.getText().toLowerCase();

        if (actualSource.contains(expectedWord)){

            System.out.print("Phone testi  Passed!");

        }else System.out.println("Phone Testi Failed!");


    }
}
