package master;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.abstech.tranzack.HomePage;

import PageObject.FreightPaymentVoucher;
import PageObject.LogInPage;
import resource.Base;

public class Freight_Payment_VoucherPage extends Base {
	public FreightPaymentVoucher fp;
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
	public void master_clkFreightPaymentVoucher() throws InterruptedException {
		fp=new FreightPaymentVoucher(driver);
		fp.getMaster();
		log.info("clk successfully FreightPaymentVoucher");
		fp.getclk_fright_Payment_voucher();
		log.info("clk successfully getclk_fright_Payment_voucher ");
		Thread.sleep(5000);
		String printFrightVoutcher=fp.getfright_Payment_voucher_checking();
		System.out.println(printFrightVoutcher);
		log.info("Successfull print printFrightVoutcher");
		assertion=new SoftAssert();
		assertion.assertEquals(printFrightVoutcher, "Freight payment voucher");
		assertion.assertAll();
		System.out.println("Assertion passed Freight payment voucher");
		fp.getframe();
		Thread.sleep(5000);
		

	}

	@AfterTest
	public void teardown() {
		driver.quit();
		driver = null;
	}


}
