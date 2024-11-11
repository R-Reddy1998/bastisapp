package bastisapp.tests;

import org.testng.annotations.Test;


import bastisapp.base.BaseTest;
 import bastisapp.pages.HealthyPage;

public class HealthyTest extends BaseTest{
	

	@Test
	public void verifyHealthyPage() throws Exception {

		HealthyPage healthyPage = new HealthyPage(getDriver());
		healthyPage.navigateHealthyPage();
	}

}
