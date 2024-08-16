package testNGdemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenario2 
{

	
	@Test(groups="Regression")
	public void first_testcase()
	{
		System.out.println("this is first test cases");
	}
	
	@Test(enabled=true)
	public void second_testcase()
	{
		System.out.println("this is second test cases");
	}
	
	@Test(groups="Smoke")
	public void third_testcase()
	{
		System.out.println("this is third test cases");
		Assert.assertEquals("Hello", "Hello world");
	}
	
	@Test(dependsOnMethods="third_testcase")
	public void forth_testcase()
	{
		System.out.println("this is forth test cases");
		//Assert.assertEquals("Hello", "Hello world");
	}
	
	@Test
	public void fifth_testcase()
	{
		System.out.println("this is fifth test cases");
	}
	
	@Test(groups={"Regression","Sanity"})
	public void sixth_testcase()
	{
		System.out.println("this is sixth test cases");
	}
	
	
}
