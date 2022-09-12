package day02;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_ManageMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.youtube.com");
        //Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("sayfanin konumu"+driver.manage().window().getPosition());
        System.out.println("sayfanin boyutu"+driver.manage().window().getSize());
        //Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage().window().setPosition(new Point(20,20));
        Thread.sleep(3000);
        driver.manage().window().setSize(new Dimension(600,300));
        Thread.sleep(3000);
        //Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        System.out.println("sayfanin yeni konumu"+driver.manage().window().getPosition());
        System.out.println("sayfanin yeni boyutu"+driver.manage().window().getSize());
        //sayfayi kapatin
        driver.close();


    }
}
