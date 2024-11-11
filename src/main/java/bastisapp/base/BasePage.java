package bastisapp.base;

import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;
import bastisapp.reports.ExtentReport;

public class BasePage {

	private static WebDriver driver;

	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		BasePage.driver=driver;
		
	}

	public void validateField(String expected,String actual,String message) {
		if (expected.equals(actual)) {

			ExtentReport.logMessage(Status.PASS,
					message+"<BR> Expected: " + expected + "<BR>Actual: " + actual,
					true);
		} else {

			ExtentReport.logMessage(Status.FAIL,
					message +"<BR> Expected: " + expected + "<BR>Actual: " + actual,
					true);
		}
	}


	public void validateField(int expected,int actual,String message) {
		if (expected==actual) {

			ExtentReport.logMessage(Status.PASS,
					message+"<BR> Expected: " + expected + "<BR>Actual: " + actual,
					true);
		} else {

			ExtentReport.logMessage(Status.FAIL,
					message +"<BR> Expected: " + expected + "<BR>Actual: " + actual,
					true);
		}
	}

	public void validateField(List<String> expected,List<String> actual,String message) {
		if (expected.equals(actual)) {

			ExtentReport.logMessage(Status.PASS,
					message+"<BR> Expected: " + expected + "<BR>Actual: " + actual,
					true);
		} else {

			ExtentReport.logMessage(Status.FAIL,
					message +"<BR> Expected: " + expected + "<BR>Actual: " + actual,
					true);
		}
	}

	public static void jsClickOnElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].click();", element);
	}

	public static WebDriver getDriver() {
		return driver;
	}


	public void validateField(boolean expected,boolean actual,String message) {
		if (expected==actual) {

			ExtentReport.logMessage(Status.PASS,
					message+"<BR> Expected: " + expected + "<BR>Actual: " + actual,
					true);
		} else {

			ExtentReport.logMessage(Status.FAIL,
					message +"<BR> Expected: " + expected + "<BR>Actual: " + actual,
					true);
		}
	}

}
