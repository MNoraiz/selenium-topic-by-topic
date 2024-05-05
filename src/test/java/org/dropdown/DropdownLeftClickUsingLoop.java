package org.dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DropdownLeftClickUsingLoop {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/dropdown-menu.html");

        //First example
        /*driver.findElement(By.cssSelector("button[id= 'my-dropdown-1']")).click();
        Thread.sleep(10000);

        List<WebElement> dropdown1 = driver.findElements(By.xpath("/html/body/main/div/div[4]/div[1]/div/ul"));
        for(WebElement dd : dropdown1){
            if(dd.getText().trim().equals("Action")){
                dd.click();
            }
        }
        driver.findElement(By.cssSelector("button[id= 'my-dropdown-1']")).click();
        Thread.sleep(10000);
        */

        // Second Example

        driver.get("https://letcode.in/dropdowns");
        List<WebElement> fruits = driver.findElements(By.cssSelector("select[id =  'fruits'] option"));

        for(WebElement fruitList : fruits){
            if(fruitList.getText().trim().equals("Banana")){
                fruitList.click();
            }
        }
        Thread.sleep(5000);

    }
}
