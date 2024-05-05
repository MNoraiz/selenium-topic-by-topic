package org.iframes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframes {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.dezlearn.com/nested-iframes-example/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        // Switch to parent Frame
        driver.switchTo().frame("demo_parent_iframe");

        // Switch to Child Frame
        driver.switchTo().frame("demo_frame1");
        driver.findElement(By.xpath("//button[@id='u_5_6']")).click();

        // Switch Back to Parent Frame
        driver.switchTo().parentFrame();
        driver.findElement(By.xpath("//button[@id='u_5_5']")).click();

    }
}
