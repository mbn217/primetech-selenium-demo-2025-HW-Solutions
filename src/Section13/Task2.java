package Section13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        /**
         * Task 2: Find Element By Xpath
         * 1. Open Chrome browser
         * 2. Go to http://practice.primetech-apps.com/practice/text-box
         * 3. Find the element for the "Last Name" text box by Xpath
         * 4. Enter Your Last Name in the "Last Name" text box
         * 5. Close the browser
         */

        WebDriver driver = new ChromeDriver();
        // maximize the window
        driver.manage().window().maximize();
        driver.get("http://practice.primetech-apps.com/practice/text-box");
        //Find the "Last Name" text box by xpath and enter your last name
        WebElement lastNameTextBox = driver.findElement(By.xpath("//input[@id='lastName']"));
        lastNameTextBox.sendKeys("Doe");
        //Wait for a few seconds to see the entered text
        Thread.sleep(3000);
        //Close the browser
        driver.quit();






    }
}
