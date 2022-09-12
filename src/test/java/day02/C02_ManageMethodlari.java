package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_ManageMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();

        //Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        //Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("pencere konumu"+driver.manage().window().getPosition());//acilan browsin konumu=(10,10)
        System.out.println("pencere olcusu"+driver.manage().window().getSize());//acilan pencerenin olcusunu verir
        //Sayfayi simge durumuna getirin
        driver.manage().window().minimize();//simge drumuna getirir
        //simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();
        //Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("yeni pencere konumu"+driver.manage().window().getPosition());
        System.out.println("yeni pencere olcusu"+driver.manage().window().getSize());
        //Sayfayi fullscreen yapin
        Thread.sleep(3000);
        driver.manage().window().fullscreen();
        //Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("Fullscreen pencere konumu"+driver.manage().window().getPosition());
        System.out.println("fullscreen pencere boyutu"+driver.manage().window().getSize());
        //sayfayi kapatin
        Thread.sleep(3000);
        driver.close();





    }
}
