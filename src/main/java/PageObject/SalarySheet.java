package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class SalarySheet {
	public WebDriver driver;
	Actions a;
	private By hr=By.xpath("//i[contains(text(),'supervisor_account')]");
	private By salary_sheet=By.xpath("//span[contains(text(),'Salary Sheet')]");
	private By frame=By.xpath("//div[@id='modalBody_154']//iframe[contains(@class,'ifream')]");
	private By check_Salary_Sheet=By.xpath("//header[contains(text(),'Salary sheet')]");
	
	public SalarySheet(WebDriver driver) {
		this.driver=driver;
	}
	 public void getHR() {
		   a=new Actions(driver);
		   a.moveToElement(driver.findElement(hr)).build().perform();
	   }
	   public void getclkSalarySheet() {
		   a=new Actions(driver);
		   a.moveToElement(driver.findElement(salary_sheet)).click().build().perform();
	   }
	  public WebDriver getframe() {
		  return driver.switchTo().frame(driver.findElement(frame));
	  }
	  public String getcheckingSalarySheet() {
		  return driver.findElement(check_Salary_Sheet).getText();
	  }
}
