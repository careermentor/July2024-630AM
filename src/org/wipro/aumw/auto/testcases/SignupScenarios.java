package org.wipro.aumw.auto.testcases;

import org.testng.annotations.Test;
import org.wipro.aumw.auto.basePkg.InitiateBrowser;
import org.wipro.aumw.auto.pages.SignupPage;

public class SignupScenarios extends InitiateBrowser
{

	@Test
	public void tc02_validsignupfunctionality() throws Exception
	{
		SignupPage sign = new SignupPage(driver);
		sign.click_createnewaccount();
		sign.enter_firstname("selenium");
		sign.select_dob_day("10");
		sign.click_male();
		sign.click_signup();
	}
	
	
}
