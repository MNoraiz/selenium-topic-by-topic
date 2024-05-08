package org.testsynchronization;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {
        static WebDriver driver;
        public static void main(String[] args) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            //This line of code initializes a WebDriverWait object named wait
            // that instructs the driver to wait up to 10 seconds for a certain condition to be met before proceeding.
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            driver.get("https://www.dezlearn.com/explicit-wait-example/");
            driver.findElement(By.cssSelector("input[name = 'fname']")).sendKeys("Test FName");
            driver.findElement(By.xpath("//div[@id='content']//input[2]")).sendKeys("Test LName");
            driver.findElement(By.xpath("//input[3]")).sendKeys("Test@gmail.com");
            driver.findElement(By.id("u_5_6")).click();

            // This line of code uses the wait object to pause the execution until the element with the ID "u_5_7" is clickable,
            // and once it is, performs a click action on it.
            wait.until(ExpectedConditions.elementToBeClickable(By.id("u_5_7"))).click();
    }
}
