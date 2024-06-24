package org.actionclass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizingUIElement_2 {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://jqueryui.com/resizable/");
            driver.switchTo().frame(0);
            WebElement ele = driver.findElement(By.xpath("//body/div[@id='resizable']/div[3]"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(ele).moveByOffset(30, 20).build().perform();


    }
}
