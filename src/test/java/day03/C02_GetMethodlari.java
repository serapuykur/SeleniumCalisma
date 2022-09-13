package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_GetMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //-Amazon sayfasına gidiniz
        driver.get("https://amazon.com");
        //-Arama kutusunu locate ediniz
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        //-Arama kutusunun tagName'inin input olduğunu test ediniz
        String expectedTagName="input";
        String actualTagname=aramaKutusu.getTagName();
        if(expectedTagName.equals(actualTagname)){
            System.out.println("tagname testi passed"+actualTagname);
        }else System.out.println("tagname testi failed"+actualTagname);
        //-Arama kutusunun name atributu'nun değerinin field-keywords olduğunu test ediniz
        String expectedAtributuName="field-keywords";
        String actualAtributuName=aramaKutusu.getAttribute("name");
        if(actualAtributuName.equals(expectedAtributuName)){
            System.out.println("atrubute testi passed");
        }else System.out.println("atributu testi failed");
        // Arama kutusunun konumunu yazdırınız
        System.out.println("arama kutusu konumu"+aramaKutusu.getLocation());//arama kutusu konumu(305, 11)
    }
}
