package bastisapp.tests;

import org.testng.annotations.Test;


import bastisapp.base.BaseTest;
 import bastisapp.pages.PizzaPage;

public class PizzaTest extends BaseTest {
	

	@Test
	public void verifyPizzaPage() throws Exception {

		PizzaPage pizzaPage = new PizzaPage(getDriver());
		pizzaPage.navigatePizzaPage();
	}

}
