package org.actionclass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

                    /*
                    * Perform Action Using a Find element
                    */

public class RightClick {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

        // This line creates an instance of the 'Actions' class named 'action'.
        // The 'Actions' class is used to perform complex user gestures on the web page.
        Actions action = new Actions(driver);

        // initializes a WebElement named 'rightClick' by locating an element on the web page.
        WebElement rightClick = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));

        // This line of code performs a context-click (right-click) on the 'rightClick' WebElement.
        action.contextClick(rightClick).perform();
        Thread.sleep(1000);

        //this line performs Click on "Copy" after opening the "Context Menu"
        driver.findElement(By.xpath("//body[1]/ul[1]/li[3]/span[1]")).click();

        // Handling Alert
        Alert a =  driver.switchTo().alert();
        System.out.println(a.getText());
        a.accept();

    }
}
