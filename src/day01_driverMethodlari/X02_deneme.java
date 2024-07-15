package Day01_drivermethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X02_deneme {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://testotomasyonu.com");

        Thread.sleep(1000);


        System.out.println(driver.getWindowHandle());

        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());

        System.out.println(driver.getWindowHandles());

        System.out.println(driver.getClass());

        System.out.println(driver.getTitle());


        driver.close();



    }
    }
