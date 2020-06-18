package reports;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.abstech.tranzack.HomePage;
import PageObject.EventReports;
import PageObject.LogInPage;
import resource.Base;

public class Event_ReportsPage extends Base {
	public EventReports er;
	SoftAssert assertion;
	public static Logger log=org.apache.logging.log4j.LogManager.getLogger(HomePage.class.getName());
	@BeforeTest
	public void initialize() throws Exception {
		driver = initializeDriver();
		log.info("lunching browser");
		driver.get(prop.getProperty("URL"));
		log.info("lunch url");
	}

	@BeforeTest
	public void login() throws InterruptedException {
		LogInPage lp = new LogInPage(driver);
		log.info("navigate Login page Successfully ");
		lp.getuser().sendKeys(prop.getProperty("username"));
		log.info("successfully enter");
		lp.getpass().sendKeys(prop.getProperty("password"));
		log.info("successfully enter");
		lp.getcheck().click();
		log.info("Successfully click");
		WebElement loginButton=lp.getlogin();
		lp.getborder(loginButton);
		lp.getlogin().click();
		log.info("login page login Successfully");
		Thread.sleep(15000);

	}
	@Test
	public void clk_Reports_EventReports() throws InterruptedException {
		er=new EventReports(driver);
		er.getReports();
		log.info("Click Successfully Reports");
		er.getclk_EventReports();
		log.info("Clk Successfully Event Reports");
		Thread.sleep(5000);
		String printEvent_Reports=er.getEventReports_checking();
		System.out.println(printEvent_Reports);
		assertion=new SoftAssert();
		assertion.assertEquals(printEvent_Reports, "Event reports");
		System.out.println("assertion passed");
		log.info("Successfully check eventreports page");
	    Thread.sleep(5000);
	    er.getframe();
	    Thread.sleep(5000);
	    log.info("successfully enter frame in eventreports page");
	    
		
	}
	@AfterTest
	public void teardown() {
		driver.quit();
		driver = null;
	}
	

}
