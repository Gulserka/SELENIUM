package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IlkClass {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        /*
            En temel haliyle otomasyon yapmak icin Class'imiza otomasyon icin gerekli olan
        webdriver'in yerini gostermemiz gerekir. Bunun icin java kutuphanesinden System.setProperty methodunun
        icine ilk olarak driver'i yazariz. Ikinci olarak driver'in fiziki yolunu kopyalariz.

         */
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com"); //www yazmasak da olurmus sanirim.


    }
}
