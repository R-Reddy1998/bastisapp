package bastisapp.pages;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.aventstack.extentreports.Status;
import bastisapp.base.BasePage;
import bastisapp.reports.ExtentReport;
 		
public class jollibeePage extends BasePage {
	
	@FindBy(xpath = "//button[@class='el-button el-button--primary is-round w-100']")
	WebElement click_on_alert_box;
	
	@FindBy( xpath   = "//*[@id=\"vue-home-widgets\"]/div[1]/div[3]/div[2]/div[1]/div/div[6]/div/div[3]/div/a/h6")	
	WebElement click_on_jollibee_name;
	
	@FindBy(xpath="//a[normalize-space()='Add Address']")
	WebElement click_on_add_address;
	 
	public jollibeePage(WebDriver driver) {
		super(driver);
	}
		public void navigatejollibeePage () {
			click_on_alert_box.click();
			ExtentReport.logMessage(Status.INFO, "click on alert box pop up", false);
			
			click_on_jollibee_name.click();
			ExtentReport.logMessage(Status.INFO, "click on the Jollibee name", false);
			
			click_on_add_address.click();
			ExtentReport.logMessage(Status.INFO, "click on add address", false);
		
			
	}

}
