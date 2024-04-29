package org.DropDown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Multiple_SelectBox {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverManager.chromedriver().create();

        driver.get("https://www.linkedin.com/jobs/search?trk=guest_homepage-basic_guest_nav_menu_jobs&position=1&pageNum=0");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id=\"jserp-filters\"]/ul/li[4]/div/div/button")).click();

       List<WebElement> dropMenu =  driver.findElements(By.cssSelector("div[aria-label = 'Experience level filter options'] label"));

       for(WebElement menu : dropMenu){
           if(menu.getText().contains("Internship") || menu.getText().contains("Mid-Senior level")) {
               menu.click();
           }

           System.out.println(menu.getText());
       }


        Thread.sleep(5000);


    }
}
