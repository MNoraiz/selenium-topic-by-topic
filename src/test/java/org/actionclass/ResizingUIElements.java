package org.actionclass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizingUIElements {
    static WebDriver driver;
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://jqueryui.com/resizable/");

        driver.switchTo().frame(0);
        WebElement resizeAbleHandle = driver.findElement(By.xpath("//body/div[@id='resizable']/div[3]"));

        Actions action = new Actions(driver);

        // Clicks, drags, and drops the 'resizeAbleHandle' by 100 pixels right and 150 pixels down.
        action.clickAndHold(resizeAbleHandle).moveToElement(resizeAbleHandle, 100, 150).build().perform();

    }
}
