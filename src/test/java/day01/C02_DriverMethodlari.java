package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();//sayfayi buyutur
        //amazon sayfasina gidiniz
        driver.get("http://www.bol.com");
        //kaynak kodlari icinde bol kelimesinin oldugunu test ediniz
        System.out.println(driver.getPageSource());//sayfadaki kaynak kodlarini verir
        String istenenKelime="bol";
        if(driver.getPageSource().contains(istenenKelime)){
            System.out.println("PageSource testi PASSED");//PageSource testi PASSED
        }else System.out.println("PageSource testi FAILE");
        driver.close();//sayfayi kapatir
        driver.quit();//birden fazla sayfa varsa hepsini kapatuir
    }
}
