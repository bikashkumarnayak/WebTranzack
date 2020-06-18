package reports;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.abstech.tranzack.HomePage;

import PageObject.KtcTrips;
import PageObject.LogInPage;
import resource.Base;

public class Ktc_TripsPage extends Base {
	public KtcTrips k;
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
	public void clk_Ktc_Reports() throws InterruptedException {
		k=new KtcTrips(driver);
		k.getReports();
		log.info("Successfully enter reports module");
		k.getclkktc_Reports();
		String printktcreport=k.getCheck_reports();
		System.out.println(printktcreport);
		log.info("Successfully enter ktc report module");
		assertion=new SoftAssert();
		assertion.assertEquals(printktcreport, "Ktc trips");
		System.out.println("checking ktc trip reports");
		Thread.sleep(5000);
		k.getfream();
		log.info("Successfully enter frame");
		Thread.sleep(5000);
		
	}
	@AfterTest
	public void teardown() {
		driver.quit();
		driver = null;
	}

}
