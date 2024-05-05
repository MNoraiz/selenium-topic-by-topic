package org.webtables_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static io.github.bonigarcia.wdm.WebDriverManager.chromiumdriver;

public class WebTable2 {
    static WebDriver driver;
    public static void main(String[] args) {
        chromiumdriver().setup();
        driver = new ChromeDriver();

        driver.get("https://seleniumpractise.blogspot.com/2021/");
        //A List is an ordered collection that allows duplicate elements.
       List<WebElement> table =  driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
       int c = 0;
       for(WebElement row : table){
           c++;
           if(c == 1){
               continue;
           }
           String company = row.findElement(By.xpath("td[2]")).getText();
           if(company.equals("FlipKart")){
               row.findElement(By.xpath("td[1]/input")).click();
           }
           System.out.println(company);
       }
    }
}
