package org.IFrames;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class Iframe {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.dezlearn.com/iframe-example/#");
        driver.findElement(By.linkText("Test Pages")).click();
        //Create WebElement of Iframe Xpath
        WebElement iframe = driver.findElement(By.xpath("//body/div[@id='page']/div[@id='content']/div[1]/div[1]/main[1]/article[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/iframe[1]"));

        //By using Name or id attribute of IFrame
        // driver.switchTo().frame("iframe1");

        // Call that WelElement Variable Here
        driver.switchTo().frame(iframe);
        driver.findElement(By.id("u_5_6")).click();

        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        driver.findElement(By.id("u_5_6")).click();

        // Retun to Main page
        driver.switchTo().defaultContent();

    }
}
