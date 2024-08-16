package testNGdemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenario1 
{

	
	@Test(priority=1,enabled=false)
	public void first_testcase()
	{
		System.out.println("this is first test cases");
		Assert.assertEquals("Hello", "Hello world");
	}
	
	@Test(priority=2)
	public void second_testcase()
	{
		System.out.println("this is second test cases");
	}
	
	@Test(priority=0)
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
	
	@Test(priority=-1)
	public void fifth_testcase()
	{
		System.out.println("this is fifth test cases");
	}
	
	@Test(priority=-2)
	public void sixth_testcase()
	{
		System.out.println("this is sixth test cases");
	}
	
	
}
