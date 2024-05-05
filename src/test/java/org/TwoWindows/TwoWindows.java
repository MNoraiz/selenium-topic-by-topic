package org.TwoWindows;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;


public class TwoWindows {
    static WebDriver driver;
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.linkedin.com/");
        driver.findElement(By.linkText("Privacy Policy")).click();
        String parentWindow = driver.getWindowHandle();
        // A Set is a collection that does not allow duplicate elements.
        Set<String> windows = driver.getWindowHandles();

        for(String window : windows){
            if(!window.contains(parentWindow)){
                driver.switchTo().window(window);
                System.out.println(driver.getTitle());
            }
        }





    }
}
