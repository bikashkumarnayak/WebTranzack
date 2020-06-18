package reports;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.abstech.tranzack.HomePage;
import PageObject.GpsTrips;
import PageObject.LogInPage;
import resource.Base;

public class Gps_TripsPage extends Base {
	public GpsTrips gt;
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
	public void clk_Gps_TripReports() throws InterruptedException {
		gt=new GpsTrips(driver);
		gt.getReports();
		log.info("Successfully enter report module");
		gt.getGps_Reports();
		log.info("successfully enter gpsTripReports");
		String printGpsReports=gt.getCheck_EventReports();
		System.out.println(printGpsReports);
		assertion=new SoftAssert();
		assertion.assertEquals(printGpsReports, "Gps trips");
		System.out.println("assertion passed ");
		log.info("check successfully gps trip reports");
		Thread.sleep(5000);
		gt.getframe();
	    log.info("Successfully enter frame in the gps trip reports");
		Thread.sleep(5000);
		
		
	}
	@AfterTest
	public void teardown() {
		driver.quit();
		driver = null;
	}
	
}
