package Section09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {
        /**
         * Open a Chrome browser.
         * Navigate to https://practice.primetech-apps.com.
         * Click on the "Join Now" button using
         * a locator we learned (ID, className, XPath, CSS Selector, etc.).
         */

        WebDriver driver = new ChromeDriver();
        // maximize the window
        driver.manage().window().maximize();
        driver.get("https://practice.primetech-apps.com");
        //Find the "Join Now" button by link text and click it
        WebElement joinNowButton = driver.findElement(By.linkText("Join Now"));
        joinNowButton.click();



    }
}
