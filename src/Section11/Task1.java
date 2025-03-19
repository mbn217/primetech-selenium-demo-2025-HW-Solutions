package Section11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        /**
         * Task: Retrieve Page Title and Current URL
         */

        WebDriver driver = new ChromeDriver();
        // maximize the window
        driver.manage().window().maximize();
        driver.get("https://practice.primetech-apps.com");
        //Get the page title and print it
        String pageTitle = driver.getTitle();
        System.out.println("The page title is: " + pageTitle);
        //Get the current URL and print it
        String currentUrl = driver.getCurrentUrl();
        System.out.println("The current URL is: " + currentUrl);
        Thread.sleep(3000);

        


    }
}
