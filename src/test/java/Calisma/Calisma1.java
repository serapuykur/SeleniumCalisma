package Calisma;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Calisma1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      //  driver.get("https://www.amazon.com");
       // driver.findElement("")
      //  WebElement aramaCubugu =driver.findElement(By.id("twotabsearchtextbox"));
       // System.out.println(" tag ismi"+aramaCubugu.getTagName());
        //  aramaCubugu.sendKeys("nutella");
     //  aramaCubugu.submit();
       // Thread.sleep(3000);
      //  driver.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']")).click();
        //Thread.sleep(3000);
     // driver.findElement(By.xpath("(//img[@class='s-image'])[6]")).click();
        //System.out.println(aramaCubugu.getAttribute("Atribute degeri"+"amazon"));
    driver.get("https://tureng.com/en/turkish-english");
        WebElement kelime=driver.findElement(By.xpath("//input[@id='searchTerm']"));
       driver.findElement(By.xpath("//button[@class='fc-button fc-cta-consent fc-primary-button']")).click();
    kelime.sendKeys("hello"+Keys.ENTER);
    Thread.sleep(3000);
        driver.close();

    }
}
