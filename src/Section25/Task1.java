package Section25;

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
         * Task 3: Using Waits
         * go to https://www.hyrtutorials.com/p/waits-demo.html
         * Click on Add Textbox1
         * Enter a value “test” into the Textbox1 input box once its displayed
         * Click on Add Textbox2
         * Enter a value “test” into the Textbox2 input box once its displayed
         * Hint: Use either implicit wait or explicit wait
         */
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
        //using implicit wait
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement btn1 = driver.findElement(By.xpath("//button[@id='btn1']"));
        btn1.click();
        //textbox1 is going to take 5 seconds
        //WebElement textbox1 = driver.findElement(By.xpath("//h3[text()='Show the textboxes here:']/input[1]"));
        //textbox1.sendKeys("Automation");

        //-------------- Example using explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Show the textboxes here:']/input[1]")));
        driver.findElement(By.xpath("//h3[text()='Show the textboxes here:']/input[1]")).sendKeys("Automation");


        //---------------


        WebElement btn2 = driver.findElement(By.xpath("//button[@id='btn2']"));
        btn2.click();
        //textbox2 is going to take 10 seconds
        //WebElement textbox2 = driver.findElement(By.xpath("//h3[text()='Show the textboxes here:']/input[2]"));
        //textbox2.sendKeys("Selenium");

        //--------------- Example using explicit wait
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Show the textboxes here:']/input[2]")));
        driver.findElement(By.xpath("//h3[text()='Show the textboxes here:']/input[2]")).sendKeys("Selenium");

        //---------------

        driver.quit();
    }
}
