package org.actionclass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RangeSlider {
    static WebDriver driver;
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://jqueryui.com/slider/#range");

        driver.switchTo().frame(0);
        WebElement slider1 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/span[1]"));
        WebElement slider2 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/span[2]"));

        Actions actions = new Actions(driver);

        actions.clickAndHold(slider1).moveByOffset(110,0).release().build().perform();
        actions.clickAndHold(slider2).moveByOffset(-10,0).release().build().perform();
    }
}
