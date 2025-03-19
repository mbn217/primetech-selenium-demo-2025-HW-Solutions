package Section34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        /**
         * Task: Drag and Drop Items to Sort Order
         * Step 1: Go to the URL https://jqueryui.com/sortable/.
         * Step 2: Sort the items in the following order using Action class:
         * Item 3
         * Item 1
         * Item 2
         * Item 4
         * Item 5
         * Item 7
         * Item 6
         */
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/sortable/");
        driver.switchTo().frame(0); // Switch to the iframe containing the sortable items
        Actions actions = new Actions(driver);
        // Drag and drop items to sort them
        WebElement item3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
        WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
        WebElement item2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
        WebElement item4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
        WebElement item5 = driver.findElement(By.xpath("//li[text()='Item 5']"));
        WebElement item7 = driver.findElement(By.xpath("//li[text()='Item 7']"));
        WebElement item6 = driver.findElement(By.xpath("//li[text()='Item 6']"));

        // Perform drag and drop actions
        actions.dragAndDrop(item3, item1).build().perform();
        Thread.sleep(1000); // Adding a delay to see the drag and drop effect
        actions.dragAndDrop(item2, item4).build().perform();
        Thread.sleep(1000); // Adding a delay to see the drag and drop effect
        actions.dragAndDrop(item7, item6).build().perform();
        Thread.sleep(1000); // Adding a delay to see the drag and drop effect
        driver.quit();



    }
}
