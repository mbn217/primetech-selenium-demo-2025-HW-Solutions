package Section26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        /**
         * Task: Handle Prompt Alert
         * Steps to Complete the Task:
         *
         * Navigate to https://demoqa.com/alerts.
         * Locate the ‘Prompt Alert’ button on the page.
         * Click the ‘Prompt Alert’ button to trigger the prompt alert.
         * Type "PrimeTech" into the prompt alert’s input field using alert.sendKeys("PrimeTech").
         * Accept the alert using alert.accept().
         * Verify that the text “You entered PrimeTech” is displayed on the page.
         * Hint: Use alert.sendKeys("PrimeTech") to send text to a prompt alert and alert.accept() to accept the alert.
         */
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        WebElement promptAlertButton = driver.findElement(By.xpath("//button[@id='promtButton']"));
        promptAlertButton.click();
        //Switch to alert
        driver.switchTo().alert().sendKeys("PrimeTech");
        driver.switchTo().alert().accept();
        //Verify that the text “You entered PrimeTech” is displayed on the page.
        WebElement resultMessage = driver.findElement(By.id("promptResult"));
        if (resultMessage.getText().equals("You entered PrimeTech")){
            System.out.println("Alert accepted and input message verified.");
        }else {
            System.out.println("Input message not verified.");
        }
        driver.quit();

    }
}
