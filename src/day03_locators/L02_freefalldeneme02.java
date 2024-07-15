package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ReusableMethods;

import java.sql.SQLOutput;
import java.time.Duration;
import java.util.List;

public class L02_freefalldeneme02 {

    public static void main(String[] args) {

        System.setProperty("Webdriver.chorme.drive","src/resources/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://zero.webappsecurity.com/");
         WebElement clickLink= driver.findElement(By.id("onlineBankingMenu"));
                                                             clickLink.click();
        List<WebElement>elemanaraList=driver.findElements(By.xpath("//*[@class='headers']"));
             int testsayisi=6;

            if (elemanaraList.size()==6){
                System.out.println("6 islem arama testi PASSED!");

            } else System.out.println("6 islem arama testi FAILEd!");

            List<String> paybillList= ReusableMethods.getStringList(elemanaraList);

        System.out.println(paybillList);

        if (paybillList.contains("Pay Bills")){

            System.out.println("Pay Bills Testi PASS!");
        }else System.out.println("Pay Bills testi FAILED!");

        boolean paybillFlag= false;

        for (WebElement eachElement : elemanaraList) {

            if (eachElement.getText().equalsIgnoreCase("Pay Bills")) {
                paybillFlag = true;
            }
        }

            if (paybillFlag==true){

                System.out.println("Pay Bills Testi PASS!");
            }else System.out.println("Pay Bills testi FAILED!");




        }
        }



