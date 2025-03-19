package Section36;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionUtils {

    /**
     * Task: Create a Simple Utility Method to Double-Click an Element Using Action Class
     * Objective:
     * Create a utility method that performs a double-click action on a given WebElement using the Actions class in Selenium.
     *
     * Steps:
     * Step 1: Create a new Java class called ActionUtils (or any suitable name or you can use SeleniumUtils class created in the lecture) for utility methods.
     * Step 2: Inside the ActionUtils class, create a static method called doubleClickElement that accepts a WebDriver and a WebElement as parameters.
     */

    // Method to perform double-click action on a given WebElement
    public static void doubleClickElement(WebDriver driver, WebElement element) {
        Actions actions = new Actions(driver);
        actions.doubleClick(element).perform();
    }


}
