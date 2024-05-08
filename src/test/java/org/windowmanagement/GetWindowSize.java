package org.windowmanagement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowSize {
    static WebDriver driver;
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.goodreads.com/");


        /* First Way
        int width = driver.manage().window().getSize().getWidth();
        int height = driver.manage().window().getSize().getWidth();
        System.out.println("Width : "+ width + " Height : "+ height);*/

        /* Second way
        Dimension size  = driver.manage().window().getSize();
        int width = size.width;
        int height = size.height;
        System.out.println("Width : "+ width + " Height : "+ height);*/

        // Third Way
        Dimension size  = driver.manage().window().getSize();
        int width = size.getWidth();
        int height = size.getHeight();
        System.out.println("Width : "+ width + " Height : "+ height);


    }
}
