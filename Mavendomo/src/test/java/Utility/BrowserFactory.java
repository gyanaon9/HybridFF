 package Utility;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;


	public class BrowserFactory {
		
		public static WebDriver startApplication(WebDriver d,String browserName,String appURL) {
			
			if(browserName.equals("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
				d=new ChromeDriver();
				
			}
			else if(browserName.equals("Firefox"))
			{
				System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
				d=new FirefoxDriver();
			}
			else if(browserName.equals("IE"))
			{
				System.setProperty("webdriver.ie.driver","./Drivers/IEDriverServer.exe");
				d=new InternetExplorerDriver();
			}
			d.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
			d.manage().window().maximize();
			d.get(appURL);
			d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			return d;

	}
		public static void QuitBrowser(WebDriver d) {
			d.quit();
	}
	}