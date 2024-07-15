package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class L01_freefalldeneme3 {
    public static void main(String[] args) {

        System.setProperty("Webdriver.chorme.driver","src/resources/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testotomasyonu.com");

        WebElement phoneAramaBox=driver.findElement(By.id("global-search"));
        phoneAramaBox.sendKeys("phone"+ Keys.ENTER);

        List<WebElement>searchResultList=driver.findElements(By.className("prod-img"));

        if(searchResultList.size()>0){

            System.out.println("Arama Testi PASSED!");
        }else System.out.println("Arana Testi FAILED");

        for (WebElement eachElement : searchResultList) {

            System.out.println(eachElement.getText());

        }

        searchResultList.get(0).click();

        WebElement phoneWord=driver.findElement(By.xpath("//*[@class=' heading-sm mb-4']"));

        String acutalSearch=phoneWord.getText().toLowerCase();
        String exptectedWord="phone";

        if (acutalSearch.contains(exptectedWord)) {
            System.out.println("Phone Arama Testi PASSED!");

    } else System.out.println("Phone arama testi FAILED!");

}
}


