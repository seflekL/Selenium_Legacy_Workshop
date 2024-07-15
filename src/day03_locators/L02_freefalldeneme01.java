package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.List;

public class L02_freefalldeneme01 {

    public static void main(String[] args) {
        System.setProperty("Webdriver.chorme.drive","src/resources/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

     driver.get("http://zero.webappsecurity.com/");

    WebElement linkClick=driver.findElement(By.id("onlineBankingMenu"));
               linkClick.click();

    // 4- Resim altinda 6 islem basligi oldugunu test edin

        List<WebElement>islemList=driver.findElements(By.className("headers"));
        int islemID=6;


        if (islemList.size()==islemID){

            System.out.println("6 islem testi PASSED!");
        }else System.out.println("6 islem testi FAILED!");

        List<String>islemIsimList= ReusableMethods.getStringList(islemList);
        System.out.println(islemIsimList);
        if (islemIsimList.contains("Pay Bills")){

               System.out.println("Pay Bills arama testi PASSED!");
        } else System.out.println("Pay Bills arama testi FAILED!");

        //2.yoll

        boolean islemFlag=false;

        for (WebElement eachElement : islemList) {
            if (eachElement.getText().contains("Pay Bills")){
                islemFlag=true;

                if (islemFlag==true){

                    System.out.println("Pay Bills arama testi PASSED!");
                } else System.out.println("Pay Bills arama testi FAILED!");
                }
            }
        }
    }

