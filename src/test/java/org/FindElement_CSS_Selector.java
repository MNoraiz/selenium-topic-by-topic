package org;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FindElement_CSS_Selector {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverManager.chromedriver().create();

        driver.get("https://bonigarcia.dev/selenium-webdriver-java/");

        Thread.sleep(3000);

        driver.findElement(By.cssSelector("a[href*='web-form']")).click();
        Thread.sleep(3000);

        driver.findElement(By.cssSelector("textarea[name*='my-textarea']")).sendKeys("123123");
        Thread.sleep(3000);


    }
}
