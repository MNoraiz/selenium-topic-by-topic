package org.WebTables;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Send_Action_WebTables {
    static WebDriver driver;
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.dezlearn.com/webtable-example/");
        driver.manage().window().maximize();
        WebTable.driver = driver;

        WebTable.function("Tim Watson", "Sports", "Hello Test");
    }
    /*public static void WebTables(String enterName, String enterType,String comments){
        List<WebElement> rows = driver.findElements(By.xpath("//body/div[@id='page']/div[@id='content']/div[1]/div[1]/main[1]/article[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody/tr"));
        int c = 0;
        for(WebElement row: rows){
            c++;
            if(c == 1){
                continue;
            }
            String name = row.findElement(By.xpath("td[1]")).getText();
            System.out.println(name);
            if(name.equals(enterName.trim())){
                row.findElement(By.xpath("td[3]/input")).click();
                List<WebElement> dropDown = row.findElements(By.xpath("td[5]/select/option"));
                for(WebElement drop : dropDown){
                    if(drop.getText().contains(enterType)){
                        drop.click();
                        break;
                    }
                }
                row.findElement(By.xpath("td[6]/input")).sendKeys(comments);
            }
        }
        driver.findElement(By.cssSelector("#demo")).click();

    }*/
}
