package Day01_drivermethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X03_deneme2 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");

        WebDriver driver=new ChromeDriver();


       // 1. testotomasyonu sayfasina gidelim. https://www.amazon.com/
             driver.get("https://www.amazon.com/");

       //2. Sayfa basligini(title) yazdirin

        System.out.println(driver.getTitle());
        //Amazon.com. Spend less. Smile more.

       // 3. Sayfa basliginin “Amazon.com. Spend less. Smile more.” icerdigini test edin

        String actualTitle= driver.getTitle();
        String expectedTitle="Amazon.com. Spend less. Smile more.";

        if (actualTitle.contains(expectedTitle)){

            System.out.println("Title Testi Pass");

        }else System.out.println("Title Testi FAILED");

        //4. Sayfa adresini(url) yazdirin

        System.out.println(driver.getCurrentUrl());
       // https://www.amazon.com/

        //5. Sayfa url’inin https://testotomasyonu.com/ oldugunu test edin.

        String actualURL=driver.getCurrentUrl();
        String expectedURL= "https://testotomasyonu.com/";

        if (actualTitle.contains(expectedURL)) {
            System.out.println("Url Testini Gectiniz PASS ");

        } else System.out.println("Url testi FAIL"+" Expected URl " +expectedURL);
// 6. Sayfa handle degerini yazdirin

        System.out.println(driver.getWindowHandles());
        //[562B934D29C83C00CAB25A554A82C409]


//7. Sayfa HTML kodlarinda “otomasyon” kelimesi gectigini test edin
        String actualHTML= driver.getPageSource();
        String expectedHTML= "otomasyon";

        if (actualHTML.contains(expectedHTML)){
            System.out.println("HTML pagesource testi PASS");

        } else  System.out.println("HTML pagesource testi FAIL");

//8. Sayfayi kapatin.
        Thread.sleep(10000);
        driver.quit();
    }


}
