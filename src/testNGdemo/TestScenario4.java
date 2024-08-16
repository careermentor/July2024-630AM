package testNGdemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenario4 
{

	
	@Test
	public void first_testcase()
	{
		System.out.println("this is first test cases");
	}
	
	@Test(groups="Regression")
	public void second_testcase()
	{
		System.out.println("this is second test cases");
	}
	
	@Test
	public void third_testcase()
	{
		System.out.println("this is third test cases");
	}
	
	@Test
	public void forth_testcase()
	{
		System.out.println("this is forth test cases");
		Assert.assertEquals("Hello", "Hello world");
	}
	
	@Test(groups="Smoke")
	public void fifth_testcase()
	{
		System.out.println("this is fifth test cases");
	}
	
	@Test
	public void sixth_testcase()
	{
		System.out.println("this is sixth test cases");
	}
	
	
}
