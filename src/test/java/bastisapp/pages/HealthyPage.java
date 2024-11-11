package bastisapp.pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.aventstack.extentreports.Status;
import bastisapp.base.BasePage;
import bastisapp.reports.ExtentReport;

public class HealthyPage extends BasePage {
	@FindBy(xpath = "//button[@class='el-button el-button--primary is-round w-100']")
	WebElement click_on_alert_box;

	@FindBy(xpath  = "//div[@class='col']//a[normalize-space()='Healthy']")
	WebElement navigate_HealthyPage;

	public HealthyPage(WebDriver driver) {
		super(driver);
	}

	public void navigateHealthyPage() throws Exception {
		click_on_alert_box.click();
		ExtentReport.logMessage(Status.INFO, "click on alert box pop up", false);
		

		navigate_HealthyPage.click();
		ExtentReport.logMessage(Status.INFO, "Click on Healthy Page ", false);
	}

}

