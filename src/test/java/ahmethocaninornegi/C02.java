package ahmethocaninornegi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.drive","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //facebook a gidin
        driver.get("https://www.facebook.com");

        //eposta kutusuna rastgele bir mail girin
        WebElement epostaKutusu = driver.findElement(By.xpath("//input[@id='email']"));
        epostaKutusu.sendKeys("fjefksl");

        //sifre kismina rastgele bir sifre girin.
        WebElement sifreKutusu = driver.findElement(By.xpath("//input[@id='pass']"));
        sifreKutusu.sendKeys("1234");


        //giris yap butonuna basin
        driver.findElement(By.xpath(" //button[@name='login']")).click();

        //uyari olarak "The email or mobile number you entered isn't connected to an account. Find your account and log in."
        //mesajinin ciktigini test edin.
        WebElement sonucYaziElementi = driver.findElement(By.xpath("//div[@class='_9ay7']"));
        String expectedSonucYazisi = "The email or mobile number you entered isn't connected to an account. Find your account and log in.";
        String actualSonucYazisi = sonucYaziElementi.getText();
        if (expectedSonucYazisi.equals(actualSonucYazisi)){
            System.out.println("Girilemedi testi passed");
        }else {
            System.out.println("girilemedi testi failed");
        }

        //sayfayi kapatin
        driver.close();








    }
}
