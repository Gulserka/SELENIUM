package day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_WebelementsVeLocators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Amazon sayfasına gidelim
        driver.get("https://amazon.com");
        // Search bölümünü locate edelim
        //WebElement aramakutusu = driver.findElement(By.id("twotabsearchtextbox"));
        WebElement aramakutusu = driver.findElement(By.name("field-keywords"));
        // Search bölümünde iphone aratalım
        aramakutusu.sendKeys("iphone", Keys.ENTER);
        /*
            Eğer bir webelementi (Web sayfasındaki herbir buton yada text/yazı) locate (konumunu belirleme)
        etmek istersek önce manuel olarak web sayfasını açıp sayfa üzerinde sağ click yapıp incele'ye tıklarız.
        Karşımıza çıkan HTML kodlarından locater'lardan (konum belirleyiciler) eşsiz olanı seçeriz.
        Genellikle id Attribute'u kullanılır. Seçtiğimiz attribute değerini findelement() metodu içine
        findelement(By.id("atribute değeri")) şeklinde yazarız.
         */
        // Amazon sayfasındaki <input> ve <a> tag'larının sayısını yazdırınız

        List<WebElement> inputTags = driver.findElements(By.tagName("input"));
        System.out.println("Input Tag Sayısı = "+inputTags.size());

        List<WebElement> linklerList = driver.findElements(By.tagName("a"));
        System.out.println("Link Sayısı = "+linklerList.size());


    }
}