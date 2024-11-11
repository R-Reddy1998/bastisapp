package bastisapp.tests;

import org.testng.annotations.Test;


import bastisapp.base.BaseTest;
import bastisapp.pages.PandaExpresspage;

public class pandaExpressTest  extends BaseTest{
	
	
	@Test
	public void verifypandaexpresspage () throws Exception{
		PandaExpresspage pandaexpress = new PandaExpresspage (getDriver());
		pandaexpress.navigatePandaExpresspage();
		
	}

}
