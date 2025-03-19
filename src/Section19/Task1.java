package Section19;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        /**
         * Task: Navigate Google and Perform Browser Actions
         * Steps:
         * Open the browser and go to Google.
         * Search for a specific keyword (e.g., "Selenium WebDriver").
         * Click on the first search result.
         * Navigate backward to the Google search results page.
         * Navigate forward to the first clicked link again.
         * Refresh the page.
         * Close the browser.
         */

        WebDriver driver = new ChromeDriver();
        // maximize the window
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        //Find the search box by name and enter "Selenium WebDriver" by xpath
        WebElement searchBox = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
        searchBox.sendKeys("Selenium WebDriver" + Keys.ENTER);
        //Wait for a few seconds to see the search results
        Thread.sleep(3000);
        //Navigate back to search page
        driver.navigate().back();
        //Navigate forward to the result page
        driver.navigate().forward();
        //Wait for a few seconds to see the result page
        Thread.sleep(3000);
        //Refresh the page
        driver.navigate().refresh();
        //Wait for a few seconds to see the refreshed page
        Thread.sleep(3000);
        //Close the browser
        driver.quit();







        


    }
}
