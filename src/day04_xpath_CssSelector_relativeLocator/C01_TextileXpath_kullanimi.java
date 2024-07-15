package day04_xpath_CssSelector_relativeLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_TextileXpath_kullanimi {

    public static void main(String[] args) {



        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //1- https://testotomasyonu.com/addremove/ adresine gidin

        driver.get("https://testotomasyonu.com/addremove/");

        //2- Add Element butonuna basin


        driver.findElement(By.xpath("//*[text()='Add']")).click();


        //3- Remove butonu’nun gorunur oldugunu test edin


        WebElement removeButton=driver.findElement(By.className("remove-btn"));
        if (removeButton.isDisplayed()){
            System.out.println("RemoveButton gorunur testi PASSED!");
        }else System.out.println("RemoveButton gorunur testi FAILED!");
        //4- Remove tusuna basin

        driver.findElement(By.className("remove-btn")).click();


        WebElement imgTest = driver.findElement(By.tagName("h2"));


        if (imgTest.isDisplayed()){

            System.out.println("Add/Remove Elements Yazisi gorunur testi PASSED!");

        }else System.out.println("Add/Remove Elements Yazisi gorunur testi FAILED!");

     }
}

