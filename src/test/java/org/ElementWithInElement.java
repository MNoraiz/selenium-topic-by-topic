package org;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ElementWithInElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverManager.chromiumdriver().create();

        driver.get("https://www.walmart.com/");
        driver.findElement(By.cssSelector("input[name= 'q']")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("input[name= 'q']")).sendKeys("Mens shoes");
        driver.findElement(By.cssSelector("i[class = 'ld ld-Search absolute']")).click();
        Thread.sleep(5000);

        List<WebElement> shoesList = driver.findElements(By.cssSelector("div[class = 'mb0 ph1 ph0-xl pt0-xl pb3-m bb b--near-white w-25']"));

        for(WebElement shoes : shoesList ){
            String itmPrice = shoes.findElement(By.cssSelector("span[class='f2']")).getText().trim();
            String itmPrice2 =  itmPrice.replace("$","").replace(" ", "");
            double itmPrice3 = Double.parseDouble(itmPrice2);
            if(itmPrice3 < 20 || itmPrice3 > 50){
                System.out.println(itmPrice3);

            }
        }

        //div[class = 'mb0 ph1 ph0-xl pt0-xl pb3-m bb b--near-white w-25'] [data-automation-id= 'product-price']



    }
}
