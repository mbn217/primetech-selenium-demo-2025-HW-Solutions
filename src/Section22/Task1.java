package Section22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        /**
         * Task: Fill and Retrieve Data from a Web Table
         * Objective: Navigate to the website, enter data into the
         * table using the form, and then retrieve and print all data cells from the table.
         *
         * Steps:
         * Open a browser and go to http://practice.primetech-apps.com/practice/web-tables.
         * Locate the form fields for entering data into the table.
         * Enter the following details:
         * First Name: (Enter a name)
         * Last Name: (Enter a name)
         * Id: (Enter an id)
         * Salary: (Enter a number)
         *
         *
         * Click the Add button to add the data to the table.
         * Locate the WebTable element on the page.
         * Loop through all rows and columns in the table.
         * Retrieve and print each data cell's text in the console.
         * Hint: Use findElements() to get all rows and then extract columns from each row.
         */

        WebDriver driver = new ChromeDriver();
        // maximize the window
        driver.manage().window().maximize();
        driver.get("http://practice.primetech-apps.com/practice/web-tables");
        //Wait for a few seconds to see the page
        Thread.sleep(3000);
        //Locate the form fields for entering data into the table and enter data
        WebElement firstName = driver.findElement(By.id("First Name"));
        firstName.sendKeys("John");
        WebElement lastName = driver.findElement(By.id("Last Name"));
        lastName.sendKeys("Doe");
        WebElement id = driver.findElement(By.id("Id"));
        id.sendKeys("12345");
        WebElement salary = driver.findElement(By.id("Salary"));
        salary.sendKeys("50000");
        //Click the Add button to add the data to the table
        WebElement addButton = driver.findElement(By.xpath("//button[@type='submit']"));
        addButton.click();
        //Wait for a few seconds to see the added data
        Thread.sleep(3000);
        //Locate the WebTable element on the page
        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table caption-top']/tbody/tr"));
        //Loop through all rows and columns in the table
        for (WebElement row : rows) {
            List<WebElement> columns = row.findElements(By.tagName("td"));
            for (WebElement column : columns) {
                //Retrieve and print each data cell's text in the console
                System.out.print(column.getText() + " ");
            }
            System.out.println(); // Print a new line after each row
        }
        //Wait for a few seconds to see the printed data
        Thread.sleep(3000);
        //Close the browser
        driver.quit();







        


    }
}
