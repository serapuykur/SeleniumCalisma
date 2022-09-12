package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C06_findelements {
    public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        //amazona git
        driver.get("https://www.amazon.com");
        // Amazon sayfasındaki tag'ları input olanların sayısını yazdırınız
        List<WebElement> tag =driver.findElements(By.tagName("input"));
       System.out.println("input tagin sayisi"+tag.size());//input tagin sayisi 9

       System.out.println(driver.findElement(By.xpath("(//*[@class='a-color-base headline truncate-2line'])[1]")).getText());//Gaming accessories
    Thread.sleep(3000);

        driver.close();
    }

}
