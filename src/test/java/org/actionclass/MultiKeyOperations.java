package org.actionclass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;

public class MultiKeyOperations {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://jqueryui.com/selectable/#default");
        driver.switchTo().frame(0);
        WebElement option1 = driver.findElement(By.xpath("//li[contains(text(),'Item 1')]"));
        WebElement option2 = driver.findElement(By.xpath("//li[contains(text(),'Item 2')]"));

        Actions actions = new Actions(driver);
        // Hold the control Key
        actions.keyDown(Keys.CONTROL).perform();

        // Perform click on the elements
        option1.click();
        option2.click();

        // Release control key
        actions.keyUp(Keys.CONTROL).perform();

    }
}
