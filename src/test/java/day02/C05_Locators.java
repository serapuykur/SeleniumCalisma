package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.com");
      //  Amazonda nutella aratınız
       WebElement aramaKutusu =driver.findElement(By.id("twotabsearchtextbox"));
       aramaKutusu.sendKeys("Nutella"+Keys.ENTER);//id uniq oldugu icin sorunsuz calisir
     //  WebElement aramaKutusu=driver.findElement(By.name("field-keywords"));
      // aramaKutusu.sendKeys("nutella",Keys.ENTER);// name unig oldugu icin sorunsuz calisir
        /*
        WebElement aramaKutusu= driver.findElement(By.className("field-keywords"));
        aramaKutusu.sendKeys("nutella",Keys.ENTER);//

        Bu locatar çalismadı
        Locatar alırken gözümüzden kaçan detaylar olabilir
        aldığımız bir locatar çalışmazsa alternatif locatorlar denemeliyiz
         */
        driver.findElement(By.partialLinkText("oducts on Amazon")).click();//a tagindaki link isminden istedigimiz bir parcayla
        //locate edebiliriz
        driver.findElement(By.linkText("Sell products on Amazon")).click();
        //BU 31-33. SATIRLAR ANLASILMADI








        driver.close();
    }
}
