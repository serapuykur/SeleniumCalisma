package Calisma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Calisma04 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        //2- Add Element butonuna basin
        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
        //3- Delete butonu’nun gorunur oldugunu test edin
       WebElement deleteTusu= driver.findElement(By.xpath("//button[@class='added-manually']"));
        System.out.println("deleteTusu.isDisplayed() = " + deleteTusu.isDisplayed());
        //4- Delete tusuna basin

        driver.findElement(By.xpath("//button[@onclick='deleteElement()']")).click();
        Thread.sleep(3000);
        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edi

       WebElement gorunmeYazisi= driver.findElement(By.tagName("Add/Remove Elements"));
        System.out.println("gorunmeYazisi.isDisplayed() = " + gorunmeYazisi.isDisplayed());
        driver.close();
    }
}
