package bastisapp.pages;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.aventstack.extentreports.Status;
import bastisapp.base.BasePage;
import bastisapp.reports.ExtentReport;

public class Thaipage extends BasePage  {
	@FindBy(xpath = "//button[@class='el-button el-button--primary is-round w-100']")
	WebElement click_on_alert_box;
	
	@FindBy(linkText  = "Thai")
	WebElement navigate_Thaipage;
	
	@FindBy(xpath= "//h5[normalize-space()='Chowking']")
	WebElement navigate_chowkingpage;
	 
	@FindBy(xpath="//a[normalize-space()='Add Address']")
		WebElement click_on_add_address;
	
	@FindBy( xpath = "//div[@id='vue-address-needed']//input[@placeholder='Enter your address']")
	WebElement click_on_delivery_address;
	
//	@FindBy(xpath  = "//*[@id=\"el-id-9294-26-item-4\"]")
//	WebElement click_on_selected_address;
	
	
	public Thaipage(WebDriver driver) {
		super(driver);
	}

	public void  navigateThaiPage() {
		
		click_on_alert_box.click();
		ExtentReport.logMessage(Status.INFO, "click on alert box pop up", false);
		
		navigate_Thaipage.click();
		ExtentReport.logMessage(Status.INFO, "click on Thai page", false);
		
		navigate_chowkingpage.click();
		ExtentReport.logMessage(Status.INFO,"click on chowking name",false);
	 	
		click_on_add_address.click();
		ExtentReport.logMessage(Status.INFO, "click on add address", false);
		
		click_on_delivery_address.sendKeys("hyderabad");
		ExtentReport.logMessage(Status.INFO, "click on delivery address", false);
		
	//	click_on_selected_address.click();
	//	ExtentReport.logMessage(Status.INFO, "click on selected address", false);
	}
}