package master;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.abstech.tranzack.HomePage;


import PageObject.LogInPage;
import PageObject.RouteMaster;
import resource.Base;

public class Route_MasterPage extends Base {
	public RouteMaster rm;
	public SoftAssert assertion;
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
	public void master_clkRoutMaster() throws InterruptedException {
		rm = new RouteMaster(driver);
		rm.getMaster();
		Thread.sleep(5000);
		rm.getclk_RoutMaster();
		log.info("Successfully click add tyre to vehicle sub module ");
		Thread.sleep(5000);
		String printGroup=rm.getRoutMaster_checking();
		System.out.println("printGroup");
		assertion = new SoftAssert();
		assertion.assertEquals(printGroup, "Route master");
		log.info("Successfully passed");
		assertion.assertAll();
		System.out.println("assertion pass");
		rm.getframe();
		log.info("Successfully enter frame");
		Thread.sleep(5000);

	}

	@AfterTest
	public void teardown() {
		driver.quit();
		driver = null;
	}


}
