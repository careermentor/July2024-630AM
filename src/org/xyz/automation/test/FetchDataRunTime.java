package org.xyz.automation.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FetchDataRunTime 
{
	@Test
	public void tc001_login_cursor_username()
	{
		WebDriver driver = new EdgeDriver();
		
		String expURL = "https://www.facebook.com/";
		
		driver.get(expURL);
		
		String actURL = driver.getCurrentUrl();
		System.out.println(actURL);
		
		Assert.assertEquals(actURL, expURL);
		
		String ExpTitle = "Facebook – log in or sign up";
		String ActTitle = driver.getTitle();
		System.out.println(ActTitle);
		Assert.assertEquals(ActTitle, ExpTitle);
		
		String expuname_pl = "Email address or phone number";
		String actuname_pl = driver.findElement(By.id("email")).getAttribute("placeholder");
		System.out.println(actuname_pl);
		
		Assert.assertEquals(actuname_pl, expuname_pl);
		
		String expLogin = "Log in";
		String actLogin = driver.findElement(By.name("login")).getText();
		System.out.println(actLogin);
		
		Assert.assertEquals(actLogin, expLogin);
	}
	
}
