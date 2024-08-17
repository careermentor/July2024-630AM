package org.wipro.aumw.auto.testcases;

import org.testng.annotations.Test;
import org.wipro.aumw.auto.basePkg.InitiateBrowser;
import org.wipro.aumw.auto.pages.SearchPage;
import org.wipro.aumw.auto.utilitiesPkg.ReadDataPropFile;

public class SeachFunctionality extends InitiateBrowser
{

	@Test
	public void tc03_validsearchinfunctionality() throws Exception
	{
		SearchPage search = new SearchPage(driver);
		search.enter_searchtextbox(ReadDataPropFile.readconfig("itemlist"));
		search.click_searchbttn();
		
	}
	
	
}
