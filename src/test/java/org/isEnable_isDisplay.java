package org;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class isEnable_isDisplay {
    public static void main(String[] args) {
        WebDriver driver = WebDriverManager.chromedriver().create();

        driver.get("https://bonigarcia.dev/selenium-webdriver-java/data-types.html");
        boolean isDis = driver.findElement(By.cssSelector("button[class='btn btn-outline-primary mt-3']")).isDisplayed();
        boolean isEna = driver.findElement(By.cssSelector("button[class='btn btn-outline-primary mt-3']")).isEnabled();
        System.out.println(isDis);
        System.out.println(isEna);

    }
}
