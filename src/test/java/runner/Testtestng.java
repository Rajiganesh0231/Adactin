package runner;




import org.testng.annotations.*;

public class Testtestng {
	@AfterTest(dependsOnMethods ="aftertest" )
	public void  aaeforemeth() {
		System.out.println("before suite");
		
	}
	@Test(priority = 1)
	public void test1() {
		System.out.println("please test");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("after test");
	}

}
