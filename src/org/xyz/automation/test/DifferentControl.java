package org.xyz.automation.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DifferentControl 
{
	WebDriver driver;
	
	@Test(enabled=false)
	public void amazonsite() throws Exception
	{
		driver = new ChromeDriver();  //launch chrome browser
		driver.get("https://www.bonanza.com/");
		
	}
	@Test(enabled=true)
	public void browsercon() throws Exception
	{
		driver = new ChromeDriver();  //launch chrome browser
		driver.navigate().to("https://thetestingworld.com/testings/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
			
		WebElement username = driver.findElement(By.name("fld_username"));
		username.sendKeys("selenium");
		
		//driver.findElement(By.name("fld_username")).sendKeys("selenium");
		
		driver.findElement(By.cssSelector("[value='home']")).click();
		
		boolean uncheck = driver.findElement(By.name("terms")).isSelected();
		System.out.println(uncheck);
		
		//Assert.assertEquals(uncheck, true);  //hard assertion
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(uncheck, false); 
		
		driver.findElement(By.name("terms")).click();
		
		boolean checked = driver.findElement(By.name("terms")).isSelected();
		System.out.println(checked);
		sa.assertEquals(checked, true);
		
		
		//driver.findElement(By.className("displayPopup")).click();
		//driver.findElement(By.className("close")).click();
		
		Select gen = new Select(driver.findElement(By.name("sex")));
		//gen.selectByIndex(1);  //Male
		//gen.selectByValue("2");  //Female
		gen.selectByVisibleText("Male");
		
		Select con = new Select(driver.findElement(By.name("country")));
		con.selectByVisibleText("United States");
		//con.selectByVisibleText("India");
		
	//	con.deselectAll();
		//con.selectByVisibleText("Canada");
		//con.deselectByVisibleText("India");
		
		Select st = new Select(driver.findElement(By.name("state")));
		//Thread.sleep(5000);
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		//wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("stateId")), "Hawaii"));
		st.selectByVisibleText("Arizona");
		
		
		
		sa.assertAll();
	}
	
	@Test(enabled=false)
	public void tc2()
	{
		System.out.println("this is test case 2");
	}
		
}
