package Section05;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGoogleFirefox {
    public static void main(String[] args) {
        /**
         * Task: Open Google in Firefox using Selenium (Using Same Project)
         * Objective: In the same Selenium project used before,
         * create a new Java class to launch Firefox and open Google.
         */

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
    }
}
