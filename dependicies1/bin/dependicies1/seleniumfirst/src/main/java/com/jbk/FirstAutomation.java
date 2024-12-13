package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstAutomation {
	public static void main(String[]args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://javabykiran.com/selenium/login.html");
	
	driver.findElement(By.xpath("/html/body/div/div/h1"));
	
	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[1]/label"));
	
	driver.findElement(By.xpath("//label"));
	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/label"));
	}

}
