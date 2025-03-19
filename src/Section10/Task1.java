package Section10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {
        /**
         * Task: Get the Text of the "PRACTICE" Label using tagName Locator
         */

        WebDriver driver = new ChromeDriver();
        // maximize the window
        driver.manage().window().maximize();
        driver.get("https://practice.primetech-apps.com/practice");
        //Find the "PRACTICE" label by tag name and get its text
        WebElement practiceLabel = driver.findElement(By.tagName("h3"));
        String labelText = practiceLabel.getText();
        System.out.println("The text of the PRACTICE label is: " + labelText);

        


    }
}
