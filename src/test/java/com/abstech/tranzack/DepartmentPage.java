package com.abstech.tranzack;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import PageObject.Dashboard;
import PageObject.Department;
import PageObject.LogInPage;
import resource.Base;

public class DepartmentPage extends Base {
	public Department de;
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

	@Test(priority = 1)
	public void clickDepartment() throws InterruptedException {
		de = new Department(driver);
		de.getDepartment().click();
		log.info("Sucessfully click department page");
		Thread.sleep(10000);
		de = new Department(driver);
		de.getFrame();
		Thread.sleep(10000);
		log.info("Successfully find Frame");
		de.getAddDepartment().click();
		log.info("Successfully click AddDepartment Button");
		Thread.sleep(15000);

	}

	@Test(priority = 2)
	public void departmentvalidation() throws InterruptedException {
		de = new Department(driver);
		WebElement Submit=de.getsubmit();
		de.getborder(Submit);
		de.getsubmit().click();
		assertion = new SoftAssert();
		assertion.assertTrue(de.getTool().contains("Please Fill Department Name"));
		Thread.sleep(3000);
		assertion.assertTrue(de.getToolHead().contains("Please Fill Department Head"));
		assertion.assertAll();
		System.out.println("assertion passed");
		log.info("Test case Passed");
		Thread.sleep(10000);
	}

	@Test(priority = 3)
	public void departmentNameValidatio() throws Exception {
		de = new Department(driver);
		de.getAddDepartmentName().sendKeys(prop.getProperty("DName"));
		log.info("Department Head is seuccessfully ");
		de.getsubmit().click();
		Thread.sleep(3000);
		log.info("click successfully");
		assertion = new SoftAssert();
		assertion.assertTrue(de.getToolHead().contains("Please Fill Department Head"));
		log.info("log validation successfully");
		assertion.assertAll();
		System.out.println("assertion passed");
		log.info("Test case Passed");
		Thread.sleep(10000);
	}

	@Test(priority = 4)
	public void departmentHeadValidatio() throws Exception {
		de = new Department(driver);
		de.getAddDepartmentName().clear();
		de.getAddDepartmenHead().sendKeys(prop.getProperty("DHead"));
		log.info("Department Head is seuccessfully ");
		de.getsubmit().click();
		log.info("click successfully");
		assertion = new SoftAssert();
		assertion.assertTrue(de.getTool().contains("Please Fill Department Name"));
		assertion.assertAll();
		log.info("Test case Passed");
		System.out.println("assertion passed");
		Thread.sleep(10000);
	}

	@Test(priority = 5)
	public void newAddDepartment() throws InterruptedException {
		de = new Department(driver);
		de.getAddDepartmenHead().clear();
		de.getAddDepartmentName().sendKeys(prop.getProperty("DName"));
		log.info("Department name enter Successfully");
		de.getAddDepartmenHead().sendKeys(prop.getProperty("DHead"));
		log.info("Department Head is seuccessfully ");
		de.getsubmit().click();
		Thread.sleep(5000);
		log.info("click successfully");
	}

	@Test(priority = 6)
	public void DownloadExcel() throws InterruptedException {
		de = new Department(driver);
		de.getExcel().click();
		log.info("Successfully download Excel");
		Thread.sleep(5000);
	}

	@Test(priority = 7)
	public void DownloadCSV() throws InterruptedException {
		de = new Department(driver);
		de.getCSV().click();
		log.info("Successfully download Excel");
		Thread.sleep(5000);
	}

	@Test(priority = 8)
	public void DownloadPDF() throws InterruptedException {
		de = new Department(driver);
		de.getPDF().click();
		log.info("Successfully download Excel");
		Thread.sleep(5000);
	}

	@Test(priority = 9)
	public void copy() throws InterruptedException {
		de = new Department(driver);
		de.getcopy().click();
		log.info("Successfully Copy");
		Thread.sleep(5000);
	}

	@Test(priority = 10)
	public void clkButton() throws InterruptedException {
		de = new Department(driver);
		de.getAllRowButton().click();
		log.info("Successfully click");
		Thread.sleep(5000);
	}

	@Test(priority = 11)
	public void clkTenRowButton() throws InterruptedException {
		de = new Department(driver);
		de.getTenRowButton().click();
		log.info("Successfully click");
		Thread.sleep(7000);
	}
	@Test(priority = 12)
	public void clkNextButton() throws InterruptedException {
		de = new Department(driver);
		de.getchecknext();
//		de.getAllRowButton().click();
//		Thread.sleep(5000);
//		de.getchecknext();
//		Thread.sleep(5000);
//		de.getNextButton();
//		log.info("Successfully click next Button");
		Thread.sleep(5000);
	}


	@Test(priority = 13)
	public void clkTwentyFiveRowButton() throws InterruptedException {
		de = new Department(driver);
		de.getAllRowButton().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		de.getTwentyFiveRowButton().click();
		log.info("Successfully click");
		Thread.sleep(5000);
	}

	@Test(priority = 14)
	public void clkFiftyRowButton() throws InterruptedException {
		de = new Department(driver);
		de.getAllRowButton().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		de.getFiftyRowButton().click();
		log.info("Successfully click");
		Thread.sleep(5000);
	}

	
	@Test(priority = 16)
	public void clkHideButton() throws InterruptedException {
		de = new Department(driver);
		de.getHideButton().click();
		Alert alert = driver.switchTo().alert();
		log.info("clicking Hide Button");
		alert.accept();
		Thread.sleep(7000);
	}

	@Test(priority = 17)
	public void clkEditButton() throws InterruptedException {
		de = new Department(driver);
		de.getEditButton().click();
		log.info("Edit button clicking");
		Thread.sleep(5000);
		de.getUpdateButton().click();
		log.info("Update Successfully");
		Thread.sleep(5000);

	}

	@Test(priority = 18)
	public void clkDeleteButton() throws InterruptedException {
		de = new Department(driver);
		de.getDeleteButton().click();
		log.info("Update button clicking");
		Alert alert = driver.switchTo().alert();
		log.info("clicking Delete Button");
		alert.accept();
		Thread.sleep(7000);

	}

	@Test(priority=19)
	public void clkSearchElement() throws InterruptedException {
		de = new Department(driver);
		de.getAllRowButton().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		assertion = new SoftAssert();
		for (int i = 0; i <= de.getSearchColoum(); i++) {
			String value = de.getColoum().get(i).getText();
			if (value.equalsIgnoreCase(prop.getProperty("DHead"))) {
				assertion.assertTrue(true);
				assertion.assertAll();
				System.out.println("assertion pass");
				break;

			}

		}
		Thread.sleep(15000);

	}
	@Test(priority=20)
	public void clkSearch() throws InterruptedException {
		de = new Department(driver);
		de.getSearchBox().sendKeys(prop.getProperty("Name"));
		List<WebElement> allDates=de.getSearchele();
		for(WebElement ele:allDates)
		{
			
			String date=ele.getText();
			
			if(date.equalsIgnoreCase("Name"))
			{
				ele.click();
				break;
			}
			
		}
		Thread.sleep(5000);
	}
	@AfterTest
	public void teardown() {
		driver.quit();
		driver = null;
	}

}
