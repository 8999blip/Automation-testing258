package com.google;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

	public class GoogleSearchTestNG {
	    WebDriver driver;

	    @BeforeClass
	    public void setUp() {
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	        driver = new ChromeDriver();
	        driver.get("https://www.google.com");
	    }

	    @Test
	    public void testGoogleSearch() {
	        WebElement searchBox = driver.findElement(By.name("q"));
	        searchBox.sendKeys("TestNG Selenium");
	        searchBox.submit();

	        // Wait and validate results
	        try {
	            Thread.sleep(3000); // Replace with WebDriverWait in production
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        Assert.assertTrue(driver.getTitle().contains("TestNG Selenium"), "Title does not contain the expected text!");
	    }

	    @AfterClass
	    public void tearDown() {
	        driver.quit();
	    }
	}




