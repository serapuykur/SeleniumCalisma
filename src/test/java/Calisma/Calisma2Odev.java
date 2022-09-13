package Calisma;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Calisma2Odev {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

      //  9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa
       // doğru başlığı(Actual Title) yazdırın.

        driver.get("https://www.amazon.com");
      String baslik = driver.getTitle();
      String kelime="omazon";
      if(baslik.contains(kelime)){
          System.out.println("passed");
      }else System.out.println("amazon basligi"+baslik);



      //  10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
       // URL'yi yazdırın
       String  actual= driver.getCurrentUrl();
       String expectedurl="https://www.amazon.com/.1";
       if(expectedurl.equals(actual)){
           System.out.println("passed");
       }else System.out.println("actual url : "+actual);//actuel url : https://www.amazon.com/

      //  2. Main method oluşturun ve aşağıdaki görevi tamamlayın.

        //        a. http://a.testaddressbook.com adresine gidiniz.

       driver.get(" http://a.testaddressbook.com");

       // b. Sign in butonuna basin
        //Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@id='sign-in']")).click();
         // Thread.sleep(3000);

       // c. email textbox,password textbox, and signin button elementlerini locate ediniz..

       WebElement email =driver.findElement(By.id("session_email"));
       email.sendKeys("testtechproed@gmail.com"+ Keys.ENTER);

       WebElement pasword=driver.findElement(By.id("session_password"));
       Thread.sleep(3000);
       pasword.sendKeys("Test1234!",Keys.ENTER);
       Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='commit']")).click();
       // e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).

        //driver.close();
    }
}
