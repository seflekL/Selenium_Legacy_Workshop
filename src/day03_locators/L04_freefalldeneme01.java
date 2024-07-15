package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.List;

public class L04_freefalldeneme01 {
    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // testotomasyonu anasayfaya gidin


        driver.get("https://www.testotomasyonu.com");

        // dress icin arama yapin

        driver.findElement(By.id("global-search")).sendKeys("dress"+ Keys.ENTER);

        // urun bulunabildigini test edin

        List<WebElement> productSearch=driver.findElements(By.xpath("//*[@class='product-box my-2  py-1']"));

        if (productSearch.size()>0){
            System.out.println("Product Search TesTi PASSED!");

        }else System.out.println("Product Search Testi FAILED!");

        for (WebElement eachElement : productSearch) {
            System.out.println(eachElement.getText());
        }
        System.out.println(ReusableMethods.getStringList(productSearch));

        driver.quit();
    }
}
