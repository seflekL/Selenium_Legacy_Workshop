package Day01_drivermethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X01_Deneme {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.com");
        Thread.sleep(3000);



        driver.get("http://www.testotomasyonu.com");
        Thread.sleep(3000);

        driver.get("http://amazon.com");


        Thread.sleep(3000);

        driver.close();
    }
}
