package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class L03_freeFall01 {

    public static void main(String[] args) {
        // 1- Bir test class’i olusturun ilgili ayarlari yapin

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.automationexercise.com/");

        List<WebElement>linkelementleriList=driver.findElements(By.tagName("a")); // linkleri tag ile aratiryosun
        int testsayisi=147;

        if (linkelementleriList.size()==testsayisi){
            System.out.println("147 adet link testi PASSED!");
        }else System.out.println("147 adet lionk testi FAILED!");

        WebElement linkClick=driver.findElement(By.xpath("//*[@href='/products']"));
        linkClick.click();

        WebElement onsaleTest=driver.findElement(By.id("sale_image"));
        if (onsaleTest.isDisplayed()){
            System.out.println("IMG testi  PASSED!");

        }else System.out.println("IMG TESTI FAILED");

        driver.close();

    }
}
