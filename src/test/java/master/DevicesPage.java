package master;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.abstech.tranzack.HomePage;

import PageObject.Devices;
import PageObject.LogInPage;
import resource.Base;

public class DevicesPage extends Base {
	public Devices de;
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
	public void clkMaster_Device() throws InterruptedException {
		de=new Devices(driver);
		de.getMaster();
		log.info("clk successfully master");
		de.getclk_Devices();
		Thread.sleep(5000);
		log.info("Successfully enter Device Sub module");
		String printDevice=de.getDevices_checking();
		System.out.println(printDevice);
		 assertion=new SoftAssert();
		 assertion.assertEquals(printDevice, "Devices");
		 assertion.assertAll();
		 System.out.println("assertion checked Device page");
		 Thread.sleep(5000);
		 de.getframe();
		 log.info("successfully enter frame in Device Sub module");
		 Thread.sleep(7000);
		

	}


}
