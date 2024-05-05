package org.webtables;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GetDataWebTables {
    static WebDriver driver;
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://www.dezlearn.com/webtable-example/");

        // Search Whole table
        List<WebElement> rows = driver.findElements(By.xpath("//body/div[@id='page']/div[@id='content']/div[1]/div[1]/main[1]/article[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody/tr"));
        // Start after Tr 1 because Tr 1 has headers of the tables
        int c = 0;
        for(WebElement row : rows){
            // Increment c values to start process at c == 2
            c++;
            if(c == 1){
                continue;
            }
            // Inside whole data table we find Table data at each row
            String x = row.findElement(By.xpath("td[1]")).getText();
            String y = row.findElement(By.xpath("td[2]")).getText();
            System.out.println("Name: " + x);
            System.out.println("Email: " + y);
            System.out.println("------------");
        }

        driver.quit();
    }
}
