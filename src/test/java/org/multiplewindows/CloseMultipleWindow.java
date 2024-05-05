package org.multiplewindows;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class CloseMultipleWindow {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.dezlearn.com/multiple-browser-windows/");
        String parentWindow = driver.getWindowHandle();
        driver.findElement(By.id("u_7_8")).click();
        Set<String> windows = driver.getWindowHandles();
        for(String window: windows){
            if(!window.equals(parentWindow)){
                driver.switchTo().window(window);
                driver.close(); // this will close 1 window at a time
                Thread.sleep(1000);
            }
        }
        driver.switchTo().window(parentWindow);
        driver.findElement(By.linkText("Test Pages")).click();

        driver.quit(); // it destroy the instance of webdriver

    }
}
