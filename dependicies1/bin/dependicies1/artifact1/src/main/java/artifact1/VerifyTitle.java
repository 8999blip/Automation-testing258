package artifact1;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class VerifyTitle {
	    public static void main(String[] args) {
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.example.com");

	        // Verify title
	        String expectedTitle = "Example Domain";
	        String actualTitle = driver.getTitle();

	        if (actualTitle.equals(expectedTitle)) {
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed!");
	        }

	        driver.quit();
	    }
	}

	


