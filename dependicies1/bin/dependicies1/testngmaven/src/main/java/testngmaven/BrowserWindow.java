package testngmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindow {
	public static void main(String[] args) {
		
		
		//open browser
		WebDriver driver = new ChromeDriver();
		//open url
		 driver.navigate().to("https://javabykiran.com/selenium/login.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//Options ops = new Options();
		driver.findElement(By.xpath("//*[@id=\"username\"]"));
		driver.findElement(By.xpath("//*[@id=\"password\"]"));
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		driver.navigate().back();
		driver.navigate().forward();
		
		
	}

}
