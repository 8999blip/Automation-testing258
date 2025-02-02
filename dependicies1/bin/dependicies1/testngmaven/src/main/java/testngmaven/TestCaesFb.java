package testngmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCaesFb {
	
@Test
	
	public  void FBTestCases  () {
	} {
	WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		WebElement ActualResult=driver.findElement(By.xpath("//*[@id=\"facebook\"]/body/script[1]"));
		System.out.println(ActualResult);
		
	}
	@Test
	public void testTitle() {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		String ActualTitle =driver.getTitle();
		System.out.println(ActualTitle);
		String ExcepectedResult =" Login to Facebook";
		Assert.assertEquals(ActualTitle,ExcepectedResult);
	}


		
	
	@Test
    public void testRedirectionAfterLogin() {
    WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	driver.findElement(By.name("username")).sendKeys("admin");
    driver.findElement(By.name("password")).sendKeys("password123");
    driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
	}
	
   @Test
   public void testPlaceholderText() {
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/login/");
	    String usernamePlaceholder = driver.findElement(By.name("username")).getAttribute("placeholder");
	    Assert.assertEquals(usernamePlaceholder, "Enter your username", "Username placeholder mismatch");
	    
	    String passwordPlaceholder = driver.findElement(By.name("password")).getAttribute("placeholder");
	    Assert.assertEquals(passwordPlaceholder, "Enter your password", "Password placeholder mismatch");
   }


   @Test
    public void testSuccessfulLogin() {
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.facebook.com/login/");
    driver.findElement(By.name("username")).sendKeys("nilforever18@gmail.com");
    driver.findElement(By.name("password")).sendKeys("9881235883");
    driver.findElement(By.xpath("//button[text()='Login']")).click();
}


 @Test
   public void testForgottonAccount() {
   WebDriver driver = new ChromeDriver();
   driver.get("https://www.facebook.com/login/");
   String ActualTitle =driver.getTitle();
   System.out.println(ActualTitle);
   String ExcepectedResult ="ForgottonAccount ";
   Assert.assertEquals(ActualTitle,ExcepectedResult);
}

 @Test

  public  void  testSignUpFunctionality () {
 {
    WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	WebElement ActualResult=driver.findElement(By.xpath("//*[@id=\"lgnjs\"]"));
	System.out.println(ActualResult);
 }
}


  @Test

  public  void  testfForttonFunctionality () {
 {
    WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	WebElement ActualResult=driver.findElement(By.xpath("//*[@id=\"u_0_2_8w\"]/div[3]/a"));
	System.out.println(ActualResult);
 }
}


  @Test

  public  void  testCreatnewAccount () {
{
    WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	WebElement ActualResult=driver.findElement(By.xpath("//*[@id=\"u_0_0_HD\"]"));
	System.out.println(ActualResult);
}
}


  @Test

  public  void  testHeadingTg () {
{
    WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	WebElement ActualResult=driver.findElement(By.xpath("//*[@id=\"facebook\"]/body"));
	System.out.println(ActualResult);
}
}
}


    
	    
    
    




