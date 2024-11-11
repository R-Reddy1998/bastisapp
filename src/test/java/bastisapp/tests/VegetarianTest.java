package bastisapp.tests;

import org.testng.annotations.Test;



import bastisapp.base.BaseTest;
 import bastisapp.pages.VegetarianPage;

public class VegetarianTest extends BaseTest{
	

	@Test
	public void verifyVegetarianPage() throws Exception {

		VegetarianPage vegetarianPage = new VegetarianPage(getDriver());
		vegetarianPage.navigateVegetarianPage();
	}

}
