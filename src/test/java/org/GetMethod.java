package org;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetMethod {
    public static void main(String[] args) {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/data-types.html");

        String att1 = driver.findElement(By.cssSelector("input[name= 'first-name']")).getAttribute("type");
        String att2 = driver.findElement(By.xpath("/html/body/main/div/form/div[1]/div[1]/label")).getText();
        System.out.println(att1);
        System.out.println(att2);

    }
}
