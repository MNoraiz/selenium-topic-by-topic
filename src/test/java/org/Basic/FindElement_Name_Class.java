package org.Basic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FindElement_Name_Class {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://www.amazon.ae/ref=nav_logo");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@id='nav-link-groceries']")).click();
        /*driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("battery");
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();*/

        Thread.sleep(5000);


    }
}
