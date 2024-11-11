package bastisapp.tests;

import org.testng.annotations.Test;


import bastisapp.base.BaseTest;
 import bastisapp.pages.KoreanPage;

public class KoreanTest extends BaseTest{


	@Test
	public void verifyKoreanPage() throws Exception {

		KoreanPage koreanPage = new KoreanPage(getDriver());
		koreanPage.navigateKoreanPage();
	}
}
