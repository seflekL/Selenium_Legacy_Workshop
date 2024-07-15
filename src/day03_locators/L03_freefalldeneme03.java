package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class L03_freefalldeneme03 {
    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.automationexercise.com/");


        List<WebElement>linkTest=driver.findElements(By.tagName("a"));
        int testsayi=147;
        if (linkTest.size()==testsayi){
            System.out.println("147 testi PASSED!");
        }else System.out.println("147 testsi FAILED!");

        driver.findElement(By.xpath("//*[@href='/products']")).click();

        WebElement imgTEST=driver.findElement(By.id("sale_image"));

        if (imgTEST.isDisplayed()){
            System.out.println("IMG testi PASSED!");
        }else System.out.println("IMG test FAILED!");
    }
}
