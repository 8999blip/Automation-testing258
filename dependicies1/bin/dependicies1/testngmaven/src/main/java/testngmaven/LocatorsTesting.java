package testngmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsTesting {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://thekiranacademy.com/tutorials/selenium/synchronizing-test-with-wait-in-selenium.php#gsc.tab=0");
	driver.findElement(By.partialLinkText("Emplict")).click();
	}
}