
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;


	public class TestCaseWithoutFF {

		
			@Test
			public void NoDriver() {

				System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
				WebDriver d = new ChromeDriver();
				d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				d.get("https://classic.crmpro.com/index.html");	
				d.manage().window().maximize();

				d.findElement(By.name("username")).sendKeys("Selenium_50");


				d.findElement(By.name("password")).sendKeys("Abcd@123456");
				d.findElement(By.xpath("//input[@value='Login']")).click();
				//d.quit();
			}
	}
