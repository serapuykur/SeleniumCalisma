package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_WindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();//sayfayi buyutur
        driver.get("https://www.amazon.com");//amazona git
        System.out.println(driver.getWindowHandle());//CDwindow-1AB48DE2BF9FC52F28437E5632D3FB1A
        //farkli pencereler icinde gezinebilmek icin windowhandle ()methodunu kullaniriz
    }
}
