package Section23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        /**
         * Task: Select Java and Python Checkboxes
         * Objective:
         * Navigate to the webpage, locate checkboxes, and select the required options.
         *
         * Steps to Follow:
         * Open a web browser and go to http://practice.primetech-apps.com/practice/check-box.
         * Locate the checkboxes for Java and Python on the page.
         * Check if the checkboxes are already selected:
         * If not selected, click on them to select.
         * If already selected, leave them as they are.
         * Verify that both checkboxes are selected after performing the operation.
         * Print a confirmation message in the console:
         * Example output: "Java and Python checkboxes are selected successfully."
         */

        WebDriver driver = new ChromeDriver();
        // maximize the window
        driver.manage().window().maximize();
        driver.get("http://practice.primetech-apps.com/practice/check-box");
        //Wait for the page to load
        Thread.sleep(2000);
        //Find the checkboxes by xpath
        WebElement javaCheckbox = driver.findElement(By.xpath("//input[@id='Java']"));
        WebElement pythonCheckbox = driver.findElement(By.xpath("//input[@id='Python']"));
        //Check if the checkboxes are already selected
        if (!javaCheckbox.isSelected()){
            javaCheckbox.click();
        }
        if (!pythonCheckbox.isSelected()){
            pythonCheckbox.click();
        }
        //Verify that both checkboxes are selected
        if (javaCheckbox.isSelected() && pythonCheckbox.isSelected()){
            System.out.println("Java and Python checkboxes are selected successfully.");
        }else {
            System.out.println("One or both checkboxes are not selected.");
        }
        //Close the driver
        driver.quit();




        


    }
}
