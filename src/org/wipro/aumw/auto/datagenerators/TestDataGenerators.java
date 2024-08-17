package org.wipro.aumw.auto.datagenerators;

import org.testng.annotations.DataProvider;

public class TestDataGenerators 
{


	@DataProvider(name="ddf")
	public Object[][] testdata()
	{
		String data1 = "user1";
		Object[] data2 = {"user1","pass1"};  //1-Dimensional day
		Object[][] data3 = {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};  //2-Dimensional day
		return data3;
	}
	
	

	@DataProvider(name="ddf1")
	public Object[][] testdata1()
	{
		Object[][] data3 = {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};  //2-Dimensional day
		return data3;
	}
}
