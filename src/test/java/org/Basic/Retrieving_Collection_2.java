package org.Basic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Retrieving_Collection_2 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverManager.chromedriver().create();

        driver.get("https://www.goodreads.com/");

        List<WebElement> links =  driver.findElements(By.cssSelector("img"));
        System.out.println(links.size());
        System.out.println(links.stream().count());
        for(WebElement URL : links){
            if(URL.isDisplayed()){
                String title = URL.getAttribute("title");
                if(title != null){
                    System.out.println("Display: " + URL.isDisplayed());
                    System.out.println("Title: " + title);
                    System.out.println("----------");
                }
            }
            }


        }

    }

