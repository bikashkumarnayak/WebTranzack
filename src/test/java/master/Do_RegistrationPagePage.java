package master;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.abstech.tranzack.HomePage;
import PageObject.DoRegistration;
import PageObject.LogInPage;
import resource.Base;

public class Do_RegistrationPagePage extends Base {
	public DoRegistration dr;
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
	public void doRegistration() throws InterruptedException {
		dr=new DoRegistration(driver);
		dr.getMaster();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.getclk_DoRegistration();
		String print_Do_Registration=dr.getDoregistration_checking();
		System.out.println("print_Do_Registration");
		assertion=new SoftAssert();
		assertion.assertEquals(print_Do_Registration, "D.o registration");
		assertion.assertAll();
		System.out.println("assertion passed do registration");
		dr.getframe();
		Thread.sleep(7000                                                                                         );
	}

}
