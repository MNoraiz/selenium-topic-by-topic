package org.JS_Alert;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Stack;

public class JS_Alert_Basic {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.dezlearn.com/javascript-alerts/");
        driver.findElement(By.xpath("//button[@id='s_alert1']")).click();
        Thread.sleep(1000);

        Alert a = driver.switchTo().alert();
        System.out.println(a.getText());
        a.accept();
    }
}
