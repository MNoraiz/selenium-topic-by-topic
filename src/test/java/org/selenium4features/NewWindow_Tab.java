package org.selenium4features;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class NewWindow_Tab {
    static WebDriver driver;
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        // Open a new window and navigate to Facebook
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.facebook.com/");

        // Open a new tab and navigate to Github
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://github.com/MNoraiz/selenium-topic-by-topic/blob/master/src/test/java/org/actionclass/DragAndDrop.java");

        // Store all current window handles

        Set<String> windows = driver.getWindowHandles();

        // Variables to store window IDs
        String fbid = "";
        String gid = "";
        String gtid = "";

        // Iterate through window handles to assign IDs based on URL
        for(String id: windows){
            driver.switchTo().window(id); // Switch to each window before getting URL
            String url = driver.getCurrentUrl();
            if(url.contains("facebook")){
                fbid = id;
            }
            else if(url.contains("google")){
                gid = id;
            }
            else {
                gtid = id;
            }
        }

        // Switch to Facebook window using its handle
        driver.switchTo().window(fbid);
        driver.findElement(By.id("email")).sendKeys("Abc");
    }
}
