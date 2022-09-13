package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class C01_TekrarTesti {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //a. web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        //b. Search(ara) “city bike”
       WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
       aramaKutusu.sendKeys("city bike", Keys.ENTER);
        //  //c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        List<WebElement> aramaSonucu=driver.findElements(By.className("sg-col-inner"));
        String sonucYazisi=aramaSonucu.get(0).getText();
        System.out.println(sonucYazisi);//1-16 of 627 results for "city bike"
        //d. Sadece sonuç sayısını yazdırınız
        String [] sonucYazisiE=sonucYazisi.split(" ");
        System.out.println("City bike  arama sonucu "+sonucYazisiE[2]);
        // Sonuc sayısını LAMBDA ile yazdırınız
        Arrays.stream(sonucYazisi.split(" ")).limit(3).skip(2).forEach(System.out::println);
        //e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın

      //  WebElement resim= driver.findElement(By.className("s-image"));
       // resim.click();==>1 yol
        List<WebElement> ilkResim = driver.findElements(By.className("s-image"));
        WebElement ilkResimWe=ilkResim.get(0);
        ilkResimWe.click();
        driver.close();
    }
}
