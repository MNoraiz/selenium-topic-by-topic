package org.dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownUsingSelectClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://trytestingthis.netlify.app/");

        // Select from Drop Down
       WebElement dropdown = driver.findElement(By.id("option"));
       Select selectFromDropDown = new Select(dropdown);

       selectFromDropDown.selectByIndex(1);
       Thread.sleep(2000);
       selectFromDropDown.selectByValue("option 2");
       Thread.sleep(2000);
       selectFromDropDown.selectByVisibleText("Option 3");
       Thread.sleep(2000);


       // Select from multiple options
        WebElement scroll = driver.findElement(By.id("owc"));
        Select selectFromScroll = new Select(scroll);
        selectFromScroll.selectByIndex(1);
        Thread.sleep(2000);
        selectFromScroll.deselectByIndex(1);
        Thread.sleep(2000);
        selectFromScroll.selectByValue("option 2");
        Thread.sleep(2000);
        selectFromScroll.selectByVisibleText("Option 3");
        Thread.sleep(2000);

        // If you want to print the value by using select class
        List<WebElement> dropDownOptions =  selectFromDropDown.getOptions();

        for(WebElement option: dropDownOptions){
            System.out.println(option.getText());
        }

    }
}
