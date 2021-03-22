package seleniumgluecode;

import java.awt.event.ActionEvent;
import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

import dataProvider.Configfile;
import page.Newrajipage;

public class Login {
	WebDriver driver;
	Configfile config = new Configfile();
	@Given("^click alert button$")
	public void click_alert_button() {
		 
		try {
//			Properties pro =  new Properties();
//					String path ="Config/Configurations.properties";
//			FileInputStream loct = new FileInputStream(path);
//			pro.load(loct);
			String path1=config.getData("driverPath");
			System.out.println(path1);
			System.setProperty("webdriver.chrome.driver",config.getData("driverPath"));
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		driver = new ChromeDriver();
		try {
		driver.get(config.getData("url"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		
		
		
	}
	@And("^click ok$")
	public void click_ok() throws Throwable {
		boolean staleElement =true;
		Actions ac = new Actions(driver);
		try {
		Newrajipage page = new Newrajipage(driver);
		List<WebElement> abt = driver.findElements(By.xpath("//*[@class='menu-hero-header-menu-container']/child::ul//li"));
		
		
		for(WebElement che :abt ) {
			
			if (che.getText().equalsIgnoreCase("Media Hub")) {
				
				ac.moveToElement(che).build().perform();
				WebElement subm = driver.findElement(By.xpath("//*[@id='vitale-sub-menu']//div/ul/li[3]"));
				ac.moveToElement(subm).click().build().perform();
				staleElement=false;
				}
			}
		}
		catch(StaleElementReferenceException  e) {
			staleElement =true;
			}
		
	JavascriptExecutor exc = (JavascriptExecutor)driver;
	
	//exc.executeScript(arguments[0].);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//	ac.sendKeys(Keys.PAGE_DOWN);
		
		ac.moveToElement(driver.findElement(By.xpath("//*[@id='linked-Legal Solutions']")));
		driver.findElement(By.xpath("//*[@id='linked-Claims Solutions']")).click();
		try {
			ac.moveToElement(driver.findElement(By.xpath("(//*[@class='tv-archive__play position-center bg-contain'])[1]")));
			driver.findElement(By.xpath("(//*[@class='tv-archive__play position-center bg-contain'])[1]")).click();
				staleElement=false;
			}
		catch(StaleElementReferenceException  e){
			staleElement=true;
		}
		
		}
		
	
	



		
	
//		driver.findElement(By.xpath("//*[@class='test-overlay-content hide-below-mobile']//div[1]")).click();
//	driver.findElement(By.xpath("//*[@class='test-overlay-content hide-below-mobile']//div[2]")).click();
	
	


}
