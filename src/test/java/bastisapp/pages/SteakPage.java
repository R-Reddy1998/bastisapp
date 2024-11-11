package bastisapp.pages;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.Status;

import bastisapp.base.BasePage;
import bastisapp.reports.ExtentReport;

public class SteakPage extends BasePage {

	@FindBy(xpath  = "//div[@class='col']//a[normalize-space()='Steak']")
	WebElement navigate_SteakPage;
	

	public SteakPage(WebDriver driver) {
		
		super(driver);
	}

	public void navigateSteakPage() throws Exception {

		navigate_SteakPage.click();
		ExtentReport.logMessage(Status.INFO, "Click on Steak Page", false);

}
}