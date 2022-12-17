package day01practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day01 {
    /*
     Yeni bir package olusturalim : day01

     Yeni bir class olusturalim : C03_GetMethods
     Amazon sayfasina gidelim. https://www.amazon.com/
     Sayfa basligini(title) yazdirin
     Sayfa basliginin “Amazon” icerdigini test edin
     Sayfa adresini(url) yazdirin
     Sayfa url’inin “amazon” icerdigini test edin.
     Sayfa handle degerini yazdirin
     Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
     Sayfayi kapatin.

     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");
        //Sayfa basligini(title) yazdirin
        System.out.println("Sayfa Baslığı : "+driver.getTitle());
        //Sayfa basliginin “Amazon” icerdigini test edin
        String actualTitle = driver.getTitle();
        if(actualTitle.contains("Amazon")){
            System.out.println("Title testi PASSED");
        }else System.out.println("Title testi FAILED");
        //Sayfa adresini(url) yazdirin
        System.out.println("Sayfa Url'i : "+driver.getCurrentUrl());
        //Sayfa url’inin “amazon” icerdigini test edin.
        String actualUrl = driver.getCurrentUrl();
        if(actualUrl.contains("amazon")){
            System.out.println("Url Testi PASSED");
        }else System.out.println("Url Testi FAILED");
        //Sayfa handle degerini yazdirin
        System.out.println("Window Handle Değeri : "+driver.getWindowHandle());
        //Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        String sayfaKodlari = driver.getPageSource();
        if(sayfaKodlari.contains("Gateway")){
            System.out.println("Source Code Testi PASSED");
        }else System.out.println("Source Code Testi FAILED");
        //Sayfayi kapatin.
        driver.close(); // Sayfayi kapatmak için close() methodu kullanırız
    }
//        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.amazon.com");
//
//        System.out.println(driver.getTitle());
//       String actualTitle = driver.getTitle();
//        if (actualTitle.contains("Amazon")) {
//            System.out.println("Title testi PASSED");
//        } else System.out.println("Title testi FAILED");
//
//        System.out.println(driver.getCurrentUrl());
//        String actualUrl = driver.getCurrentUrl();
//        if (actualUrl.contains("amazon")){
////
////        }


    }


