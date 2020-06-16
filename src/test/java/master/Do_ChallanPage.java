package master;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.abstech.tranzack.HomePage;

import PageObject.DoChallan;
import PageObject.LogInPage;
import resource.Base;

public class Do_ChallanPage extends Base {
	public DoChallan dc;
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
	public void dochallan() throws InterruptedException {
		dc = new DoChallan(driver);
		dc.getMaster();
		log.info("successfully click master in DoChallan");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dc.getclk_Dochallan();
		log.info("Successfully click Dochallan");
		String dochallanPrint = dc.getDochallan_checking();
		System.out.println(dochallanPrint);
		assertion = new SoftAssert();
		assertion.assertEquals(dochallanPrint, "D.o challan");
		assertion.assertAll();
		System.out.println("assertion passed");
		dc.getframe();
		System.out.println("successfully enter frame");
		Thread.sleep(5000);

	}
	@AfterTest
	public void teardown() {
		driver.quit();
		driver = null;
	}

}
