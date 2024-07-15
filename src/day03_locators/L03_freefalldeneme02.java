package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class L03_freefalldeneme02 {
    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.automationexercise.com/");

        List<WebElement> linkTest=driver.findElements(By.tagName("a"));
        int testSayi=147;

        if (linkTest.size()==testSayi){

            System.out.println("147 Link Test PASSED!");
        }else System.out.println("147 Link Test FAILED");

        driver.findElement(By.xpath("//*[@href='/products']")).click();

        WebElement imgTest=driver.findElement(By.id("sale_image"));

        if (imgTest.isDisplayed()){
            System.out.println("IMG test PASSED!");
        }else System.out.println("IMG test FAILED!");

        driver.close();

    }
}
