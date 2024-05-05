package org.basic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExistsOrNot {
    public static void main(String[] args) {
        WebDriver driver = WebDriverManager.chromedriver().create();

        driver.get("https://bonigarcia.dev/selenium-webdriver-java/data-types.html");

         // driver.findElement(By.cssSelector("asdasdada")).isDisplayed();  // if the Selenium couldn't locate the element, then through an error
        // NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"asdasdada"}

        // Better Way

        try{
            String css1 = driver.findElement(By.cssSelector("button[class='btn btn-outline-primary mt-3']")).getCssValue("color");
            System.out.println("Pass: Element is present");
            // or write code here want ever you want to do with specific element

            System.out.println(css1);
        }
        catch (Exception e){
            System.out.println("Fail: Element is not present");
        }


    }
}
