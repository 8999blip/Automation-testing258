package testngmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ExtraActionsTest {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://javabykiran.com/selenium/subcategories.html");
	Actions actions = new Actions(driver);actions
	
		
		.doubleClick(driver.findElement(By.xpath("/sddf/dsfsd/fds"))).perform();
	}
}

