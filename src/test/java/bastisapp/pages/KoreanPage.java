package bastisapp.pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.aventstack.extentreports.Status;
import bastisapp.base.BasePage;
import bastisapp.reports.ExtentReport;

public class KoreanPage extends BasePage { 

	@FindBy(xpath  = "//div[@class='col']//a[normalize-space()='Korean']")
	WebElement navigate_KoreanPage;

	@FindBy(xpath = "//h5[@class='m-0 text-truncate']")
	WebElement navigate_McDonaldPage;

	@FindBy(xpath = "//a[@class='font-weight-bold']")
	WebElement add_Address;

	@FindBy(xpath = "//*[@id='notification_1']/div/i")
	WebElement close_x;

	@FindBy(xpath = "//*[@id='changeAddressModal']/div/div/div[2]/div[1]/input")
	WebElement click_to_enter_Address;

	public KoreanPage(WebDriver driver) {
		super(driver);
	}

	public void navigateKoreanPage() throws Exception {

		navigate_KoreanPage.click();
		ExtentReport.logMessage(Status.INFO, "Click on Korean Page ", false);

		navigate_McDonaldPage.click();
		ExtentReport.logMessage(Status.INFO, "Click on McDonald Page ", false);

		add_Address.click();
		ExtentReport.logMessage(Status.INFO, "Click on Add Address ", false);

		close_x.click();
		ExtentReport.logMessage(Status.INFO, "Click to close the cookie content ", false);
	}

	public void selectAddress() {

		click_to_enter_Address.click();
		ExtentReport.logMessage(Status.INFO, "Click to enter Address", false);

	}
}
