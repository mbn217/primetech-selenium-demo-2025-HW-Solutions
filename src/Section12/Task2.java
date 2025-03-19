package Section12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        /**
         * Task: Automate a Job Search on Indeed
         * Objective: Write a Selenium script to automate
         * a job search on Indeed.com and verify the page updates accordingly.
         */

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.indeed.com/");
        // try catch to wait for 2 seconds
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Something happened here");
        }


        //get current url and assign it to a variable
        String homeUrl = driver.getCurrentUrl();
        System.out.println("Original Home URL: " + homeUrl);

        String homeTitle = driver.getTitle();
        System.out.println("Original Home Title: " + homeTitle);

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("SDET");

        WebElement searchBtn = driver.findElement(By.className("yosegi-InlineWhatWhere-primaryButton"));
        searchBtn.click();



        String newSearchURL = driver.getCurrentUrl();
        System.out.println("New Current URL is: " + newSearchURL);

        String newTitle = driver.getTitle();
        System.out.println("New Title is: " + newTitle);

        //verify that searchURL does not equal to homeURL and contains the search criteria.
        //!= this will compare the address of the object in the memory
        if(!homeUrl.equals(newSearchURL) &&  newSearchURL.contains("SDET")){
            System.out.println("TRUE, URLS do NOT match which means we clicked on search button successfully");
        }else{
            System.out.println("False, URLS did not match or SDET is not inside the new url");
        }
        //verify that searchTitle does not equal to homeTitle and has the search criteria.

        if (!homeTitle.equals(newTitle) && newTitle.toLowerCase().contains("SDET".toLowerCase()) ){
            System.out.println("True");
        }else{
            System.out.println("False");
        }


        


    }
}
