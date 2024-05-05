package org.Basic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class FndElement_LinkName_ID {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverManager.chromiumdriver().create();

        driver.get("https://bonigarcia.dev/selenium-webdriver-java/");
        // findElement: This method is used to locate a single web element on the page.
        driver.findElement(By.partialLinkText("Web form")).click(); /// By: is an enum class that provides several locator strategies for finding web elements on a web page.
        System.out.println(driver.getCurrentUrl());
       /* WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe("https://www.actitime.com/free-online-trial"));*/

        driver.findElement(By.id("my-text-id")).sendKeys("Test");
        driver.findElement(By.xpath("/html/body/main/div/form/div/div[1]/label[2]/input")).sendKeys("Test 2");

        Thread.sleep(5000);


       /* driver.findElement(By.id("Email")).sendKeys("email@123.com");

        driver.findElement(By.id("Company")).sendKeys("Hello");*/


    }
}
