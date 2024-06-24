package org.actionclass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RangeFixedMaximum {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://jqueryui.com/slider/#rangemax");
        driver.switchTo().frame(0);
        Thread.sleep(5000);
        WebElement slider_btn =  driver.findElement(By.xpath("//body/div[@id='slider-range-max']/span[1]"));

        Actions actions = new Actions(driver);
        actions.clickAndHold(slider_btn).moveByOffset(90,0).build().perform();


    }
}
