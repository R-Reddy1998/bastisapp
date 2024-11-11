package bastisapp.pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.aventstack.extentreports.Status;
import bastisapp.reports.ExtentReport;
import io.github.bonigarcia.wdm.WebDriverManager;
import bastisapp.base.BasePage;
public class BurgersPage extends BasePage {
	
	@FindBy(linkText = "Burgers")
	WebElement navigate_BurgersPage;

	@FindBy(xpath = "//*[@id='vue-feed']/div[2]/div/div[2]//a/h5[normalize-space()='Subway']")
	WebElement navigate_SubwayPage;
	
	@FindBy(xpath = "//section[@id='drinks']/div[@class='row']/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/button[1]")
	WebElement click_on_item_X;
	
	@FindBy(xpath = "//a[@class='font-weight-bold']")
	WebElement add_Address;

	@FindBy(xpath = "//*[@id='notification_1']/div/i")
	WebElement close_x;

	@FindBy(xpath = "//*[@id='changeAddressModal']/div/div/div[2]/div[1]/input")
	WebElement click_to_enter_Address;

	public BurgersPage(WebDriver driver) {
		super(driver);
		WebDriverManager.chromedriver().setup();

		
	}

	  public void navigateBurgersPage()  throws Exception   {

		navigate_BurgersPage.click();
		ExtentReport.logMessage(Status.INFO, "Click on Burgers Page", false);

		navigate_SubwayPage.click();
		ExtentReport.logMessage(Status.INFO, "Click on Subway Page", false);
		
		click_on_item_X.click();
		ExtentReport.logMessage(Status.INFO, "click on the item add X button", false);
		
		add_Address.click();
		ExtentReport.logMessage(Status.INFO, "Click on Add Address", false);

		close_x.click();
		ExtentReport.logMessage(Status.INFO, "Click to close the cookie content", false);
	}
	
	 public void selectAddress() {

		click_to_enter_Address.click();
		ExtentReport.logMessage(Status.INFO, "Click to enter Address", false);
	}
}





