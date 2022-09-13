package Calisma;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GenelOdevTekrari02 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


       // 2. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
       // 3. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("sayfa konumu"+driver.manage().window().getPosition());
        System.out.println("sayfanin boyutu"+driver.manage().window().getSize());
        // 4. Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage().window().setPosition(new Point(30,50));
        driver.manage().window().setSize(new Dimension(30,50));
       // 5. Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        driver.manage().window().getPosition();
        driver.manage().window().getPosition();
       // 8. Sayfayi kapatin
       // driver.close();
      // 2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        // oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://www.facebook.com");
       String actualTitle= driver.getTitle();
       String expectedTitle="facebook";
       if(actualTitle.equals(expectedTitle)){
           System.out.println("test passsed");
       }else System.out.println(actualTitle);

      // 3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
      // yazdirin.
        String url=driver.getCurrentUrl();
        String actuelUrl="facebook";
        if(url.contains(actuelUrl)){
            System.out.println("test PASSED");
        }else System.out.println("actuelurl= "+url);
      // 4.https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.walmart.com/");
      // 5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String actuelbaslik= driver.getTitle();
        String kelime="Walmart.com";
        if(actuelbaslik.contains(kelime)){
            System.out.println("test is passed");
        }else System.out.println("test is failed");


      // 6. Tekrar “facebook” sayfasina donun
        driver.navigate().back();
      // 7. Sayfayi yenileyin
        driver.navigate().refresh();
      // 8. Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();
      // 9.Browser’i kapati

//==========TEKRAR TESTI===========//
      // 2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın
      //         (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
      // 3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru
      // URL'yi yazdırın.
      // 4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
      // 5. Youtube sayfasina geri donun
      // 6. Sayfayi yenileyin
      // 7. Amazon sayfasina donun
      // 8. Sayfayi tamsayfa yapin
      // 9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa
      // doğru başlığı(Actual Title) yazdırın.
      // 10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
      // URL'yi yazdırın
      // 11.Sayfayi kapati
        //driver.close();
    }
}
