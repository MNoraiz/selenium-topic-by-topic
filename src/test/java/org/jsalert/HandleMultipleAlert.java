package org.jsalert;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleAlert {
    // WebDriver is an interface in Selenium that represents an instance of a web browser.
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        // For Popup
        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
        Alert popup = driver.switchTo().alert();
        System.out.println("Popup Text: " +popup.getText());
        popup.accept();
        Thread.sleep(2000);

        // For Confirmation Box
        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
        Alert confirmationBox = driver.switchTo().alert();
        System.out.println("Confirmation Box Text: " + confirmationBox.getText());
        confirmationBox.dismiss();
        Thread.sleep(2000);

        // For Prompt
        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
        Alert promptBox =  driver.switchTo().alert();
        System.out.println("Prompt Box Text: "+ promptBox.getText());
        promptBox.sendKeys("");
        promptBox.sendKeys("Testing");
        promptBox.accept();
        Thread.sleep(2000);

    }
}
