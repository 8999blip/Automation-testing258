package testngmaven;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Demo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/windows");
		//System.out.println(WinIds);

		Set<String> winIds = driver.getWindowHandles();
		
		Iterator<String> its=winIds.iterator();
		String pwindows=its.next();
		String cwindiw=its.next();
		
		driver.switchTo().window(cwindiw);
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(pwindows);
		System.out.println();
	}

}
