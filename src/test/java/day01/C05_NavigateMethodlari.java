package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_NavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://amazon.com");
        //driver.navigate().to()methodu sayfada ileri geri yapacaksak kullanilir
        //driver.get() methodu gibi bizi istedigimiz url ye goturur

        driver.navigate().to("http://techproeducation.com");
        //tekrr amazon sayfasina donelim
        Thread.sleep(3000);
        driver.navigate().back();//bir onceki sayfaya geri  doner
        //tekrr tecproeducationa gidelim
        Thread.sleep(3000);
        driver.navigate().forward();//ilk sayfadan ileri gider
        //techproed sayfasini yenileyelim
        Thread.sleep(3000);
        driver.navigate().refresh();//sayfayi yeniler
        //sayfayi kapatiniz
        driver.close();
    }
}
