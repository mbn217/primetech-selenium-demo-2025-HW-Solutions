package Section34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        /**
         * Task: Hover Over Elements and Retrieve Displayed Text
         * Step 1: Go to the URL https://testpages.eviltester.com/styled/csspseudo/css-hover.html.
         * Step 2: Hover over the first element on the page.
         * Step 3: Capture and print the text that is displayed after hovering over the first element.
         * Step 4: Hover over the second element on the page.
         * Step 5: Capture and print the text that is displayed after hovering over the second element.
         * Hint: Use the Actions class to perform the hover action and retrieve the text using getText() method.
         */
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/csspseudo/css-hover.html");
        WebElement firstElement = driver.findElement(By.id("hoverpara"));
        //Hover over the first element
        Actions actions = new Actions(driver);
        actions.moveToElement(firstElement).perform();
        //Capture and print the text that is displayed after hovering over the first element
        WebElement firsDisplayedElement = driver.findElement(By.id("hoverparaeffect"));
        String firstElementText = firsDisplayedElement.getText();
        System.out.println("Text after hovering over the first element: " + firstElementText);
        Thread.sleep(2000); // Adding a delay to see the hover effect

        //---------------------------

        WebElement secondElement = driver.findElement(By.id("hoverdiv"));
        //Hover over the second element
        actions.moveToElement(secondElement).perform();
        //Capture and print the text that is displayed after hovering over the second element
        WebElement secondDisplayedElement = driver.findElement(By.id("hoverdivparaeffect"));
        String secondElementText = secondDisplayedElement.getText();
        System.out.println("Text after hovering over the second element: " + secondElementText);
        Thread.sleep(2000); // Adding a delay to see the hover effect
        driver.quit();
    }
}
