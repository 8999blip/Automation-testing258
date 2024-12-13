package testngmaven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;

public class TrackChangesInApplication implements WebDriverListener {

    public void beforeClick(WebElement element) {
        System.out.println("Before clicking on: " + element);
    }

    public void afterClick(WebElement element) {
        System.out.println("After clicking on: " + element);
    }
}

