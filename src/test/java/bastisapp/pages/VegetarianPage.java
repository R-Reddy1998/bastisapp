package bastisapp.pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.Status;

import bastisapp.base.BasePage;
import bastisapp.reports.ExtentReport;

public class VegetarianPage extends BasePage {

	@FindBy(xpath  = "//div[@class='col']//a[normalize-space()='Vegetarian']")
	WebElement navigate_VegetarianPage;

	public VegetarianPage(WebDriver driver) {
		super(driver);
	}

	public void navigateVegetarianPage() throws Exception {
		navigate_VegetarianPage.click();
		ExtentReport.logMessage(Status.INFO, "Click on Vegetarian Page ", false);

	}
}
