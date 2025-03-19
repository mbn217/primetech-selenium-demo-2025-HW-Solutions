package Section24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        /**
         * Task: Verify Dropdown Selection and Options
         * Objective
         * Students will automate a test case using Selenium to validate the default selection and available options in a dropdown.
         *
         * Steps to Complete the Task
         * 1. Navigate to the Webpage
         * Open the browser and go to https://omayo.blogspot.com/.
         * 2. Verify Default Selected Option
         * Locate the dropdown element on the page.
         * Check that the default selected option is "Older Newsletters".
         * Print the selected option in the console for validation.
         * 3. Retrieve All Available Options
         * Extract and store all dropdown options.
         * Print the list of options to verify them.
         * 4. Validate Against Requirements
         * Compare the extracted dropdown options with the expected list.
         */

        WebDriver driver = new ChromeDriver();
        // maximize the window
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        //Wait for the page to load
        Thread.sleep(2000);
        //Find the dropdown by xpath
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='drop1']"));
        Select select = new Select(dropDown);
        WebElement defaultSelected = select.getFirstSelectedOption();
        System.out.println(defaultSelected.getText());
        System.out.println("-------------------------");
        List<WebElement> list = select.getOptions();
        List<String> actualListOfDropDownFromUI = new ArrayList<>();
        for (WebElement element : list){
            String textOfTheDropDown = element.getText();
            System.out.println(textOfTheDropDown);//printing the text of the element
            actualListOfDropDownFromUI.add(textOfTheDropDown);//we adding the text of the element into the array
        }

        select.selectByValue("def"); //selecting a different value than the default one


        //All options that are coming from requirement document
        List<String> expectedListOfDropDowns = List.of("Older Newsletters","doc 1","doc 2","doc 3","doc 4");


        for (int i = 0; i < expectedListOfDropDowns.size() ; i++) {
            if (expectedListOfDropDowns.get(i).equals(actualListOfDropDownFromUI.get(i))){
                System.out.println("Option " + i + " is matching");
            }else{
                System.out.println("Option " + i + " is not matching" +
                        " Actual Options is["+ actualListOfDropDownFromUI.get(i) + "] vs the Expected [" +
                        expectedListOfDropDowns.get(i) +"]");
            }
        }
        driver.close();

    }
}
