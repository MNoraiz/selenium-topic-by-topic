package org.actionclass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
    static WebDriver driver;
    public static void main(String[] args) {
        WebDriverManager.chromedriver().create();
        driver = new ChromeDriver();
        driver.get("https://jqueryui.com/slider/#colorpicker");

        driver.switchTo().frame(0);
        WebElement red = driver.findElement(By.cssSelector("div#red>span"));
        WebElement green = driver.findElement(By.cssSelector("div#green>span"));
        WebElement blue = driver.findElement(By.cssSelector("div#blue>span"));

        Actions action = new Actions(driver);

        action.clickAndHold(red).moveByOffset(-50,0).release().build().perform();
        action.clickAndHold(green).moveByOffset(50,0).release().build().perform();
        action.clickAndHold(blue).moveByOffset(50,0).release().build().perform();


    }
}
