package org.wipro.aumw.auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.wipro.aumw.auto.utilitiesPkg.ReadDataPropFile;

public class SignupPage 
{

	WebDriver driver;
	
	public SignupPage(WebDriver driver) 
	{
		this.driver=driver;
	}

	public void click_createnewaccount() throws Exception
	{
		driver.findElement(By.xpath(ReadDataPropFile.readelement("login_createnewaccount_xpath"))).click();
	}
	
	public void enter_firstname(String fname) throws Exception
	{
		driver.findElement(By.name(ReadDataPropFile.readelement("signup_firstname_name"))).sendKeys(fname);
	}
	
	public void select_dob_day(String day) throws Exception
	{
		
		Select gen = new Select(driver.findElement(By.name(ReadDataPropFile.readelement("signup_dob_day_name"))));
		
		gen.selectByVisibleText(day);
	}
	
	public void click_male() throws Exception
	{
		driver.findElement(By.xpath(ReadDataPropFile.readelement("signup_gender_xpath"))).click();
	}
	
	public void click_signup() throws Exception
	{
		driver.findElement(By.name(ReadDataPropFile.readelement("signup_submit_name"))).click();
	}
	
}
