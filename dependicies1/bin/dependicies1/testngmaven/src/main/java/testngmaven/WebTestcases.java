package testngmaven;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTestcases {
	
	
	
	@Test
	public void InvalidCredentialLoginPage() {
		ArrayList<String> alExpResult= new ArrayList<String>();
		alExpResult.add("Category ID");
		alExpResult.add("Category Name");
		alExpResult.add("Created At");
		alExpResult.add("Modified At");
		alExpResult.add("Actions");
		
		WebDriver driver =  new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/admin.html#logout");
		for (int i = 1; i <= 5; i++) {
			WebElement firstcolumn = driver.findElement(By.xpath("//*[@id=\"categories-table\"]/thead/tr/th[1]"));
		
		System.out.println(firstcolumn);

}
	}
}
