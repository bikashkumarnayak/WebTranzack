package PageObject;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Department {
	public WebDriver driver;

	private By Department = By.xpath("//*[@id=\"menuPanel\"]/li[6]/ul/li[1]/a/span[1]");
	private By Frame = By.cssSelector("#modalBody_11 > div:nth-child(2) > div:nth-child(1) > iframe:nth-child(1)");
	private By AddDepartment = By.xpath("//*[@id=\"departmentTable_wrapper\"]/div[1]/button[7]");
	private By DepName = By.id("deptName");
	private By DepHead = By.id("deptHead");
	private By Submit = By.xpath("//button[@class='modalBtn']");
	private By TooltipName=By.id("alertMsgTxt_deptName");
	private By Tooltip_DHead=By.id("alertMsgTxt_deptHead");
	private By DownloadExcel=By.xpath("//*[@id=\"departmentTable_wrapper\"]/div[1]/button[3]/i");
	private By DownloadCSV=By.xpath("//*[@id=\"departmentTable_wrapper\"]/div[1]/button[4]/i");
	private By DownloadPDF=By.xpath("//*[@id=\"departmentTable_wrapper\"]/div[1]/button[5]/i");
	private By SuccessMSG=By.xpath("//*[@id=\"msg_Department\"]/div");
	private By Copy=By.xpath("//*[@id=\"departmentTable_wrapper\"]/div[1]/button[2]/i");
	private By AllButton=By.xpath("//*[@id=\"departmentTable_wrapper\"]/div[1]/button[1]");
	private By TenButton=By.xpath("//*[@id=\"departmentTable_wrapper\"]/div[1]/button[1]");
	private By TwentyFiveButton=By.xpath("//*[@id=\"departmentTable_wrapper\"]/div[1]/button[1]");
	private By FiftyButton=By.xpath("//*[@id=\"departmentTable_wrapper\"]/div[1]/button[1]");
	private By next=By.xpath("//*[@id=\"departmentTable_next\"]/a");
	private By HideButton=By.xpath("//*[@id=\"hideBtn\"]/i");
	private By EditButton=By.xpath("//*[@id=\"editBtn\"]/i");
	private By Update=By.className("modalBtn");
	private By Delete=By.xpath("//tr[32]//td[4]//button[3]");
	private By Table=By.xpath("//*[@id=\"departmentTable\"]");
	private By colcount=By.xpath("//*[@id=\"departmentTable\"]/tbody/tr/td[3]");  
	private By All=By.xpath("//*[@id=\"departmentTable_wrapper\"]/div[1]/div[2]/div/button[1]");
	private By Searchbox=By.xpath("//*[@id=\"departmentTable_filter\"]/label/input");
	private By SearchElement=By.xpath("//*[@id=\"departmentTable_wrapper\"]/div[3]/div[2]");
	
	
	public Department(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getDepartment() {
		return driver.findElement(Department);
	}

	public WebDriver getFrame() {
		return driver.switchTo().frame(driver.findElement(Frame));
	}

	public WebElement getAddDepartment() {
		return driver.findElement(AddDepartment);
	}

	public WebElement getAddDepartmentName() {
		return driver.findElement(DepName);
	}

	public WebElement getAddDepartmenHead() {
		return driver.findElement(DepHead);
	}

	public WebElement getsubmit() {
		return driver.findElement(Submit);
		
	}
	public String getTool() {
	  return  driver.findElement(TooltipName).getText();
		
	}
	public String getToolHead() {
		  return  driver.findElement(Tooltip_DHead).getText();
			
		}
	public WebElement getExcel() {
		return driver.findElement(DownloadExcel);
	}
	public WebElement getCSV() {
		return driver.findElement(DownloadCSV);
	}
	public WebElement getPDF() {
		return driver.findElement(DownloadPDF);
	}
	public WebElement getcopy() {
		return driver.findElement(Copy);
	}
	public String getSuccessMSG() {
		return driver.findElement(SuccessMSG).getText();
	}
	public WebElement getAllRowButton() {
		return driver.findElement(AllButton);
	}
	public WebElement getTenRowButton() {
		return driver.findElement(TenButton);
	}
	public WebElement getTwentyFiveRowButton() {
		return driver.findElement(TwentyFiveButton);
	}
	public WebElement getFiftyRowButton() {
		return driver.findElement(FiftyButton);
	}
	public void getNextButton() {
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(next)).click().build().perform();
	}
	public WebElement getHideButton() {
		return driver.findElement(HideButton);
		
	}
//	public String getHeadSuccess() {
//		  return  driver.findElement(SuccessMsg).getText();
//			
//		}
	
	public WebElement getEditButton() {
		return driver.findElement(EditButton);
	}
	public WebElement getUpdateButton() {
		return driver.findElement(Update);
	}
	public WebElement getDeleteButton() {
		return driver.findElement(Delete);
	}
	public WebElement getAllButton() {
		return driver.findElement(All);
	}
	
	public int getSearchColoum() {
		WebElement table= driver.findElement(Table);
		return table.findElements(colcount).size();
	}
	public List<WebElement> getColoum() {
		WebElement table= driver.findElement(Table);
	return table.findElements(colcount);
	}
	public WebElement getSearchBox() {
		return driver.findElement(Searchbox);
	}
	public List<WebElement> getSearchele() {
		return driver.findElements(SearchElement);
	}
	public void getborder(WebElement element){
		   JavascriptExecutor js = ((JavascriptExecutor)driver);
		   js. executeScript("arguments[0].setAttribute('style', 'background: red; border: 4px solid red;');", element);   
		 }
	
	}
	


