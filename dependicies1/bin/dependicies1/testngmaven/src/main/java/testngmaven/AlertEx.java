package testngmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertEx {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/admin.html#logout");
		driver.findElement(By.xpath("//*[@id=\"categories-table\"]/thead/tr/th[1]"));
		
	}

}
