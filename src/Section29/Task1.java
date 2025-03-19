package Section29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        /**
         * Task: Handling Multiple Windows in Selenium
         * Objective: Perform actions on a webpage that opens a new window and interact with elements in both the main window and the new window.
         *
         * Test Case Steps:
         * Go to the URL
         * Navigate to the website: http://demo.guru99.com/popup.php.
         * Store the Title of the Main Window
         * Get the title of the main window and store it in a variable for later comparison.
         * Click on the Button to Open New Window
         * Click on the “Click Here” button that opens a new window.
         * Switch to the New Window
         * Switch to the new window that opened upon clicking the button.
         * In the new window, provide an email address and click on the "Submit" button.
         * Retrieve the text containing the user ID and password, store them in variables, and print them out.
         * Verify that the text “This access is valid only for 20 days.” is displayed.
         * Close the new window after performing the necessary actions.
         * Switch back to the main window.
         * Get the title of the main window and verify that it matches the title stored earlier.
         * Close the browser session by quitting the driver.
         */
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/popup.php");
        String mainWindowTitle = driver.getTitle();
        String mainWindowHandle = driver.getWindowHandle();
        WebElement clickHereButton = driver.findElement(By.xpath("//a[text()='Click Here']"));
        clickHereButton.click();
        //Switch to new window
        for (String windowHandle : driver.getWindowHandles()) {
            driver.switchTo().window(windowHandle);
        }
        //wait for the new window to load
        Thread.sleep(2000);
        //Fill Out the Form
        WebElement emailInput = driver.findElement(By.name("emailid"));
        emailInput.sendKeys("test@gmail.com");
        WebElement submitButton = driver.findElement(By.name("btnLogin"));
        submitButton.click();
        //Verify the Access Message
        WebElement accessMessage = driver.findElement(By.xpath("//h3[contains(text(),'This access is valid only for 20 days.')]"));
        if (accessMessage.isDisplayed()){
            System.out.println("Access message verified.");
        }else {
            System.out.println("Access message not verified.");
        }
        //Close the new window
        driver.close();
        //Switch back to the main window
        driver.switchTo().window(mainWindowHandle);
        //Verify the main window title
        if (driver.getTitle().equals(mainWindowTitle)){
            System.out.println("Main window title verified.");
        }else {
            System.out.println("Main window title not verified.");
        }
        //Close the driver
        driver.quit();
    }
}
