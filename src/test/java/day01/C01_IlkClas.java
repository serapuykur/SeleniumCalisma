package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClas {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        //System.setProperty()==>icine driver ve driverin fiziki yolu yazilir otomasyon yapmak icin

        WebDriver driver =new ChromeDriver();
        driver.get("http://www.amazon.com");
        System.out.println("actuel title :" +driver.getTitle());//actuel title :Amazon.com. Spend less. Smile more.
        //gidilen sitenin basligini yazdirir
        System.out.println(driver.getCurrentUrl());//gidilen sayfanin url sini getirir
        System.out.println(driver.getPageSource());//
    }
}
