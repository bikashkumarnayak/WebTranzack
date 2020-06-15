package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Driver {
	public WebDriver driver;
	Actions a;
	
	private By Driver = By.xpath("//*[@id=\"menuPanel\"]/li[6]/ul/li[3]/a/span[1]");
	private By Frame = By.cssSelector("#modalBody_33 > div.modal-contents.-ui-widget-content > div > iframe");
	private By AddDriver = By.xpath("//*[@id=\"driverTable_wrapper\"]/div[1]/button[7]");
	private By Name = By.id("name");
	private By FathersName = By.id("fathername");
	private By Address = By.id("address");
	private By PhoneNo = By.id("phoneno");
	private By CITY = By.id("city");
	private By STATE = By.id("state");
	private By DOB = By.id("dob");
	private By DateofJoin = By.id("dateofjoining");
	private By LisenceNo = By.id("licenseno");
	private By LisenceType = By.id("licensetype");
	private By IssueDate = By.id("issuedate");
	private By ExpiryDate = By.id("expirydate");
	private By Authority = By.id("authority");
	private By BloodGroup = By.id("bloodgroup");
	private By AadhaarNo = By.id("aadhaarNo");
	private By Salary = By.id("salary");
	private By Vehicleno = By.id("vehicleno");
	private By dob_month_year = By.xpath("//div[@class='dtp-picker-month']");
	private By dob_Date = By.className("dtp-select-day");
	private By dob_Year_click = By.xpath(
			"//div[@class='dtp-date']//div//a[@class='dtp-select-year-before']//i[@class='material-icons'][contains(text(),'chevron_left')]");
	private By dob_month_click = By.xpath(
			"//div[@class='dtp-date']//div//a[@class='dtp-select-month-after']//i[@class='material-icons'][contains(text(),'chevron_right')]");
	private By DobOk = By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/button[4]");
	// ********Date of join**************

	private By dojMonth = By.xpath("//div[@class='dtp-picker-month']");
	private By DojMonthClick = By.xpath(
			"//div[@class='dtp-date']//div//a[@class='dtp-select-month-after']//i[@class='material-icons'][contains(text(),'chevron_right')]");
	private By DojYearClick = By.xpath(
			"//div[@class='dtp-date']//div//a[@class='dtp-select-year-before']//i[@class='material-icons'][contains(text(),'chevron_left')]");
	private By selectDate = By.className("dtp-select-day");
	private By select = By.xpath("/html[1]/body[1]/div[4]/div[1]/div[2]/button[4]");

	// ***********************ISSUEDATE*************************************************
	private By issue_Month_year = By.xpath("//div[@class='dtp-picker-month']");
	private By issueMonthClick = By.xpath(
			"//div[@class='dtp-date']//div//a[@class='dtp-select-month-before']//i[@class='material-icons'][contains(text(),'chevron_left')]");
	private By issueyearClick = By.xpath(
			"//div[@class='dtp-date']//div//a[@class='dtp-select-year-before']//i[@class='material-icons'][contains(text(),'chevron_left')]");
	private By Issue_Date = By.className("dtp-select-day");
	private By issueok=By.xpath
			("//div[@id='dtp_kpuW3']//button[@class='dtp-btn-ok btn btn-flat btn-sm'][contains(text(),'OK')]");

	
	
	
	public Driver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getDriver() {
		return driver.findElement(Driver);
	}

	public WebDriver getFrame() {
		return driver.switchTo().frame(driver.findElement(Frame));
	}

	public WebElement getAddDriver() {
		return driver.findElement(AddDriver);
	}

	public WebElement getName() {
		return driver.findElement(Name);
	}

	public WebElement getFathersName() {
		return driver.findElement(FathersName);
	}

	public WebElement getAddress() {
		return driver.findElement(Address);
	}

	public WebElement getPhoneNo() {
		return driver.findElement(PhoneNo);
	}

	public WebElement getCITY() {
		return driver.findElement(CITY);
	}

	public WebElement getSTATE() {
		return driver.findElement(STATE);
	}

	public WebElement getDOB() {
		return driver.findElement(DOB);
	}

	public WebElement getDateofJoining() {
		return driver.findElement(DateofJoin);
	}

	public WebElement getLisenceNo() {
		return driver.findElement(LisenceNo);
	}

	public WebElement getLisenceType() {
		return driver.findElement(LisenceType);
	}

	public WebElement getIssueDate() {
		return driver.findElement(IssueDate);
	}

	public WebElement getExpiryDate() {
		return driver.findElement(ExpiryDate);
	}

	public WebElement getAuthority() {
		return driver.findElement(Authority);
	}

	public WebElement getBloodGroup() {
		return driver.findElement(BloodGroup);
	}

	public WebElement getAadhaarNo() {
		return driver.findElement(AadhaarNo);
	}

	public WebElement getSalary() {
		return driver.findElement(Salary);
	}

	public WebElement getVehicleno() {
		return driver.findElement(Vehicleno);
	}

	public WebElement getDOBmonth() {
		return driver.findElement(dob_month_year);
	}

	public WebElement getDOByear() {
		return driver.findElement(dob_month_year);
	}

	public List<WebElement> getDOBDate() {
		return driver.findElements(dob_Date);
	}

	public WebElement getDOByearclick() {
		return driver.findElement(dob_Year_click);
	}

	public WebElement getDOBmonthclick() {
		return driver.findElement(dob_month_click);
	}

	public WebElement getDOBokclick() {
		return driver.findElement(DobOk);
	}

	// **********Date Of Joining*********
	public WebElement getDOjMonth() {
		return driver.findElement(dojMonth);
	}

	public WebElement getDOjMonthClick() {
		return driver.findElement(DojMonthClick);
	}

	public WebElement getDOjyearClick() {
		return driver.findElement(DojYearClick);
	}

	public WebElement getSelect() {
		return driver.findElement(select);
	}

	// ***************IssuDate*************************
	public WebElement getissuemonth() {
		return driver.findElement(issue_Month_year);
	}
	public WebElement getIssueMonthClick() {
		return driver.findElement(issueMonthClick);
	}
	public WebElement getissueyear() {
		return driver.findElement(issue_Month_year);
	}

	public WebElement getIssueyearClick() {
		return driver.findElement(issueyearClick);
	}

	public List<WebElement> get_issue_Selec_tDate() {
		return driver.findElements(Issue_Date);
	}
		public WebElement getokClick() {
			return driver.findElement(issueok);
//			 a=new Actions(driver);
//			 a.moveToElement(driver.findElement(issue_clik_ok)).click().build().perform();
	}
	
}
