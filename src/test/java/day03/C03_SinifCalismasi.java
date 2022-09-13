package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_SinifCalismasi {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");
        //b. Sign in butonuna basin
        Thread.sleep(3000);
        WebElement signInButton =driver.findElement(By.id("sign-in"));
        Thread.sleep(2000);
        signInButton.click();
        //c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement emailTextBox= driver.findElement(By.id("session_email"));
        WebElement password= driver.findElement(By.id("session_password"));
        WebElement signin= driver.findElement(By.name("commit"));
        //d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        //i. Username : testtechproed@gmail.com
        //ii. Password : Test1234!
        Thread.sleep(3000);
        emailTextBox.sendKeys("testtechproed@gmail.com");
        password.sendKeys("Test1234!");
        Thread.sleep(3000);
        signin.click();
        //e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).

        WebElement expectedUser=driver.findElement(By.className("navbar-text"));
        Thread.sleep(3000);
        if(expectedUser.isDisplayed()){
            System.out.println("expectedUser testi passed"+expectedUser.getText());
        }else System.out.println("expected user testi failed");
        ///2. yol
        String istenenYazi="testtechproed@gmail.com";
        String actuelUserYazisi=expectedUser.getText();
        if(actuelUserYazisi.equals(istenenYazi)){
            System.out.println("test passed");
        }else System.out.println("test failed");
        //f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        WebElement addresses= driver.findElement(By.linkText("Addresses"));
        WebElement signOut= driver.findElement(By.linkText("Sign out"));
        if (addresses.isDisplayed()){
            System.out.println("Adresses TESTİ PASSED");//Adresses TEST? PASSED
        }else System.out.println("Adresses Testi FAILED");//SignOut TEST? PASSED
        if (signOut.isDisplayed()){
            System.out.println("SignOut TESTİ PASSED");//
        }else System.out.println("SignOut Testi FAILED");
        //3. Sayfada kac tane link oldugunu bulun.
        List< WebElement> liklerListesi=driver.findElements(By.tagName("a"));
        System.out.println("linklerin sayisi :"+liklerListesi.size());//3
        System.out.println(liklerListesi);

        //4. Linkleri yazdırınız
        for (WebElement each:liklerListesi){
            System.out.println("linkler:"+each.getText());
            //5. Linkleri LAMBDA ile yazdırınız
            liklerListesi.forEach(t-> System.out.println(t.getText()));
            //6. Sayfayı kapatınız
            driver.close();

        }
    }
}
