package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_IlkTest {
    public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //Amazon sayfasina gidiniz
        driver.get("https://www.amazon.com");
        //Basligin amazon icerdigini test ediniz
        String actuelTitle=driver.getTitle();
        String istenenKelime="amazon";
        if(actuelTitle.contains(istenenKelime)){
            System.out.println("Title testi passed");

        }else System.out.println("title testi failed");

        //urlnin amazon icerdigini test ediniz
        String actuelUrl=driver.getCurrentUrl();
        String arananKelime="amazon";
        if(actuelUrl.contains(arananKelime)){
            System.out.println("url testi passed");
        }else System.out.println("Url testi failed");
        //sayfayi kapatiniz
        driver.close();

    }
}
