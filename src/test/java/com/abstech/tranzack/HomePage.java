package com.abstech.tranzack;

import org.testng.annotations.Test;

import PageObject.LogInPage;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import resource.Base;

public class HomePage extends Base {
	public static Logger log=org.apache.logging.log4j.LogManager.getLogger(HomePage.class.getName());
	@BeforeTest
	public void initialize() throws Exception {

		driver = initializeDriver();
		log.info("initialize the browser");
		driver.get(prop.getProperty("URL"));
	}

//@Test(dataprovider=getData)
// public void homepageNav(String username,String password) throws Exception {
	
	
	@Test
	public void homepageNav() throws Exception {
		driver.get(prop.getProperty("URL"));
		log.info("Navigate Successfully");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		LogInPage lp = new LogInPage(driver);
		log.info("navigate Login page Successfully ");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		lp.getuser().sendKeys(prop.getProperty("username"));
		log.info("successfully enter");
		lp.getpass().sendKeys(prop.getProperty("password"));
		log.info("successfully enter");
		WebElement loginButton=lp.getlogin();
		lp.getborder(loginButton);
		lp.getlogin().click();
		log.info("login page login Successfully");
		


	}
	@AfterTest
	public void teardown()
	{		
		driver.quit();
		driver=null;
	}
//	@DataProvider
//	public Object[][] getData() {
//		Object[][] data=new Object[2][2];
//		data[0][0]="tapas";
//		data[0][1]="7272@tapas";
//		return data;
//	}
}
