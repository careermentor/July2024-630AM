package org.wipro.aumw.auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.aumw.auto.utilitiesPkg.ReadDataPropFile;

public class SearchPage 
{

	WebDriver driver;
	
	public SearchPage(WebDriver driver) 
	{
		this.driver=driver;
	}

	public void enter_searchtextbox(String item) throws Exception
	{
		driver.findElement(By.id(ReadDataPropFile.readelement("search_textbox_id"))).sendKeys(item);
	}
	
	public void click_searchbttn() throws Exception
	{
		driver.findElement(By.id(ReadDataPropFile.readelement("search_button_id"))).click();
	}
	
}
