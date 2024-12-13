package testngmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxDemo {
	
	@Test
	
	void check()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"checkboxes\"]);"));
		ele.click();
		boolean b=ele.isSelected();
		Assert.assertTrue(b);
	}

}
