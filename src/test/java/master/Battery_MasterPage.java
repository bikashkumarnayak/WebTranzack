package master;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.abstech.tranzack.HomePage;

import PageObject.BatteryMaster;
import PageObject.Dashboard;
import PageObject.LogInPage;
import resource.Base;

public class Battery_MasterPage extends Base {
	public Dashboard d;
	public BatteryMaster bm;
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
	public void master_clkBatteryMaster() throws InterruptedException {
		bm = new BatteryMaster(driver);
		bm.getMaster();
		Thread.sleep(5000);
		bm.getclk_Batterymaster();
		log.info("Successfully click add tyre to vehicle sub module ");
		Thread.sleep(5000);
		assertion = new SoftAssert();
		assertion.assertEquals(bm.getBattery_checking(), "Battery master");
		log.info("Successfully passed");
		assertion.assertAll();
		System.out.println("assertion pass");
		bm.getframe();
		log.info("Successfully enter frame");

	}

	@AfterTest
	public void teardown() {
		driver.quit();
		driver = null;
	}
}
