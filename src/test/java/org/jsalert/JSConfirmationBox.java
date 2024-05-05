package org.jsalert;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSConfirmationBox {
    static WebDriver driver;
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.dezlearn.com/javascript-alerts/");
        driver.findElement(By.xpath("//button[@id='c_alert2']")).click();

        Alert alert =  driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.dismiss();
    }
}
