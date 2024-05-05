package org.Basic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;


/*
            Get Method
 */
public class BrowserNavigation_GetMethod {
    public static void main(String[] args) {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());

        driver.navigate().to("https://www.facebook.com/");
        System.out.println(driver.getTitle());

        driver.navigate().back();
        System.out.println(driver.getTitle());

        driver.navigate().refresh();
        System.out.println(driver.getTitle());


    }
}
