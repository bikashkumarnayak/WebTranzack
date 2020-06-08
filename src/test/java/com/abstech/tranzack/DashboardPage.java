package com.abstech.tranzack;

import org.testng.annotations.Test;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import PageObject.Dashboard;
import PageObject.LogInPage;
import resource.Base;

public class DashboardPage extends Base {
	public Dashboard d;
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
	public void movemaster() throws InterruptedException {
		
		d = new Dashboard(driver);
		log.info("move mouse ");
		d.getmaster();
		log.info("Successfully move crosser in master");
		Thread.sleep(5000);
	}
	@Test(priority=1)
	public void moveReport() throws InterruptedException {
		d = new Dashboard(driver);
		log.info("move mouse ");
		d.getreport();
		log.info("Successfully move crosser in reports");
		Thread.sleep(5000);
	}
	@Test(priority=2)
	public void moveHSD() throws InterruptedException {
		d = new Dashboard(driver);
		log.info("move mouse ");
		d.gethsd();
		log.info("Successfully move crosser in HSD");
		Thread.sleep(5000);
	}
	@Test(priority=3)
	public void moveHR() throws InterruptedException {
		d = new Dashboard(driver);
		log.info("move mouse ");
		d.gethr();
		log.info("Successfully move crosser in HR");
		Thread.sleep(5000);
	}
	@Test(priority=4)
	public void moveTyre() throws InterruptedException {
		d = new Dashboard(driver);
		log.info("move mouse ");
		d.gettyre();
		log.info("Successfully move crosser in Tyre");
		Thread.sleep(5000);
	}
	@Test(priority=5)
	public void moveApproval() throws InterruptedException {
		d = new Dashboard(driver);
		log.info("move mouse ");
		d.getapproval();
		log.info("Successfully move crosser in Approval");
		Thread.sleep(5000);
	}
	@Test(priority=6)
	public void moveStoreAndPur() throws InterruptedException {
		d = new Dashboard(driver);
		log.info("move mouse ");
		d.getstore();
		log.info("Successfully move crosser in Store & Purchase");
		Thread.sleep(5000);
	}
	@Test(priority=7)
	public void moveFinance() throws InterruptedException {
		d = new Dashboard(driver);
		log.info("move mouse ");
		d.getfinance();
		log.info("Successfully move crosser in Finance");
		Thread.sleep(5000);
	}
	@Test(priority=9)
	public void clickmenu() throws InterruptedException {
		d = new Dashboard(driver);
		log.info("move mouse ");
		d.getmenu();
		log.info("Successfully click Finance");
		Thread.sleep(5000);
	}


	@Test(priority=10)
	public void clickMaster() throws InterruptedException {
		d = new Dashboard(driver);
		log.info("move mouse ");
		d.getclkMaster();
		Thread.sleep(5000);
	}

	@Test(priority=11)
	public void clickReports() throws InterruptedException {
		d = new Dashboard(driver);
		log.info("move mouse ");
		d.getclickReport();
		log.info("Successfully click Reports");
		Thread.sleep(5000);
	}

	@Test(priority=12)
	public void clickhsd() throws InterruptedException {
		d = new Dashboard(driver);
		log.info("move mouse ");
		d.getclickHSD();
		log.info("Successfully click HSD");
		Thread.sleep(5000);
	}

	@Test(priority=13)
	public void clickHR() throws InterruptedException {
		d = new Dashboard(driver);
		log.info("move mouse ");
		d.getclickHResource();
		log.info("Successfully click HR");
		Thread.sleep(5000);
	}

	@Test(priority=14)
	public void clickTyre() throws InterruptedException {
		d = new Dashboard(driver);
		log.info("move mouse ");
		d.getclickTyre();
		log.info("Successfully click Tyre");
		Thread.sleep(5000);
	}

	@Test(priority=15)
	public void clickApproval() throws InterruptedException {
		d = new Dashboard(driver);
		log.info("move mouse ");
		d.getclickApproval();
		log.info("Successfully click Approval");
		Thread.sleep(5000);
	}

	@Test(priority=16)
	public void clickStore() throws InterruptedException {
		d = new Dashboard(driver);
		log.info("move mouse ");
		d.getclickStoreP();
		log.info("Successfully click S&P");
		Thread.sleep(5000);
	}

	@Test(priority=17)
	public void clickFinance() throws InterruptedException {
		d = new Dashboard(driver);
		log.info("move mouse ");
		d.getclickFinance();
		log.info("Successfully click Finance");
		Thread.sleep(5000);
	}
	@Test(priority=18)
	public void clickmenuAgain() throws InterruptedException {
		d = new Dashboard(driver);
		log.info("move mouse ");
		d.getmenu();
		log.info("Successfully click Finance");
		Thread.sleep(3000);
	}
	
	
	@AfterTest
	public void teardown() {
		driver.quit();
		driver = null;
	}

}