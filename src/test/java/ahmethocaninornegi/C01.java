package ahmethocaninornegi;

import day01_DriverMethods.DriverMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.drive","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1.Amazon sayfasina gidin
        driver.get("https://www.amazon.com");
        //2.arama cubuguna "Nutella" yazdirin.
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella");

        //3.Nutella yazdiktan sonra ENTER a basarak arama islemi yapin.
        aramaKutusu.submit();

        //4.Bulunan sonuc yazisini yazdirin
        WebElement sonucYaziElementi = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        System.out.println("sonucYaziElementi = " + sonucYaziElementi.getText());//webelementler direkt yazdirilamazlar cunku objedirler. O yuzden getText()

        driver.close();















    }
}
