package org.wipro.aumw.auto.testcases;

import org.testng.annotations.Test;
import org.wipro.aumw.auto.basePkg.InitiateBrowser;
import org.wipro.aumw.auto.pages.LoginPage;

public class LoginScenarios extends InitiateBrowser
{

	@Test
	public void tc01_validloginfunctionality() throws Exception
	{
		LoginPage login = new LoginPage(driver);
		login.enter_username("user1");
		login.enter_password("pass1");
		login.click_login();
		
		//because "this.driver" is null
	}
	
}
