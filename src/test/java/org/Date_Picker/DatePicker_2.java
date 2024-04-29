package org.Date_Picker;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DatePicker_2 {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://seleniumpractise.blogspot.com/2016/");
        driver.findElement(By.id("datepicker")).click();

        // Wait for the date picker to be clickable
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.elementToBeClickable(By.id("ui-datepicker-div")));

        SelectData("15", "June", "2024");

        driver.quit();
    }

    public static void SelectData(String exDate, String exMonth, String exYear) throws InterruptedException {
        String currentDate = driver.findElement(By.cssSelector("div[class='ui-datepicker-title']")).getText();
        System.out.println("Current date: " + currentDate);

        String month = currentDate.split(" ")[0].trim();
        String year = currentDate.split(" ")[1].trim();

        boolean foundDesiredDate = false;

        while (!(month.equals(exMonth) && year.equals(exYear))) {
            driver.findElement(By.cssSelector("span[class='ui-icon ui-icon-circle-triangle-e']")).click();
            Thread.sleep(5000);
            currentDate = driver.findElement(By.cssSelector("div[class='ui-datepicker-title']")).getText();
            System.out.println("Updated date: " + currentDate);

            // Check if the desired date is found
            if (currentDate.equals(exMonth + " " + exYear)) {
                foundDesiredDate = true;
                break;
            }
        }

        if (foundDesiredDate) {
            System.out.println("Desired date found!");
            driver.findElement(By.xpath("//a[text() = '" + exDate + "']")).click();
            Thread.sleep(5000);
        } else {
            System.out.println("Desired date not found.");
        }
    }
}
