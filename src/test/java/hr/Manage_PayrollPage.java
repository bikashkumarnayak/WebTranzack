package hr;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.abstech.tranzack.HomePage;

import PageObject.Dashboard;
import PageObject.LogInPage;
import PageObject.Managepayroll;
import resource.Base;

public class Manage_PayrollPage  extends Base {
	public  Managepayroll mp;
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
 public void hr_clkManagepayroll() throws InterruptedException {
	  mp=new Managepayroll(driver);
	  mp.getHr();
	  log.info("Successfully click hr");
	  Thread.sleep(5000);
	  mp.getclkManage_payroll();
	  log.info("Successfully clk manage payroll");
	  Thread.sleep(5000);
	  assertion=new SoftAssert();
	  assertion.assertEquals(mp.getchecking_manage_payroll(), "Manage payroll");
	  assertion.assertAll();
	  System.out.println("assertion passed");
	  log.info("Success fully passed checking manage payroll");
	  mp.getframe();
	  log.info("successfully enter");
	  Thread.sleep(5000);
 }
 @AfterTest
	public void teardown() {
		driver.quit();
		driver = null;
 }


}
