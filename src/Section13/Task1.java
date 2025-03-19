package Section13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        /**
         * Task 1: Find Element By Xpath
         * 1. Open Chrome browser
         * 2. Go to http://practice.primetech-apps.com/practice/text-box
         * 3. Find the element for the "First Name" text box by Xpath
         * 4. Enter your First Name in the "First Name" text box
         * 5. Close the browser
         */

        WebDriver driver = new ChromeDriver();
        // maximize the window
        driver.manage().window().maximize();
        driver.get("http://practice.primetech-apps.com/practice/text-box");
        //Find the "First Name" text box by xpath and enter your first name
        WebElement firstNameTextBox = driver.findElement(By.xpath("//input[@id='firstName']"));
        firstNameTextBox.sendKeys("John");
        //Wait for a few seconds to see the entered text
        Thread.sleep(3000);


        


    }
}
