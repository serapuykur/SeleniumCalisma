package Calisma;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GenelOdevTekrari01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //========ODEV 1 DRIVER.GET() METHODLARI==========//

       // 3.Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");
       // 4.Sayfa basligini(title) yazdirin
        System.out.println("sayfanin basligi"+driver.getTitle());
        // 5.Sayfa basliginin “Amazon” icerdigini test edin
        String baslik=driver.getTitle();
        String testKelime="Amazon";
        if(baslik.contains(testKelime)){
            System.out.println("getTitle testi PASSED");
        }else System.out.println("getTitle testi FAILED");
       // 6.Sayfa adresini(url) yazdirin
        System.out.println(driver.getCurrentUrl());
        // 7.Sayfa url’inin “amazon” icerdigini test edin.
        String actualUrl=driver.getCurrentUrl();
        String testUrl="amazon";
        if(actualUrl.contains(testUrl)){
            System.out.println("sayfa Url testu PASSED");
        }else System.out.println("sayfa Url testi FAILED");
       // 8.Sayfa handle degerini yazdirin
        System.out.println("sayfanin handle ddegeri = "+driver.getWindowHandle());
        // 9.Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
       String htmlkodu= driver.getPageSource();
       String arananKelime="Gateway";
       if(htmlkodu.contains(arananKelime)){
           System.out.println("gatPageSource testi PASSED");
       }else System.out.println("getPageHtml testi FAILED");
       // 10. Sayfayi kapatin.

        //=========ODEV 2  NAVIGATION METHODS=============//
        // 2. Youtube ana sayfasina gidelim . https://www.youtube.com/
        driver.navigate().to("https://www.youtube.com/");
       // 3. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

       // 4. Tekrar YouTube’sayfasina donelim
        driver.navigate().back();
        Thread.sleep(4000);
       // 5. Yeniden Amazon sayfasina gidelim
        driver.navigate().forward();
       // 6. Sayfayi Refresh(yenile) yapalim
        driver.navigate().refresh();
        Thread.sleep(3000);
       // 7. Sayfayi kapatalim / Tum sayfalari kapatalim

        //=========MANAGE WINDOWS  METHODS============//
      // 2. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
      // 3. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("sayfanin konumu"+driver.manage().window().getPosition());
        System.out.println("sayfanin boyutu"+driver.manage().window().getSize());
        // 4. Sayfayi simge durumuna getirin
        driver.manage().window().minimize();
      // 5. simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();
      // 6. Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("sayfa maksimum  konumda iken"+driver.manage().window().getPosition());
        System.out.println("sayfa maximum  boyutta iken"+ driver.manage().window().getSize());
        // 7. Sayfayi fullscreen yapin
        driver.manage().window().fullscreen();
      // 8. Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("full screen iken konum : "+driver.manage().window().getPosition());
        System.out.println("fullscreen iken boyut : "+driver.manage().window().getSize());
        // 9. Sayfayi kapatin

        //=======NAVIGATE METHOD======//
       // 2. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
       //3. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("konum" +driver.manage().window().getPosition());
        System.out.println("boyut" +driver.manage().window().getSize());
        //4. Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage().window().setPosition(new Point(500,500));
        driver.manage().window().setSize(new Dimension(1000,1000));
       //5. Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        driver.manage().window().setPosition(new Point(500,500));
        driver.manage().window().setSize(new Dimension(1000,1000));
       //8. Sayfayi kapatin
       driver.close();
       driver.quit();


    }
}
