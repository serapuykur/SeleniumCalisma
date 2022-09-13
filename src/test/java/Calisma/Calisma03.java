package Calisma;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Calisma03 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.com");
        WebElement aramaKutusu =driver.findElement(By.xpath("//input[@type='text']"));


        aramaKutusu.sendKeys("nutella"+ Keys.ENTER);
        List<WebElement> aramaSonucu=driver.findElements(By.className("sg-col-inner"));
        System.out.println("aramaSonucu.get(0).getText() = " + aramaSonucu.get(0).getText());
        driver.findElement(By.xpath("(//img[@class='s-image'])[1]")).click();
        driver.close();

       // List<WebElement> aramaSonucu=driver.findElements(By.className("a-section a-spacing-small a-spacing-top-small"));
       // System.out.println("aramaSonucu.get(0).getText() = " + aramaSonucu.get(0).getText());


        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        //2- Add Element butonuna basin
        //3- Delete butonu’nun gorunur oldugunu test edin
        //4- Delete tusuna basin
        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edi
    }
}
