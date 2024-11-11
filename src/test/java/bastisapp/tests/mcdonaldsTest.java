package bastisapp.tests;

import org.testng.annotations.Test;

import bastisapp.base.BaseTest;
import bastisapp.pages.mcdonaldspage;

public class mcdonaldsTest extends BaseTest {
	
	  @Test
	  public void verifyMcdonaldspage ()throws Exception {
		  
	 mcdonaldspage MCDONALDSPAGE = new mcdonaldspage (getDriver());
	 MCDONALDSPAGE.navigateMcDonaldsPage();
}
}