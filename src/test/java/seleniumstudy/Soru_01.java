package seleniumstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soru_01 {


    //1-Test01 isimli bir class olusturun
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.drive","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");

        //3- Browseri tam sayfa yapin
        driver.manage().window().maximize();

        //4-Sayfayi “refresh” yapin
        driver.navigate().refresh();

        //5-”Salesforce Apex Questions Bank” icin arama yapiniz
        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("Salesforce Apex Questions Bank", Keys.ENTER);


        //6- Kac sonuc bulundugunu yaziniz
        WebElement aramaSonucu = driver.findElement(By.xpath("//*[text()='4 results for']"));
        List<String> aramaSonucuList = new ArrayList<>(Arrays.asList(aramaSonucu.getText().split(" ")));
        System.out.println("Amount of Result : " + aramaSonucuList.get(0));

        //7-Sayfayi kapatin
        driver.close();


    }





    //5-”Salesforce Apex Questions Bank” icin arama yapiniz
    //6- Kac sonuc bulundugunu yaziniz
    //7-Sayfayi kapatin






}
