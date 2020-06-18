package reports;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.abstech.tranzack.HomePage;

import PageObject.HistoricPlayback;
import PageObject.LogInPage;
import resource.Base;

public class Historic_PlaybackPage extends Base {
	public HistoricPlayback hp;
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
	public void getclkHistoric_Payback() throws InterruptedException {
	hp=new HistoricPlayback(driver);
	hp.getReports();
	log.info("Successfully enter reports module");
	hp.getClk_Historic_PayBack();
	log.info("Successfully enter Historic payback sub module");
	Thread.sleep(5000);
	String print_HP=hp.getcheck_Historic_Payback();
	System.out.println(print_HP);
	assertion=new SoftAssert();
	assertion.assertEquals(print_HP, "Historic playback");
	log.info("verifay the Historic payback sub module");
	Thread.sleep(5000);
	hp.getfrme();
	log.info("Successfully enter frame");
	Thread.sleep(5000);
		
	}
	@AfterTest
	public void teardown() {
		driver.quit();
		driver = null;
	}

}
