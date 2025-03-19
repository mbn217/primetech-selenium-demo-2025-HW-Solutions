package Section21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        /**
         * Task: Extract and Print Label Texts from a Webpage
         * Objective: Write a Selenium script that navigates to the provided webpage, extracts all the label tags, and prints the text of each label.
         *
         * Instructions:
         * Navigate to the URL:
         * Use Selenium WebDriver to open the webpage: http://practice.primetech-apps.com/practice/practice-forms.
         * Find all Label Tags:
         * Use the findElements() method to locate all the <label> tags on the page.
         * Print the Text of Each Label:
         * Loop through the list of label elements and use the getText() method to extract and print the text from each label.
         * Output:
         * The script should output the text of all the labels present on the page.
         */

        WebDriver driver = new ChromeDriver();
        // maximize the window
        driver.manage().window().maximize();
        driver.get("http://practice.primetech-apps.com/practice/practice-forms");
        //Find all label tags on the page
        List<WebElement> labelElements = driver.findElements(By.tagName("label"));
        //Print the text of each label
        for (WebElement label : labelElements) {
            System.out.println(label.getText());
        }
        //Close the browser
        driver.quit();








        


    }
}
