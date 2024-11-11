package bastisapp.tests;

import org.testng.annotations.Test;

import bastisapp.base.BaseTest;
import bastisapp.pages.BurgersPage;



public class BurgersTest extends BaseTest {

	@Test
	public void verifyBurgerPage() throws Exception {

		BurgersPage burgersPage = new BurgersPage(getDriver());
		burgersPage.navigateBurgersPage();
	}
}
