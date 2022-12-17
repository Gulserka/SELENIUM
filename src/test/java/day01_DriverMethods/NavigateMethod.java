package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Amazon sayfasına gidelim
        driver.navigate().to("https://amazon.com");
        //techproeducation sayfasına gidelim
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.navigate().to("https://techproeducation.com");
        //Tekrar amazon sayfasına dönelim
        driver.navigate().back();// Amazon sayfasina geri doner
        //Tekrar techproeducation sayfasına gidelim
        driver.navigate().forward();// Techproya gider
        //Son sayfada sayfayı yenileyelim(refresh)
        driver.navigate().refresh();
        //Ve sayfayı kapatalım
        driver.close();


       /*
        get(), belirli bir URL’de (web sitesinde) gezinmek ve sayfa yüklenene kadar beklemek için kullanılır. sürücü.
        (), belirli bir URL’ye gitmek için kullanılır ve sayfanın yüklenmesini beklemez
        */







    }
}
