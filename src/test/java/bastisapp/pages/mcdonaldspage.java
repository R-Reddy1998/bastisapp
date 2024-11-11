package bastisapp.pages;

import org.openqa.selenium.WebDriver;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.aventstack.extentreports.Status; 
import bastisapp.base.BasePage;
import bastisapp.reports.ExtentReport;

public class mcdonaldspage extends BasePage {
	
	@FindBy(xpath = "//button[@class='el-button el-button--primary is-round w-100']")
	WebElement click_on_alert_box;
	
 	@FindBy(xpath = "//body/div[@class='page-content']/div[@id='vue-home-widgets']/div[@class='container mt-4 mb-3']/div[3]")
 	WebElement click_on_McDonald_name;
	
//	@FindBy(xpath = "//a[normalize-space()='Add Address']")
	@FindBy(xpath="//div[@id='vue-address-needed']//a[@class='font-weight-bold']")
	WebElement click_on_add_address;
	
	public mcdonaldspage(WebDriver driver) {
		super(driver);
		
	}
	
	public void navigateMcDonaldsPage () {
		
		click_on_alert_box.click();
		ExtentReport.logMessage(Status.INFO, "click on alert box pop up", false);
		
		click_on_McDonald_name.click();
		ExtentReport.logMessage(Status.INFO, "click on the mcdonald name", false);
		
		click_on_add_address.click();
		ExtentReport.logMessage(Status.INFO, "click on add address", false);
	
	}	
}
