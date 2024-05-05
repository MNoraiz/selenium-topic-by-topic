package org.TwoWindows;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Multiple_Windows {
    static WebDriver driver;
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.dezlearn.com/multiple-browser-windows/");
        driver.findElement(By.id("u_7_8")).click();
        Set<String> widnows = driver.getWindowHandles();
        for (String window: widnows){
            System.out.println(window);
            driver.switchTo().window(window);
            System.out.println(driver.getTitle()) ;
            System.out.println(driver.getCurrentUrl());
            System.out.println("----------------");

            if(driver.getCurrentUrl().equals("https://twitter.com/")) {
                break;
            }
        }
        driver.findElement(By.xpath("//span[text() = 'Create account']")).click();
    }
}
