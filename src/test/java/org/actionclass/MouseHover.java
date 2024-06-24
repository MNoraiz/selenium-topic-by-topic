package org.actionclass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseHover {
    // WebDriver is an interface in Selenium that represents an instance of a web browser.
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://www.dezlearn.com/javascript-alerts/");

        // Create Object of Actions class pass driver object as an argument.
        Actions action = new Actions(driver);

        // Find element want to mouse hover and storing in variable of WebElement type.
        WebElement hover = driver.findElement(By.linkText("Test Pages"));

        // Using Actions class methods
        action.moveToElement(hover).perform();

        Thread.sleep(2000);

        driver.findElement(By.cssSelector("li[id = 'menu-item-9387']")).click();
        System.out.println(driver.getCurrentUrl());



    }
}
