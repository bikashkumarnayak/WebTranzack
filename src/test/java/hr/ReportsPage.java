package hr;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.abstech.tranzack.HomePage;

import PageObject.HRReports;
import PageObject.LogInPage;
import resource.Base;

public class ReportsPage extends Base {
	public HRReports hr;
	SoftAssert assertion;
	public static Logger log = org.apache.logging.log4j.LogManager.getLogger(HomePage.class.getName());

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
		WebElement loginButton = lp.getlogin();
		lp.getborder(loginButton);
		lp.getlogin().click();
		log.info("login page login Successfully");
		Thread.sleep(15000);

	}

	@Test
	public void hr_reports() throws InterruptedException {
		HRReports hr=new HRReports(driver);
		hr.getHr();
		Thread.sleep(5000);
		hr.getclkHR_Reports();
		SoftAssert assertion=new SoftAssert();
		assertion.assertEquals(hr.getchecking_Reports(), "Reports");
		assertion.assertAll();
		System.out.println("assert passed");
		hr.getframe();
		
	}
	@AfterTest
	public void teardown() {
		driver.quit();
		driver = null;
	}

}
