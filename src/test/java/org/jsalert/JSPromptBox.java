package org.jsalert;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSPromptBox {
    // This line declares a static variable named driver of type WebDriver.
    // WebDriver is an interface in Selenium that represents an instance of a web browser.
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        // We use WebDriverManager (library ) to manage the ChromeDriver binary and set it up for use.
        WebDriverManager.chromedriver().setup();

        // This line initializes the driver variable with a new instance of ChromeDriver.
        // ChromeDriver is a class provided by Selenium specifically for automating Google Chrome.
        driver = new ChromeDriver();

        driver.get("https://www.dezlearn.com/javascript-alerts/");

        driver.findElement(By.xpath("//button[@id='p_alert3']")).click();

        Alert alert =  driver.switchTo().alert();
        // Clear the data in the prompt box by sending an empty string
        alert.sendKeys("");
        Thread.sleep(2000);

        // Send Data to prompt box
        alert.sendKeys("Test");
        Thread.sleep(2000);

        // Accept it
        alert.accept();



    }
}
