package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class L01_freefalldeneme {

    public static void main(String[] args) {

        System.setProperty("Webdriver.chorme.driver","src/resources/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // testotomasyonu anasayfaya gidin


        driver.get("https://testotomasyonu.com");

        //phone icin arama yapin

        WebElement kutuAramaBox=driver.findElement(By.id("global-search"));
        kutuAramaBox.sendKeys("phone"+ Keys.ENTER);

        //aramaSonucunda urunBulabildigini test edin

        List <WebElement> arananElementListe=driver.findElements(By.className("prod-img"));
        if (arananElementListe.size()>0) {
            System.out.println("Aranan Urun Listesi Sonucu Passed!");

        }else System.out.println("Aranan Urun Listesi Sonucu Failed!");




        //listeyi yazdirin

              for (WebElement eachElement : arananElementListe) {

                System.out.println(eachElement.getText()); // bosluk oldugu icin cikmayacaktir
            }




              //ilk bulnan urune clik yapin


              arananElementListe.get(0).click();



              // icinde phone geciyorsa yazidirin



        WebElement uruncasesensitiveText= driver.findElement(By.className("prod-detail"));



              String expectedarananKelime="phone";
              String actualpage=uruncasesensitiveText.getText().toLowerCase();

              if (actualpage.contains(expectedarananKelime)){

                  System.out.println("Phone kelime arama testi PASSED!");

              }else {
                  System.out.println("Phone kelime arama testi FAILED!");


        }
    }}
