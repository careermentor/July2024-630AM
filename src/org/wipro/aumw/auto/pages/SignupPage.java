package org.wipro.aumw.auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.aumw.auto.utilitiesPkg.ReadDataPropFile;

public class SignupPage 
{

	WebDriver driver;
	
	public SignupPage(WebDriver driver) 
	{
		this.driver=driver;
	}

	public void enter_username(String uname) throws Exception
	{
		driver.findElement(By.id(ReadDataPropFile.readelement("login_username_id"))).sendKeys(uname);
	}
	
	public void enter_password(String pass) throws Exception
	{
		driver.findElement(By.name(ReadDataPropFile.readelement("login_password_name"))).sendKeys(pass);
	}
	
	public void click_login() throws Exception
	{
		driver.findElement(By.cssSelector(ReadDataPropFile.readelement("login_loginbttn_css"))).click();
	}
	
}
