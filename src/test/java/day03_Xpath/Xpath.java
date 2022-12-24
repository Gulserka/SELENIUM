package day03_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Xpath {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.drive", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");


        //2- Add Element butonuna basin
        WebElement addButton = driver.findElement(By.xpath("//button[@onclick='addElement()']")); //.click(); //normalde sadece click dedigimiz zaman atama yapmaya gerek yok sanirim.
        //Ama burada daha sonraki kodda kullancagimiz icin atama yaptik.
        //Ilk basta click vardi burda ama daha sonrasinda kullancagimiz icin atama yapalim diye dusunduk ve atama yapinca click hata verdi. O yuzden sildik.
        addButton.click();


        //3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButonu = driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));
        if (deleteButonu.isDisplayed()) { //Bir webelementin gorunur olup olmadigina isDisplayed methodu ile bakariz.
            System.out.println("Test PASSED");
        } else {
            System.out.println("Test FAILED");
        }

        //4- Delete tusuna basin
        Thread.sleep(3000);
        deleteButonu.click();


        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveEYazisi = driver.findElement(By.xpath("//h3"));
        if (addRemoveEYazisi.isDisplayed()) {
            System.out.println("TEST PASSED");
        } else System.out.println("TEST FAILED");

    }


}

