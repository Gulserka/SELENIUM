package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ClassWork {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();//sayfayi actiktan sonra hep maximiza yap
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//Bu method sayfadaki her bir webelement icin
                                                                          //max. bekleme suresini belirler.
        // bu islemi yapmayi aliskanlik haline getir.

        //ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        //oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://facebook.com");
        String actualTitle = driver.getTitle();
        if (actualTitle.contains("facebook")){
            System.out.println("Title Testi PASSED");
        }else System.out.println("Title Testi FAILED" + actualTitle);


        //Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i yazdirin.
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains("facebook")){
            System.out.println("Url Testi PASSED");
        }else System.out.println("Url Testi FAILED" + actualUrl);


        //https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.walmart.com/");


        //Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String actualWalmartTitle = driver.getTitle();
        String expectedWalmartTitle = "Walmart.com";
        if(actualWalmartTitle.contains(expectedWalmartTitle)){
            System.out.println("Title testi PASSED");
        } else System.out.println("Title testi FAİLED");


        //Tekrar “facebook” sayfasina donun
            driver.navigate().back();


        //Sayfayi yenileyin
        driver.navigate().refresh();

        //Browser'i kapatin.
        driver.close();



    }
}
