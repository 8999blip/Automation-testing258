package testngmaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;

public class AutomationWatchingEx {
    public static void main(String[] args) {
        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Create an instance of the custom WebDriver listener
        WebDriverListener wd = new WebdriverActivitiesListener();

        // Decorate the WebDriver with the listener
        WebDriver driverWatch = new EventFiringDecorator<>(wd).decorate(driver);

        // Perform actions using the decorated WebDriver
        driverWatch.get("http://thekiranacademy.com/");

        // Quit the WebDriver
        driverWatch.quit();
    }
}

// Ensure you have a valid implementation of WebdriverActivitiesListener
class WebdriverActivitiesListener implements WebDriverListener {
    // Implement required methods for the WebDriverListener interface
}
