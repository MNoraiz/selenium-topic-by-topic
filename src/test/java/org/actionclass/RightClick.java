package org.actionclass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        Actions action = new Actions(driver);

        WebElement rightClick = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
        action.contextClick(rightClick).perform();
        Thread.sleep(1000);


        driver.findElement(By.xpath("//body[1]/ul[1]/li[3]/span[1]")).click();

        Alert a =  driver.switchTo().alert();
        System.out.println(a.getText());
        a.accept();

    }
}
