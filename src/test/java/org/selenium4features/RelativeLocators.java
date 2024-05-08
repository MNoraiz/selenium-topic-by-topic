package org.selenium4features;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocators {
    static WebDriver driver;
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.goodreads.com/");

        WebElement amz = driver.findElement(By.cssSelector("a[class = 'gr-button gr-button--amazon gr-button--fullWidth gr-button--auth']"));

        // FIRST APPROACH: Locate and click the Apple login button which is positioned below the 'amz' element
        driver.findElement(with(By.cssSelector("a[class = 'gr-button gr-button--apple gr-button--fullWidth gr-button--auth']")).below(amz)).click();

        /* Second APPROACH: Define a locator for the Apple login button below 'amz' and perform a click action
        By appleLocator = with(By.cssSelector("a[class = 'gr-button gr-button--apple gr-button--fullWidth gr-button--auth']")).below(amz);
        driver.findElement(appleLocator).click();*/



    }
}
