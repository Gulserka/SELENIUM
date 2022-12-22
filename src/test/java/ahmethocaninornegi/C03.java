package ahmethocaninornegi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03 {
    public static void main(String[] args) {




        //4- sayfadaki her bir button uzerindeki yazilari yazdirin.

        System.setProperty("webdriver.chrome.drive","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- https"//www.bestbuy.com adresine gidin.
        driver.get("https://www.bestbuy.com");

        //2- cookies varsa kabul et butonuna basin.
        //yok

        //3- sayfada kac adet button bulundugunu yazdirin.
        List<WebElement> buttonListesi = driver.findElements(By.tagName("button"));
        System.out.println(buttonListesi.size()); //uzunlugunu yazdirirsak kac tane old buluruz.

        //4- sayfadaki herbir button uzerinden yazilari yazdirin.
        for (WebElement w : buttonListesi) {
            System.out.println(w.getText());
        }






    }
}
