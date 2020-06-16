package hsd;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.abstech.tranzack.HomePage;

import PageObject.DieselPurches;
import PageObject.LogInPage;
import resource.Base;

public class Diesel_PurchasePage extends Base {
	public DieselPurches dp;
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
	public void hr_SalarySheet() throws InterruptedException {
		dp=new DieselPurches(driver);
		  assertion=new SoftAssert();
		  dp.gethsd();
		  log.info("clk successfully hr");
		  dp.getclkDiselPurches();
		  log.info("clk successfully Salary Sheet ");
		  Thread.sleep(5000);
		  assertion.assertEquals(dp.getcheckingDiselPurches(), "Diesel purchase");
		  assertion.assertAll();
		  System.out.println("assertion passed");
		  Thread.sleep(5000);
		  dp.getframe();
		  Thread.sleep(7000);
	}
	@AfterTest
	public void teardown() {
		driver.quit();
		driver = null;
	}


}
