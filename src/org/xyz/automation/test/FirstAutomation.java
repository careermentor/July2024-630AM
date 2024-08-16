package org.xyz.automation.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstAutomation 
{
	WebDriver driver;
	
	
	@BeforeMethod
	public void launchbrowser()
	{
		driver = new ChromeDriver();  //launch chrome browser
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		//driver.close();
	}
	

	@Test(enabled=false)
	public void loginfunc()
	{
		driver.findElement(By.id("email")).sendKeys("user1");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("user2");
		//driver.findElement(By.name("pass")).sendKeys("pass1");
		//driver.findElement(By.cssSelector("[type='submit']")).click();
		
		Point loginloc = driver.findElement(By.name("login")).getLocation();
		System.out.println(loginloc);
		
		System.out.println(driver.getPageSource());
		
	}
	
	@Test(enabled=true)
	public void signupfunc() throws Exception
	{
		driver.findElement(By.linkText("Create new account")).click();
		//Thread.sleep(5000);
		driver.findElement(By.name("firstname")).sendKeys("selenium");
		driver.findElement(By.name("websubmit")).click();
		
	}
	
}
