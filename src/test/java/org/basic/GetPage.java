package org.basic;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;

public class GetPage {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriverManager().create();
        driver.get("");
    }
}
