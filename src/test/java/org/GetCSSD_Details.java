package org;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetCSSD_Details {
    public static void main(String[] args) {
        WebDriver driver = WebDriverManager.chromiumdriver().create();

        driver.get("https://bonigarcia.dev/selenium-webdriver-java/data-types.html");
        String css1 = driver.findElement(By.cssSelector("button[class='btn btn-outline-primary mt-3']")).getCssValue("color");
        String css2 = driver.findElement(By.cssSelector("button[class='btn btn-outline-primary mt-3']")).getCssValue("padding");
        String css3 = driver.findElement(By.cssSelector("button[class='btn btn-outline-primary mt-3']")).getCssValue("border-color");
        String css4 = driver.findElement(By.cssSelector("button[class='btn btn-outline-primary mt-3']")).getCssValue("font-weight");
        System.out.println(css1);
        System.out.println(css2);
        System.out.println(css3);
        System.out.println(css4);

    }
}
