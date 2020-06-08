package com.abstech.tranzack;



import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObject.Attendance;
import PageObject.Dashboard;
import PageObject.Department;
import PageObject.LogInPage;
import resource.Base;

public class AttendancePage extends Base{
	public Department de;
	public Attendance at;
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
		lp.getcheck().click();
		log.info("Successfully click");
		WebElement loginButton=lp.getlogin();
		lp.getborder(loginButton);
		lp.getlogin().click();
		log.info("login page login Successfully");
		Thread.sleep(10000);
		Dashboard d = new Dashboard(driver);
		d.gethr();
		log.info("Successfully click HR");
		Thread.sleep(10000);
		
	}
	@Test(priority=1)
	public void clickDepartment() throws InterruptedException {
		at=new Attendance(driver);
		at.getAttendance().click();
		log.info("Sucessfully click department page");
		Thread.sleep(10000);
		at.getFrame();
		Thread.sleep(10000);
		log.info("Successfully find Frame");
	}
	
	@Test(priority=2)
	public void clkClander() throws InterruptedException {
		at=new Attendance(driver);
		at.getDate().click();
		Thread.sleep(7000);
		log.info("click successfully");
		WebElement month=at.getMonth();
		Select monthval=new Select(month);
		monthval.selectByVisibleText("Dec");
		Thread.sleep(5000);
		WebElement year=at.getYear();
		Select yearval=new Select(year);
		yearval.selectByVisibleText("2019");
		for(WebElement element :at.getallData()) {
			String data=element.getText();
			if(data.equalsIgnoreCase("1")) {
				element.click();
				break;
			}
		}
		at.getSubmit().click();
		Thread.sleep(15000);
	}
	@Test(priority=3)
	public void clkCopy() throws InterruptedException {
		at=new Attendance(driver);
		at.getCoppy().click();
		log.info("click Successfully");
		Thread.sleep(5000);
		
	}
	@Test(priority=4)
	public void clkExcel() throws InterruptedException {
		at=new Attendance(driver);
		at.getExcel().click();
		log.info("click Successfully");
		Thread.sleep(5000);
		
	}
	@Test(priority=5)
	public void clkCSV() throws InterruptedException {
		at=new Attendance(driver);
		at.getCSV().click();
		log.info("click Successfully");
		Thread.sleep(5000);
		
	}
	@Test(priority=6)
	public void clkPDF() throws InterruptedException {
		at=new Attendance(driver);
		at.getPDF().click();
		log.info("click Successfully");
		Thread.sleep(5000);
		
	}

	@AfterTest
	public void teardown() {
		driver.quit();
		driver = null;
	}

}
