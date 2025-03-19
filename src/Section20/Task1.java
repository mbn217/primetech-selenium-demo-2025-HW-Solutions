package Section20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        /**
         * Task: Extract Product Names and Count
         * Objective: Navigate to the website, log in, and retrieve all product names, then print the names along with the total count.
         *
         * Steps:
         * Open a browser and navigate to https://saucedemo.com.
         * Enter the username: standard_user.
         * Enter the password: secret_sauce.
         * Click the Login button.
         * Locate all product name elements on the page.
         * Store the product names in a list.
         * Print each product name.
         */

        WebDriver driver = new ChromeDriver();
        // maximize the window
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com");
        //Username
        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");
        //Password
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        //Login
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
        //Locate all product name elements on the page & Store the product names in a list.
        List<WebElement> productNames = driver.findElements(By.className("inventory_item_name"));
        System.out.println("Total Products: " + productNames.size());
        //Print each product name.
        for (WebElement product : productNames) {
            System.out.println(product.getText());
        }
        //Close the browser
        driver.quit();







        


    }
}
