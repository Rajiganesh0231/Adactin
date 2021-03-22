package seleniumgluecode;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import base.Baseclass;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import dataProvider.Configfile;
import dataProvider.PageObjectManager;
import page.Loginpage;
import page.Newrajipage;


public class Automationexcer extends Baseclass {
WebDriver driver;

Configfile conf = new Configfile();
PageObjectManager pom = new PageObjectManager(driver);




	@Given("^Launch Automation app$")
	public void Launch_Automation_app() {
		
			
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Deepak\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");

				driver = new ChromeDriver();
			
			
			 
//			WebElement analysis =driver.findElement(By.xpath("//*[@title='Navigation Menu']//following::ul/li[2]/a[text()='Analysis']"));
//			driver.findElement(By.tagName("a"));
//			analysis.click();
//			List<WebElement> gra = driver.findElements(By.xpath("(//*[@class='overallGrades'])[2]/span[@title]"));
//			
//			for(WebElement vi : gra){
//				System.err.println(vi.getAttribute("title"));
//				
//			}
			
			//dr.selectByValue("Nursery Schools");
			
//			List<WebElement> hi = driver.findElements(By.xpath("//*[@id='js-dropdown-phase']/ul"));
//			for(WebElement che:hi) {
//				if (che.getText().equalsIgnoreCase("Primary Schools"));
//			}
			
//			Newrajipage pag = new Newrajipage(driver);
//			movetoelemnt(pag.getWomen());
//			Actions ac = new Actions(driver);
////			ac.moveToElement(driver.findElement(By.xpath("(//*[@title='Women'])[1]"))).build().perform();
////			driver.findElement(By.xpath("(//*[@title='Casual Dresses'])[1]")).click();
//			JavascriptExecutor exc = (JavascriptExecutor)driver;
//			exc.executeScript("window.scrollBy(0,600)");
//			movetoelemnt(pag.printwodess());
//			movetoelemnt(pag.Casualdressop());
//			clickelemnt(pag.Casualdressop());
//			
//			driver.switchTo().frame(pag.framconcept());
//			clickelemnt(pag.plusincrease());
//			clickelemnt(pag.addtocart());
//			driver.switchTo().defaultContent();
//			exc.executeScript("window.scrollBy(0,800)");
//			clickelemnt(pag.proceedtocart());
//			clickelemnt(pag.proceedmaincart());
//			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//			exc.executeScript("window.scrollBy(0,600)");
//			Loginpage log = new Loginpage(driver);
			//inputValuesToTextfiled(pom.getLog().getCreateacc(), "rajiraji0231@gmail.com");
//			inputValuesToTextfiled(log.getPass(), "123456");
//			clickelemnt(log.getClickcreate());
			
			
//			exc.executeScript("window.scrollBy(0,800)");
//			clickelemnt(pag.proceed());
//			clickelemnt(pag.terms());
//			clickelemnt(pag.proceed1());
//			clickelemnt(pag.bankwire());
//			clickelemnt(pag.ordersubmit());
//			clickelemnt(pag.logo());
//			driver.findElement(By.xpath("(//*[@title='Contact Us'])")).click();
//			exc.executeScript("window.scrollBy(0,600)");
//			WebElement mes = driver.findElement(By.xpath("//*[@id='message']"));
//			mes.sendKeys("hi");
//			   WebElement browse = driver.findElement(By.xpath("//*[@id='fileUpload']"));
//			   //click on ‘Choose file’ to upload the desired file
//			   browse.sendKeys("C:\\Users\\Deepak\\Desktop\\selenium\\Class_Automation\\hi.txt");
			
//			ac.moveToElement(driver.findElement(By.xpath("//*[@id='homefeatured']/li[2]"))).click().perform();
//			
//			ac.moveToElement(driver.findElement(By.xpath("//*[@title='Blouse']"))).click().perform();
//			driver.switchTo().frame(pag.dressframe());
//			ac.moveToElement(pag.firstframe()).click().perform();
//			driver.close();
//			
			
			
			
			
		
		
		
	}
}
