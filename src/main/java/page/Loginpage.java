package page;



	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;
	import org.openqa.selenium.support.PageFactory;

	public class Loginpage {
		
		//why webelement
		@FindBy(how=How.XPATH,using="//*[@class='login']")
		private WebElement signin;
		
		@FindBy(how=How.XPATH,using="//*[@id='email']")
		private WebElement createacc;
		
		@FindBy(how=How.XPATH,using="//*[@id='passwd']")
		private WebElement pass;
		
		@FindBy(how=How.XPATH,using="//*[@id='SubmitLogin']")
		
		
		
		private WebElement clickcreate;
		@FindBy(how=How.XPATH,using="//*[@class='login_title']")
		private WebElement adactinTITLE;
		
	

		

		public Loginpage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			
		}
		
		public WebElement getSignin() {
			return signin;
		}

		

		public WebElement getAdactinTITLE() {
			return adactinTITLE;
		}
//		public WebElement getCreateacc() {
//			return createacc;
//		}

		public WebElement getPass() {
			return pass;
		}

		public WebElement getClickcreate() {
			return clickcreate;
		}
		public WebElement getCreateacc() {
			// TODO Auto-generated method stub
			return createacc;
		}
		


		

	}



