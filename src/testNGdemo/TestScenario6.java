package testNGdemo;

import org.testng.annotations.Test;

public class TestScenario6 
{

	
	@Test
	public void first_testcase()
	{
		System.out.println("this is first test cases");
	}
	
	@Test(groups={"Regression","Sanity","Smoke"})
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
	}
	
	@Test(groups="Smoke")
	public void fifth_testcase()
	{
		System.out.println("this is fifth test cases");
	}
	
	@Test(groups="Regression")
	public void sixth_testcase()
	{
		System.out.println("this is sixth test cases");
	}
	
	
}