package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalismaClass_Odev {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        /*
        Amazon sayfasina gidelim. https://www.amazon.com/

        Sayfa basligini(title) yazdirin
        Sayfa basliginin “Amazon” icerdigini test edin
        Sayfa adresini(url) yazdirin
        Sayfa url’inin “amazon” icerdigini test edin.
        Sayfa handle degerini yazdirin
        Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        Sayfayi kapatin.
        */
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        System.out.println("sayfanin basligi" + driver.getTitle());

        System.out.println(driver.getCurrentUrl());
        String url=driver.getCurrentUrl();
        if(url.contains("amazon")){
            System.out.println("passed");
        }else System.out.println("failed");

        //* handledegeri
     //   System.out.println(driver.getWindowHandle());
        //serap iceriyor mu
      //  String html= driver.getWindowHandle();
      //  if(html.contains("serap")){
      //      System.out.println("passed");
       // }else System.out.println("failed");


        driver.navigate().to("https://bol.com");
        Thread.sleep(3000);
        driver.navigate().back();
        driver.navigate().forward();
        driver.close();

    }
}
