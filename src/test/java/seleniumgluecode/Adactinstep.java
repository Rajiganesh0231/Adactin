package seleniumgluecode;

import java.io.File;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;

import base.Baseclass;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import dataProvider.FileReaderManager;
import dataProvider.PageObjectManager;

import page.Loginpage;
import runner.TestRunner;


public class Adactinstep extends Baseclass{
	
	public static WebDriver driver = TestRunner.driver;
	PageObjectManager pom = new  PageObjectManager(driver);
	@Before
	public void beforeHooks(Scenario scenario) {
		
		String name = scenario.getName();
		System.out.println("Scenario Name is :"+name);
		
	}
	@After
	public void afterHooks(Scenario scenario) throws IOException {
		String status = scenario.getStatus();
		System.out.println("Scenario status :"+status);
		if(scenario.isFailed()) {
			System.out.println("step1");
			getScreenshot(driver,scenario.getName());
			
		}
	}
	@After
    public static void writeExtentReport() {
		System.out.println("5");
     Reporter.loadXMLConfig(new File("config/Config.xml"));
    	driver.close();
    }
	@Given("^Lauch Adactin application$")
	public void Lauch_Adactin_application() throws Exception{
		
		System.setProperty("webdriver.chrome.driver",".\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(FileReaderManager.getInstance().getCrInstance().getData("url1"));
		String Title = driver.findElement(By.xpath("//*[@class='login_title']")).getText();
		System.out.println(Title);
		Assert.assertEquals("Existing  Login - Build 1", Title);
		
	}
	@Then("Enter \"([^\"]*)\" and \"<Password>\"")
	public void  Enter_and() {
		
	}

}
