package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class L05_freeFalldenemeler02 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testotomasyonu.com/addremove/");

        driver.findElement(By.id("sub-btn")).click();

        WebElement buttongorunurTEst=driver.findElement(By.className("remove-btn"));

        if (buttongorunurTEst.isDisplayed()){
            System.out.println("Remove Button gorunur testi PASSED!");
        } else System.out.println("Remove Button gorunur testi FAILED");

        driver.findElement(By.className("remove-btn")).click();

        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin

        WebElement  yaziCheck=driver.findElement(By.xpath("//h2"));

        if (yaziCheck.isDisplayed()){
            System.out.println("Add/Remove Elements yazisi gorunur testi PASSED!");
        } else System.out.println("Add/Remove Elements yazisi gorunur testi FAILED");

        Thread.sleep(5000);
        driver.quit();
    }
}
