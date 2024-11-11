package bastisapp.pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import com.aventstack.extentreports.Status;
import bastisapp.reports.ExtentReport;
import bastisapp.base.BasePage;

public class HomePage extends BasePage {
	ChromeDriver driver = new ChromeDriver();

	@FindBy(xpath = "//div[@class='top-logo']//a")
	WebElement Multi_Restaurant_Img;

	
	@FindBy(xpath= "//div[@class='col d-flex justify-content-start align-items-center']//p[@class='m-0'][normalize-space()='© Karenderia']")
	WebElement labelMsgCopyRight;
	
			
	public HomePage(WebDriver driver) { 
		super(driver);	
	}
	
 
	public void navigateMultiRestaurant() { 

		Multi_Restaurant_Img.click();
		ExtentReport.logMessage(Status.INFO, "Click on Multi Restaurant Image ", false);
	}
	public void verifyCopyRightMessage() { 
		String actualMsg = "© Karenderia"; 
		String expectedMsg = labelMsgCopyRight.getText();
		Assert.assertEquals(actualMsg,expectedMsg, "Verify Copy Right Message"); 
		ExtentReport.logMessage(Status.INFO, "Verify Copy Right Message ", false);
		}
	
	public void closeBrowser() {
		driver.quit();
	}
}
