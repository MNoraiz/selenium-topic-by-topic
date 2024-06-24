package org.actionclass;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider_2 {
    static WebDriver driver;
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://jqueryui.com/slider/");
        driver.switchTo().frame(0);
        WebElement slider_btn = driver.findElement(By.xpath("//body/div[@id='slider']/span[1]"));
        Actions action = new Actions(driver);
        action.clickAndHold(slider_btn).moveByOffset(40,0).build().perform();
    }
}
