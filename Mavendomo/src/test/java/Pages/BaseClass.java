package Pages;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import Utility.BrowserFactory;
import Utility.ConfigDataProvider;
import Utility.ExcelDataProvider;
import Utility.Helper;

public class BaseClass {


	public WebDriver d;
	public ExcelDataProvider excel;
	public ConfigDataProvider config;
	
	@BeforeSuite
	public void SetUpsuite() {
		
		excel=new ExcelDataProvider();
		config=new ConfigDataProvider(); 
	}
	
	
	@BeforeClass
	public void setup() {
		d=BrowserFactory.startApplication(d, "Chrome", "https://classic.crmpro.com/index.html");
	}

	
	
	@AfterClass
	public void teardown() {

		BrowserFactory.QuitBrowser(d);
	}

	@AfterMethod
	public void tearDownMethod(ITestResult result ) {
		if(result.getStatus()==ITestResult.FAILURE)
		{
			Helper.captureScreenshot(d);
		}
	}

}
