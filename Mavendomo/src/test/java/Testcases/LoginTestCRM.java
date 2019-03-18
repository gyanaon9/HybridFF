package Testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.BaseClass;
import Pages.LoginPage;
import Utility.BrowserFactory;
import Utility.ExcelDataProvider;
import Utility.Helper;

public class LoginTestCRM extends BaseClass {


	@Test  
	public void loginApp() {
		//logger=report.createTest("Login to CRM");

		ExcelDataProvider excel=new ExcelDataProvider();

		//logger.info("starting Application");

		//logger.pass("Login done sucessfully"); 


		LoginPage loginPage=PageFactory.initElements(d, LoginPage.class);

			loginPage.loginToCRM(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
		BrowserFactory.QuitBrowser(d);
		Helper.captureScreenshot(d);

	}

}

