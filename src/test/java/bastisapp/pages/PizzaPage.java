package bastisapp.pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.aventstack.extentreports.Status;
import bastisapp.base.BasePage;
import bastisapp.reports.ExtentReport;


public class PizzaPage extends BasePage {
	
	@FindBy(xpath  = "//div[@class='col']//a[normalize-space()='Pizza']")
	WebElement navigate_PizzaPage;
	

	public PizzaPage(WebDriver driver) {
		super(driver);
	}

	public void navigatePizzaPage() throws Exception {
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
		navigate_PizzaPage.click();
		ExtentReport.logMessage(Status.INFO,"Click on Pizza Page", false);

	}

}
