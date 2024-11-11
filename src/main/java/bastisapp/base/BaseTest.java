package bastisapp.base;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import bastisapp.dataaccess.ExcelUtil;
import bastisapp.dataaccess.PropertyUtil;
import bastisapp.reports.ExtentReport;

public class BaseTest {
	private static WebDriver driver;

	String testName;
	ExtentReport  extentReport = new ExtentReport();
	public static ExtentTest test;

	@BeforeSuite
	public void intialize() throws IOException {
		PropertyUtil.initProperty();
		ExcelUtil.intializeExcel();
		ExcelUtil.readAllDataFromExcel();
		extentReport.initializeReport();
	}

	@BeforeMethod
	public void launchBrowser(Method method) {
		testName = method.getName();

		test = extentReport.createExtentTest(testName, "Login");

		String browserName = PropertyUtil.readPropertyValue("browsername");
		String path = System.getProperty("user.dir");

		if (browserName.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", path + "\\src\\test\\resources\\drivers\\chromedriver.exe");

			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", path + "\\src\\test\\resources\\drivers\\msedgedriver.exe");

			driver = new EdgeDriver();
		}

		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	}

	@BeforeMethod(dependsOnMethods = "launchBrowser")
	public void launchApplication()  {
		String url = PropertyUtil.readPropertyValue("url");
		driver.get(url);
		ExtentReport.logMessage(Status.INFO, "Enter URL: " +url , false);
	}
		
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public String getData(String colName) {
		return ExcelUtil.readData(testName,colName);
	}

	@AfterSuite
	public void tearDown() {
		extentReport.flushTests();
	}
}
