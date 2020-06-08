package com.abstech.tranzack;

import java.util.List;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObject.Dashboard;
import PageObject.Driver;
import PageObject.LogInPage;
import resource.Base;

public class DriverPage extends Base {
	public Driver dr;
	public SoftAssert assertion;

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
		WebElement loginButton=lp.getlogin();
		lp.getborder(loginButton);
		lp.getcheck().click();
		log.info("Successfully click");
		lp.getlogin().click();
		log.info("login page login Successfully");
		Thread.sleep(10000);
		Dashboard d = new Dashboard(driver);
		d.gethr();
		log.info("Successfully click HR");
		Thread.sleep(10000);

	}

	@Test
	public void clickDepartment() throws InterruptedException {
		dr = new Driver(driver);
		dr.getDriver().click();
		log.info("Sucessfully click department page");
		Thread.sleep(10000);
		dr.getFrame();
		Thread.sleep(10000);
		log.info("Successfully find Frame");
		dr.getAddDriver().click();
		log.info("Successfully click AddDepartment Button");
		Thread.sleep(10000);

	}

	@Test(priority = 2)
	public void AddNewDriver() throws InterruptedException {
		dr = new Driver(driver);
		dr.getName().sendKeys(prop.getProperty("DName"));
		log.info("enter the driver name");
		dr.getFathersName().sendKeys(prop.getProperty("FathersName"));
		Thread.sleep(5000);
		log.info("enter Fathers Name");
		dr.getAddress().sendKeys(prop.getProperty("Address"));
		log.info("enter address");
		dr.getPhoneNo().sendKeys(prop.getProperty("PhoneNo"));
		log.info("enter Phone Number");
		dr.getCITY().sendKeys(prop.getProperty("CITY"));
		Thread.sleep(5000);
		log.info("enter city");
		dr.getSTATE().sendKeys(prop.getProperty("STATE"));
		log.info("enter city");
		dr.getDOB().click();
		while (!dr.getDOBmonth().getText().contains("JANUARY")) {
			dr.getDOBmonthclick().click();
		}
		while (!dr.getDOByear().getText().contains("JANUARY 2015")) {
			dr.getDOByearclick().click();
		}
		Thread.sleep(5000);
		List<WebElement> allDates = dr.getDOBDate();
		int allData = allDates.size();
		System.out.println(allData);
		for (WebElement ele : allDates) {
			String date = ele.getText();
			if (date.equalsIgnoreCase("28")) {
				ele.click();
				break;
			}

		}
		dr.getDOBokclick().click();
		Thread.sleep(5000);
		dr.getLisenceNo().sendKeys(prop.getProperty("LNo"));
		dr.getLisenceType().sendKeys(prop.getProperty("LType"));
	}


	@Test(priority = 1)
	public void Threadpart() throws InterruptedException {
		dr.getDateofJoining().click();
		while (!dr.getDOjMonth().getText().contains("MARCH")) {
			dr.getDOjMonthClick().click();
			log.info("Select Successfully month");
		}
		while (!dr.getDOjMonth().getText().contains("MARCH 2018")) {
			dr.getDOjyearClick().click();
			log.info("Select Successfully year");
		}
		List<WebElement> Date = dr.getSelectDate();
		int count = dr.getSelectDate().size();
		System.out.println(count);
		for (WebElement ele : Date) {
			String date = ele.getText();
			if (date.equalsIgnoreCase("20")) {
				ele.click();
				break;
			}

		}
		dr.getSelect().click();
		log.info("Select Successfully Date");
		Thread.sleep(7000);
	}

	@AfterTest
	public void teardown() {
		driver.quit();
		driver = null;
	}

}
