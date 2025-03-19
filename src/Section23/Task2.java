package Section23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        /**
         * Task: Select the USA Radio Button
         * Objective:
         * Navigate to the webpage, locate the radio buttons, and select the USA option under the "Countries" section.
         *
         * Steps to Follow:
         * Open a web browser and go to http://practice.primetech-apps.com/practice/radio-button.
         * Locate the "USA" radio button under the "Countries" section.
         * Check if the USA radio button is already selected:
         * If not selected, click on it to select.
         * If already selected, do nothing.
         * Verify that the USA radio button is selected after performing the operation.
         * Print a confirmation message in the console:
         * Example output: "USA radio button is selected successfully."
         */

        WebDriver driver = new ChromeDriver();
        // maximize the window
        driver.manage().window().maximize();
        driver.get("http://practice.primetech-apps.com/practice/radio-button");
        //Wait for the page to load
        Thread.sleep(2000);
        //Find the USA radio button by xpath
        WebElement usaRadioButton = driver.findElement(By.xpath("//input[@id='USA']"));
        //Check if the USA radio button is already selected
        if (!usaRadioButton.isSelected()){
            usaRadioButton.click();
        }
        //Verify that the USA radio button is selected
        if (usaRadioButton.isSelected()){
            System.out.println("USA radio button is selected successfully.");
        }else {
            System.out.println("USA radio button is not selected.");
        }
        //Close the driver
        driver.quit();

    }
}
