package org.windowmanagement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetWindowSize {
    static WebDriver driver;
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.goodreads.com/");
        Dimension dimension = new Dimension(1500, 768);
        driver.manage().window().setSize(dimension);

        // Second Way
        // driver.manage().window().setSize(new Dimension(500, 500));
    }
}
