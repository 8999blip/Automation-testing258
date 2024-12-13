package testngmaven;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTableTestCases {
	
	@Test
	public void testInvalidCreadentialsLoginpage() {
		
		
		ArrayList<String> alExpResult= new ArrayList<String>();
		
		 alExpResult.add("Category ID");
		 alExpResult.add("Category Name");
		 alExpResult.add("Creatd at");
		 alExpResult.add("Modified At");
		 alExpResult.add("Actions");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/admin.html#logout");
				
		for (int i = 1; i <=5; i++) {
			WebElement actColumn = driver.findElement(By.xpath("//*[@id=\"categories-table\"]"));
			getText();
			System.out.println(actColumn);
			String expResult= alExpResult.get(i);
			Assert.assertEquals(actColumn, expResult);
		}
	}

	private void getText() {
		// TODO Auto-generated method stub
		
	}
	}

	


