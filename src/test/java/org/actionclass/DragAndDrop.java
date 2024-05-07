package org.actionclass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");

        WebElement source = driver.findElement(By.xpath("//div[@id='column-a']"));
        WebElement target = driver.findElement(By.xpath("//div[@id='column-b']"));

        Actions action = new Actions(driver);

        // Executes a drag-and-drop action by clicking and holding the 'source' element, moving it to the 'target' element,
        action.dragAndDrop(source, target).perform();
    }
}
