package Day01_drivermethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X03_deneme05 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");

        WebDriver driver=new ChromeDriver();


       // 1. testotomasyonu sayfasina gidelim. https://www.youtube.com/

        driver.get("https://www.youtube.com");

        //2. Sayfa basligini(title) yazdirin

        System.out.println(driver.getTitle());//YouTube


// 3. Sayfa basliginin “Youtube” icerdigini test edin

        String actualTitile= driver.getTitle();
        String expectedTitle="YouTube"; //Youtube

        if (actualTitile.contains(expectedTitle)){

            System.out.println("Title testi Pass");
        } else System.out.println("Title testi Failed");

   //4. Sayfa adresini(url) yazdirin //https://www.youtube.com/
        System.out.println(driver.getCurrentUrl());

//5. Sayfa url’inin https://testotomasyonu.com/ oldugunu test edin.
        String actualURL= driver.getCurrentUrl();
        String expectedURL= "https://testotomasyonu.com/";

        if (actualURL.equals(expectedURL)){
            System.out.println("URL testi Pass");

        } else System.out.println("Url testi Failed");

       // 6. Sayfa handle degerini yazdirin

        System.out.println(driver.getWindowHandles());
        //[3A0BF8CE46E38E4ECF6FDC4316A10034]

//7. Sayfa HTML kodlarinda “otomasyon” kelimesi gectigini test edin

        String acutalSource= driver.getPageSource();
        String expectedHTMLkeyword= "youtube";

        if (acutalSource.contains(expectedHTMLkeyword)){

            System.out.println("HTML  keyword source Pass");
        } else System.out.println("HTML keyword FAILED");


        Thread.sleep(5000);
      //  8. Sayfayi kapatin.

        driver.close();

    }
}
