package CICDHandson.CICDHandson;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class AppTest{
	WebDriver dr;
	
	@BeforeMethod
	public void launchDriver() {
		System.setProperty("webdriver.gecko.driver","/usr/local/bin/geckodriver");	
    	 dr= new FirefoxDriver();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.manage().window().maximize();
	}
	
	@Test
	public void test1() {
		dr.get("https://www.AutomationTalks.com");
		String title=dr.getTitle();
		System.out.println(title);
		
	}
	@Test
    public void test2() {
    	dr.get("https://www.AutomationTalks.com");
		String title=dr.getTitle();
		System.out.println("title is " + title);
		
	}
	@AfterMethod
    public void close() {
		dr.quit();
    	
    }
}
