package org.testsynchronization;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWait {
    static WebDriver driver;
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        // This is a global setting that applies to every element location call for the entire session.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.dezlearn.com/test-sync-example/");
        driver.findElement(By.cssSelector("input[name = 'fname']")).sendKeys("Test FName");
        driver.findElement(By.xpath("//div[@id='content']//input[2]")).sendKeys("Test LName");
        driver.findElement(By.xpath("//input[3]")).sendKeys("Test@gmail.com");

        driver.findElement(By.id("u_5_6")).click();

        driver.findElement(By.linkText("Go to Next Page")).click();

    }
}
