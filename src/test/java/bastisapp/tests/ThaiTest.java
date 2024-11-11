package bastisapp.tests;

import org.testng.annotations.Test;
import bastisapp.base.BaseTest;
import bastisapp.pages.Thaipage;

	public class ThaiTest extends BaseTest {
	@Test
	public void VerifyThaiPage () throws Exception {
	
		Thaipage thaipage = new Thaipage (getDriver());
		thaipage. navigateThaiPage();
	}

}
