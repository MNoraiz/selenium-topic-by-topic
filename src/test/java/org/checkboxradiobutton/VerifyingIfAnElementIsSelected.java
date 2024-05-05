package org.checkboxradiobutton;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerifyingIfAnElementIsSelected {
    public static void main(String[] args) {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
        driver.manage().window().maximize();

        // For Check Box

        boolean isSelected_Box = driver.findElement(By.xpath("//input[@id= 'my-check-2']")).isSelected();
        if(!isSelected_Box){
            driver.findElement(By.xpath("//input[@id= 'my-check-2']")).click();
        }
        boolean isSelected_Box1 = driver.findElement(By.xpath("//input[@id= 'my-check-2']")).isSelected();
        System.out.println(isSelected_Box);
        System.out.println(isSelected_Box1);

        System.out.println("-------- Radio --------------");


        // For Radio Button

        boolean isSelected_Radio = driver.findElement(By.xpath("//input[@id= 'my-radio-1']")).isSelected();
        if(!isSelected_Radio){
            driver.findElement(By.xpath("//input[@id= 'my-radio-1']")).click();
        }
        boolean isSelected_Radio1 = driver.findElement(By.xpath("//input[@id= 'my-radio-1']")).isSelected();
        System.out.println(isSelected_Radio);
        System.out.println(isSelected_Radio1);




    }
}
