package bastisapp.tests;

import org.testng.annotations.Test;


import bastisapp.base.BaseTest;
import bastisapp.pages.HomePage;


public class HomeTest extends BaseTest {

	@Test(priority = 1)
	public void verifyMultiRestaurantImg() {

		HomePage homePage = new HomePage(getDriver());
		homePage.navigateMultiRestaurant();
	    homePage.closeBrowser(); 
	  }
	
	@Test (priority = 2)
     public void verifyCopyMessage() {
    	 HomePage homePage = new HomePage(getDriver());
    	 homePage.verifyCopyRightMessage();  	 
     }	
}
