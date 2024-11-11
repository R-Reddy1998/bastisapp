package bastisapp.tests;

import org.testng.annotations.Test;

import bastisapp.base.BaseTest;
 import bastisapp.pages.SteakPage;

public class SteakTest extends BaseTest{
	

	@Test
	public void verifyBurgerPage() throws Exception {

		SteakPage steakPage = new SteakPage(getDriver());
		steakPage.navigateSteakPage();
	}

}