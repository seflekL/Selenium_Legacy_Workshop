package day03_locators;

import com.sun.security.jgss.GSSUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.List;

public class L04_freeFalldeneme02 {
    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.testotomasyonu.com");

        driver.findElement(By.id("global-search")).sendKeys("dress"+ Keys.ENTER);

        List<WebElement>imgTest=driver.findElements(By.xpath("//*[@class='product-box my-2  py-1']"));

        if (imgTest.size()>0){

            System.out.println("Sonuc Testi Passed!");
        }else System.out.println("Sonuc Testi Failed!");

        for (WebElement eachElement : imgTest) {

            System.out.println(eachElement.getText());

        }
        System.out.println(ReusableMethods.getStringList(imgTest));
    }

}
