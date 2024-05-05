package org.basic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Retrieving_Collection_1 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://www.goodreads.com/");
         List<WebElement> links = driver.findElements(By.cssSelector("li[class='responsiveSiteFooter__linkListItem']"));
        System.out.println(links.stream().count());
         for(WebElement i : links){
             String text =i.getText();
             if(!text.isEmpty()){
                 System.out.println(i.getText());
                 System.out.println("URL: " + i.getAttribute("href"));
                 System.out.println("Class Name: " + i.getAttribute("class"));
                 System.out.println("-----------------");
             }

         }
    }
}
