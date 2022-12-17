package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();//Bos bir browser actik.
        driver.get("https://www.amazon.com"); //ilk olarak gitmek istedigimiz sayfayi belirtiriz.
        System.out.println("Sayfa Basligi : " + driver.getTitle());
        System.out.println("Sayfa urlsi : " + driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
        System.out.println(driver.getWindowHandle()); //Bize o windowa ait hashcode u verir. Biz bu hash degerlerini
                                                      //bir stringe atayip pencereler arasi gecis yapabiliriz.


    }


}
