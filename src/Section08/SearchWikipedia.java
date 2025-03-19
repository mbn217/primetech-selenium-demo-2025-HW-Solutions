package Section08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchWikipedia {
    public static void main(String[] args) {
        /**
         * Task 2: Open Browser and Search in Wikipedia
         * Objective: Automate searching on Wikipedia.
         */

        WebDriver driver = new ChromeDriver();
        // maximize the window
        driver.manage().window().maximize();
        driver.get("https://www.wikipedia.org");
        //Find the search box by id and enter "Selenium WebDriver"
        WebElement searchBox = driver.findElement(By.id("searchInput"));
        searchBox.sendKeys("Selenium WebDriver");


    }
}
