package org.wipro.aumw.auto.basePkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.wipro.aumw.auto.utilitiesPkg.ReadDataPropFile;

public class InitiateBrowser
{

	public WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() throws Exception
	{
		if(ReadDataPropFile.readconfig("BrowserName").equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(ReadDataPropFile.readconfig("BrowserName").equalsIgnoreCase("Edge"))
			{driver = new EdgeDriver();
			}
		else
		{
			driver = new ChromeDriver();
		}
		
		driver.get(ReadDataPropFile.readconfig("ApplicationURL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
	
}
