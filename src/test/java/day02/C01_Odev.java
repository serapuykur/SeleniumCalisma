package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Odev {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");

        //Sayfa basligini(title) yazdirin
        System.out.println("sayfa basligi"+driver.getTitle());
        //Sayfa basliginin “Amazon” icerdigini test edin
        String sayfaBasligi=driver.getTitle();
        String kelime="Amazon";
        if(sayfaBasligi.contains(kelime)){
            System.out.println("getTitle testi PASSED");
        }else System.out.println("getTitle testi FAILED");
        //Sayfa adresini(url) yazdirin
        System.out.println("sayfanin urlsi"+driver.getCurrentUrl());
        //Sayfa url’inin “amazon” icerdigini test edin.
        String url=driver.getCurrentUrl();
        String arananKelime="amazon";
        if(url.contains(arananKelime)){
            System.out.println("getCurrentUrl testi PASSED");
        }else System.out.println("getCurrendUrl testi FAILED");
        //Sayfa handle degerini yazdirin
        System.out.println("handle degeri"+driver.getWindowHandle());
        //Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        String pageSource=driver.getPageSource();
        String htmlArananKelime="Gateway";
        if(pageSource.contains(htmlArananKelime)){
            System.out.println("getpageSource testi PASSED");
        }else System.out.println("getPageSource testi FAILED");
        //Sayfayi kapatin.

        driver.close();


    }


}
