package Section26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        /**
         * Task: Handle Confirmation Alert
         * Steps to Complete the Task:
         *
         * Navigate to https://demoqa.com/alerts.
         * Locate the third ‘Click me’ button on the page.
         * Click the ‘Click me’ button to trigger the confirmation alert.
         * Retrieve the text from the alert using alert.getText().
         * Verify that the text equals “Do you confirm action?”.
         * If the text matches, dismiss the alert using alert.dismiss().
         * Verify that the message “You selected Cancel” is displayed on the page.
         * Hint: Use alert.dismiss() to dismiss the confirmation alert and alert.getText() to retrieve the alert's text.
         */
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        WebElement clickMeButton = driver.findElement(By.xpath("//button[@id='confirmButton']"));
        clickMeButton.click();
        //Switch to alert
        String alertText = driver.switchTo().alert().getText();
        if (alertText.equals("Do you confirm action?")){
            driver.switchTo().alert().dismiss();
            //Verify that the message “You selected Cancel” is displayed on the page.
            WebElement resultMessage = driver.findElement(By.id("confirmResult"));
            if (resultMessage.getText().equals("You selected Cancel")){
                System.out.println("Alert dismissed and confirmation message verified.");
            }else {
                System.out.println("Confirmation message not verified.");
            }
        }else {
            System.out.println("Alert text does not match.");
        }
        driver.quit();

    }
}
