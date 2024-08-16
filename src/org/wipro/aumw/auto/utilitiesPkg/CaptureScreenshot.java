package org.wipro.aumw.auto.utilitiesPkg;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshot 
{

	public static void actualresult(WebDriver driver, String name) throws Exception
	{
		TakesScreenshot ts = (TakesScreenshot) driver;  //print screen
		File f = ts.getScreenshotAs(OutputType.FILE);
		
		File fd = new File("./TestResult/" + name + ".png");
		
		FileUtils.copyFile(f, fd);
		
	}
	
}
