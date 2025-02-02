package testngmaven;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;

	public class GoogleSearchTest {
	    public static void main(String[] args) {
	        // Set the path to ChromeDriver
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	        // Create WebDriver instance
	        ChromeOptions options = new ChromeOptions();
	        WebDriver driver = new ChromeDriver(options);

	        try {
	            // Open Google
	            driver.get("https://www.google.com");

	            // Find the search box
	            WebElement searchBox = driver.findElement(By.name("q"));

	            // Type a query and submit
	            searchBox.sendKeys("Selenium WebDriver");
	            searchBox.submit();

	            // Wait for results and validate title
	            Thread.sleep(3000); // Avoid in real-world tests; use WebDriverWait
	            String pageTitle = driver.getTitle();
	            if (pageTitle.contains("Selenium WebDriver")) {
	                System.out.println("Test Passed!");
	            } else {
	                System.out.println("Test Failed!");
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            // Close the browser
	            driver.quit();
	        }
	    }
	}



