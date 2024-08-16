package org.xyz.automation.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserControl 
{
	WebDriver driver;
	
	
	@Test
	public void browsercon() throws Exception
	{
		driver = new ChromeDriver();  //launch chrome browser
		driver.get("https://www.google.com");
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		driver.close();  //close one window
		driver.quit();  //close multiple windows/tabs
		
	}
		
}
