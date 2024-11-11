package bastisapp.tests;

import org.testng.annotations.Test;

import bastisapp.base.BaseTest;
import bastisapp.pages.Chinesepage;

 
public class chineseTest extends BaseTest {
	@Test
	public void verifychinesepage() throws Exception {
		
	Chinesepage chinesepage = new Chinesepage (getDriver());	
	chinesepage.navigatechinesepage();
	}

}
