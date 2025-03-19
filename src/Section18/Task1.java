package Section18;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        /**
         * Task:
         * Navigate to the URL: First, you need to navigate
         * to the following URL: http://practice.primetech-apps.com/practice/practice-forms.
         * Locate the "First Name" and "Last Name" Fields: On the webpage, locate the First Name and Last Name input fields.
         * These can be located using their id attributes (use xpath locator):
         * First Name field: firstName
         * Last Name field: lastName
         * Enter Values Using the Keys Class:
         * Enter the value "John" into the First Name field using the sendKeys() method.
         * Enter the value "Doe" into the Last Name field using the sendKeys() method.
         */

        WebDriver driver = new ChromeDriver();
        // maximize the window
        driver.manage().window().maximize();
        driver.get("http://practice.primetech-apps.com/practice/practice-forms");
        //Find the "First Name" text box by id and enter your first name
        WebElement firstNameTextBox = driver.findElement(By.xpath("//input[@id='firstName']"));
        firstNameTextBox.sendKeys(Keys.chord("John"));
        //Find the "Last Name" text box by id and enter your last name
        WebElement lastNameTextBox = driver.findElement(By.xpath("//input[@id='lastName']"));
        lastNameTextBox.sendKeys(Keys.chord("Doe"));
        //Wait for a few seconds to see the entered text
        Thread.sleep(3000);




        


    }
}
