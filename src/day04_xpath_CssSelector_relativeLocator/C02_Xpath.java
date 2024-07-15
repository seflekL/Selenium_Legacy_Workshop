package day04_xpath_CssSelector_relativeLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class C02_Xpath {

    public static void main(String[] args) throws InterruptedException {


        //1- bir class olusturun
        System.setProperty("Webdriver.chrome.driver", "src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //2- https://www.testotomasyonu.com/ adresine gidin
        driver.get("https://www.testotomasyonu.com/");
        //3- Browseri tam sayfa yapin
        //4- Sayfayi “refresh” yapin
        driver.navigate().refresh();
        //5- Sayfa basliginin “Test Otomasyonu” ifadesi icerdigini test edin
        String expectedTitleIcerik = "Test Otomasyonu";
        String actualIcerik = driver.getTitle();

        if (actualIcerik.contains(expectedTitleIcerik)) {

            System.out.println("Title Testi Passed!");

        } else System.out.println("Title Testi Passed!");
        //6- Furniture linkine tiklayin
        driver.findElement(By.xpath("(//a[text()='Furniture'])[3]")).click();

        //7- price range filtresinde min degere 40, max degere 200 yazip filtreleyin
        WebElement minDeger = driver.findElement(By.xpath("//*[@class='form-control minPrice']"));
        minDeger.clear();
        minDeger.sendKeys("40");
        WebElement maxDeger = driver.findElement(By.xpath("//input[@name='max']"));


        maxDeger.clear();

        maxDeger.sendKeys("400");
        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        Thread.sleep(2000);


        driver.findElement(By.xpath("//*[@name='button']")).click();
        //8- filtreleme sonucunda urun bulunabildigini test edin

        List <WebElement> bulunanUrunElementleriList=driver.findElements(By.xpath("//div[@class='product-box mb-2 pb-1']"));
        if (bulunanUrunElementleriList.size()>0){
            System.out.println("Urun bulma testi Passed!");

        }else System.out.println("Urun bulma testi Failed");

        //10-Ilk urunu tiklayin
        bulunanUrunElementleriList.get(0).click();// bulunan elmentler listesinide 0 index ilk urun clik yap

        //11- Urun fiyatinin 40 ile 200 arasinda oldugunu test edin
        WebElement fiyatElementi=driver.findElement(By.id("priceproduct"));
        String fiaytstr=fiyatElementi.getText();
        fiaytstr=fiaytstr.replaceAll("\\D","");
        double fiyatDouble=Double.parseDouble(fiaytstr); // int olarak 5000 oldu ama elliye donmesi gerek
        fiyatDouble /=100; //50.00 double oldu

        if (fiyatDouble>=40 && fiyatDouble<=200){
            System.out.println("Ilk urun fiyat testi Passed!");
        }else System.out.println("Ilk urun fyat testi Failed!");
        //12-Sayfayi kapatin
        driver.quit();
    }
}
