package Section09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchBing {
    public static void main(String[] args) {
        /**
         * Task 1: Open Browser and Search in Bing
         * Objective: Automate the following steps in Chrome using Selenium.
         */

        WebDriver driver = new ChromeDriver();
        // maximize the window
        driver.manage().window().maximize();
        driver.get("https://www.bing.com");
        //Find the search box by id and enter "Selenium WebDriver"
        WebElement searchBox = driver.findElement(By.id("sb_form_q"));
        searchBox.sendKeys("Selenium WebDriver");


    }
}
