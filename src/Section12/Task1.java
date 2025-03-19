package Section12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        /**
         * Task: Login to SauceDemo
         * Objective: Write a Selenium script to automate the login process on SauceDemo.
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

        


    }
}
