package org.xyz.automation.test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleKeyboardMouse 
{
	@Test
	public void handleFrames() throws Exception
	{
		WebDriver driver = new EdgeDriver();
		driver.get("https://demoqa.com/frames");
		
		System.out.println(driver.findElement(By.xpath("//*[contains(text(),'Sample Iframe')]")).getText());
		
		driver.switchTo().frame("frame1");
		
		System.out.println(driver.findElement(By.xpath("//*[contains(text(),'This is a sample page')]")).getText());
		
		CaptureScreenshot.actualresult(driver, "handleFrames");
		
	}
	
	@Test
	public void handleAlerts() throws Exception
	{
		WebDriver driver = new EdgeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.className("signinbtn")).click();
		driver.switchTo().alert().accept();
		
		CaptureScreenshot.actualresult(driver,"handleAlerts");
	}
	
	@Test(enabled=false)
	public void handleMouse()
	{
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.mphasis.com/home.html");
		
		Actions act = new Actions(driver);
		
		//act.click(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
		
		//act.doubleClick(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
		
		//act.contextClick(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
		
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Industries']"))).perform();
		//act.click(driver.findElement(By.xpath("//span[contains(text(),'Hospitality')]"))).perform();
		
		act.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//span[contains(text(),'Hospitality')]"))).keyUp(Keys.CONTROL).perform();
		
		Set<String> winsid = driver.getWindowHandles();
		System.out.println(winsid);
		Iterator<String> itr = winsid.iterator();
		String win1 = itr.next();
		String win2 = itr.next();
		String win3 = itr.next();
		
		driver.switchTo().window(win2);
		driver.switchTo().window(win1);
		
	}
	
	@Test(enabled=false)
	public void handleKeyboards()
	{
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.PAGE_DOWN).perform();
		
		act.sendKeys("user1").perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
		
		act.sendKeys("user2").perform();
		
		act.sendKeys(Keys.TAB).perform();
		
		act.sendKeys("Aa").perform();
		
		act.sendKeys(Keys.ENTER).perform();
		
		
		
		
	}
	
}
