/*
package org.Date_Picker;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Data_Picker {
    public static void main(String[] args) throws InterruptedException {

        String expDate = "July 2024";

        WebDriver driver = WebDriverManager.chromiumdriver().create();
        driver.get("https://www.agoda.com/?site_id=1891456&tag=f127be9e-e847-fb74-a66c-cad32a7720f2&gad_source=1&device=c&network=g&adid=577063439480&rand=16448360708383800452&expid=&adpos=&aud=kwd-2230651387&gclid=CjwKCAjw57exBhAsEiwAaIxaZhiyhddGlB8Me6z06TTyam3GztLtorlW8szA98ykMeEFN5uglT07LBoC6kEQAvD_BwE&pslc=1&ds=zRCbMOcUyokoSSpA");

        driver.manage().window().maximize();

        Thread.sleep(10000);
        driver.findElement(By.cssSelector("button[aria-label = 'Close Message']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("i[class = 'ficon IconBox__icon ficon-20 ficon-check-in']")).click();
        Thread.sleep(5000);

        String currentDate = driver.findElement(By.xpath("//div[normalize-space()='May 2024']")).getText();
        System.out.println(currentDate);
        int c = 0;
        while (!currentDate.contains(expDate)){
            driver.findElement(By.xpath("//button[@aria-label='Next Month']")).click();
            c++;
            System.out.println(c);
            Thread.sleep(5000);
            if(c== 12){
                break;
            }
        }

        Thread.sleep(5000);


    }
}
*/
