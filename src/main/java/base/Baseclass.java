package base;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Baseclass  {
	
	
	public static  WebDriver driver;
	
	
	//Configfile conf = new Configfile();
	public static WebDriver getBrowse(String browser) {
		try {
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",".\\chromedriver.exe");
				
	//ChromeOptions options = new ChromeOptions();
	//options.addArguments("headless");
			driver = new ChromeDriver();
		}else
		{
			System.out.println("Invalid Browser");
		}
		
	}catch(Exception e) {
		e.printStackTrace();
		
	}
		return driver;

}
	public static void waitForElemnteisbility(WebElement element) {
		try {
		WebDriverWait we = new WebDriverWait(driver,60);
		we.until(ExpectedConditions.visibilityOf(element));
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void clickelemnt(WebElement element) {
		waitForElemnteisbility(element);
		try {
			element.click();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void inputValuesToTextfiled(WebElement element,String value) {
		waitForElemnteisbility(element);
		try {
		element.sendKeys(value);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void movetoelemnt(WebElement element) {
		waitForElemnteisbility(element);
		try {
		Actions ac= new Actions(driver);
		ac.moveToElement(element).build().perform();
		
	}catch(Exception e) {
		
	}
		
}
	
	public static void selectthings(WebElement element,int index,String value,String option) {
		Select se = new Select(element);
		if(option.equalsIgnoreCase("value")) {
			se.selectByValue(value);		
		}
		else if(option.equalsIgnoreCase("index")) {
			se.selectByIndex(Integer.parseInt(value));
		}
		else if(option.equalsIgnoreCase("visibletext")) {
			se.selectByVisibleText(value);
		}
	
		
		
	}
	
	public static void getScreenshot(WebDriver driver,String Name) throws IOException {
		 
				try {

					TakesScreenshot scr = (TakesScreenshot)driver;
					System.out.println("step2");
					File sur = scr.getScreenshotAs(OutputType.FILE);
					System.out.println("step3");
					File desfile = new File(System.getProperty("user.dir")+"\\Screenshots\\"+Name+".png");
					
					FileUtils.copyFile(sur, desfile);
					System.out.println("step4");
				} catch (WebDriverException e) {
					e.printStackTrace();
				}
			

}
	}


