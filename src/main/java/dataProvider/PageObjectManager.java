package dataProvider;

import org.openqa.selenium.WebDriver;

import page.Loginpage;

public class PageObjectManager {
	
	public static WebDriver driver;
	private Loginpage log;
	
	public PageObjectManager(WebDriver driver2) {
		this.driver=driver2;
		
	}

	public Loginpage getLog() {
		log = new Loginpage(driver);
		return log;
	}

	
	
	

}
