package bastisapp.tests;

import org.testng.annotations.Test;


import bastisapp.base.BaseTest;
import bastisapp.pages.jollibeePage;

public class jollibeeTest extends BaseTest {
	
	@Test
	
	public void verifyjollibeePage () throws Exception{
		
		jollibeePage jollibeepage = new jollibeePage (getDriver());
		jollibeepage.navigatejollibeePage();
	}
	

}
