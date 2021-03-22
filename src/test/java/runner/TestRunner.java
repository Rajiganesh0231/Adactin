package runner;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.TestNGCucumberRunner;
import dataProvider.FileReaderManager;
import cucumber.api.testng.CucumberFeatureWrapper;

import java.io.File;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import base.Baseclass;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/feature/Adactin.feature",
        glue = {"seleniumgluecode"},
        tags = {"@Ada"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:Reports/CucumberTestReport1.html"},
        monochrome = true
        )
public class TestRunner {
    public static WebDriver driver;
    
    @BeforeClass
    public static void setUp() throws Exception{
    	
    	String browsername = FileReaderManager.getInstance().getCrInstance().getData("BrowserName");
    	driver = Baseclass.getBrowse(browsername);
    	
    }
 

}
