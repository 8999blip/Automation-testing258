package testngmaven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/admin.html#logout");
		
		List<WebElement> we= driver.findElements(By.xpath("//th[1]"));
		System.out.println(((WebElement) we).getText());
	}

}
