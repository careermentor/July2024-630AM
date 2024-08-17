package org.wipro.aumw.auto.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.wipro.aumw.auto.basePkg.InitiateBrowser;
import org.wipro.aumw.auto.datagenerators.TestDataGenerators;
import org.wipro.aumw.auto.pages.LoginPage;

public class LoginScenarios extends InitiateBrowser
{

	@Test(dataProvider="ddf",dataProviderClass=TestDataGenerators.class)
	public void tc01_validloginfunctionality(String username, String password) throws Exception
	{
		LoginPage login = new LoginPage(driver);
		login.enter_username(username);
		login.enter_password(password);
		login.click_login();
		
		//because "this.driver" is null
	}
	
	
}
