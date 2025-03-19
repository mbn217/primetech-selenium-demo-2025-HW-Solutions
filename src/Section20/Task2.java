package Section20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        /**
         * Task: Extract and Print Product Prices
         * Objective: Navigate to the website, log in, and retrieve the price of each product, then print the values.
         *
         * Steps:
         * Open a browser and navigate to https://saucedemo.com.
         * Enter the username: standard_user.
         * Enter the password: secret_sauce.
         * Click the Login button.
         * Locate all product price elements on the page.
         * Loop through the list of product prices.
         * Print the index of each product and its corresponding price.
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
        //Locate all product price elements on the page
        List<WebElement> productPrices = driver.findElements(By.className("inventory_item_price"));
        //Loop through the list of product prices & Print the index of each product and its corresponding price.
        for (int i = 0; i < productPrices.size(); i++) {
            System.out.println("Product " + (i + 1) + " Price: " + productPrices.get(i).getText());
            //We used i + 1 to start the product count from 1 instead of 0 , you can also use i if you want to start from 0
        }
        //Close the browser
        driver.quit();







        


    }
}
