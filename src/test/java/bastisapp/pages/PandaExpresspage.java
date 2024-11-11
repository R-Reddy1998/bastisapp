package bastisapp.pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.aventstack.extentreports.Status;
import bastisapp.base.BasePage;
import bastisapp.reports.ExtentReport;

public class PandaExpresspage extends BasePage {
	
	@FindBy(xpath = "//button[@class='el-button el-button--primary is-round w-100']")
	WebElement click_on_alert_box;
	
	@FindBy(linkText = "Panda Express")
	WebElement click_on_Panda_Express_name;
	
	@FindBy(xpath="//a[normalize-space()='Add Address']")
	WebElement click_on_add_address;
	
	

	public PandaExpresspage(WebDriver driver) {
		super(driver);
	}
	public void  navigatePandaExpresspage () {
			
		click_on_alert_box.click();
		ExtentReport.logMessage(Status.INFO, "click on alert box pop up", false);
		
		click_on_Panda_Express_name.click();
		ExtentReport.logMessage(Status.INFO, "click on the Panda Express name", false);
		
		click_on_add_address.click();
		ExtentReport.logMessage(Status.INFO, "click on add address", false);
		

	}
}
