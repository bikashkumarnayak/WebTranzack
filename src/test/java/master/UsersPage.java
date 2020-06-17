package master;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.abstech.tranzack.HomePage;
import PageObject.LogInPage;
import PageObject.Users;
import resource.Base;

public class UsersPage extends Base {
	public Users u;
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
	public void master_clkGroups() throws InterruptedException {
		u = new Users(driver);
		u.getMaster();
		Thread.sleep(5000);
		u.getclk_Groups();
		log.info("Successfully click add tyre to vehicle sub module ");
		Thread.sleep(5000);
		String printUser=u.getGroups_checking();
		System.out.println(printUser);
		assertion = new SoftAssert();
		assertion.assertEquals(printUser, "Groups");
		log.info("Successfully passed");
		assertion.assertAll();
		System.out.println("assertion pass");
		u.getframe();
		log.info("Successfully enter frame");
		Thread.sleep(5000);

	}


}
