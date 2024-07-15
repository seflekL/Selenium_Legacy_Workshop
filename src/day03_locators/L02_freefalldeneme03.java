package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.List;

public class L02_freefalldeneme03 {
    public static void main(String[] args) {

        System.setProperty("Webdriver.chorme.drive","src/resources/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://zero.webappsecurity.com/");

        WebElement onlineLink=driver.findElement(By.id("onlineBankingMenu"));
        onlineLink.click();

        List<WebElement> islemSayiTesT=driver.findElements(By.className("headers"));
        System.out.println(islemSayiTesT.size());
        int testsayi=6;
        if (islemSayiTesT.size()==testsayi){
         }else System.out.println("6 Islem testi FAILED");

        List<WebElement>paybillList=driver.findElements(By.className("headers"));

        List<String>aramaList= ReusableMethods.getStringList(paybillList);
        System.out.println(aramaList);

        if (aramaList.contains("Pay Bills")){
            System.out.println("Pay arama Pass!");
        }else System.out.println("{Pay arama Failed!");

        boolean flag=false;
        for (WebElement eachElement : paybillList) {

            if (eachElement.getText().equalsIgnoreCase("Pay Bills")) {
                flag = true;
            }
            }
            if (flag==true){
                System.out.println("Pay arama Pass!");
            }else System.out.println("{Pay arama Failed!");

        }
        }


