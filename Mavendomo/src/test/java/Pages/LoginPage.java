package Pages;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;

	public class LoginPage {
		
		WebDriver d;
		public LoginPage(WebDriver ld) {
	    this.d=ld;
	}
		@FindBy(name="username") WebElement uname;
		@FindBy(name="password") WebElement pass;
		@FindBy(xpath="//input[@value='Login']") WebElement LoginButton;
		
		public void loginToCRM(String usernameApplication,String passwordApplication) {
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
			}
			
			uname.sendKeys(usernameApplication);
			pass.sendKeys(passwordApplication);
			LoginButton.click();
	}
	}
