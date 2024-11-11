package bastisapp.pages;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.Status;

import bastisapp.base.BasePage;
import bastisapp.reports.ExtentReport;


public class Chinesepage extends BasePage {
	@FindBy(xpath = "//div[@class='owl-item active']//a[@class='d-block bg-light rounded-pill'][normalize-space()='Chinese']")
	WebElement navigate_chinesepage;

public Chinesepage(WebDriver driver) {
		super(driver);
	}

public void navigatechinesepage()throws  Exception {
	navigate_chinesepage.click();
	ExtentReport.logMessage(Status.INFO, "click on chinese page", false);
}

}
