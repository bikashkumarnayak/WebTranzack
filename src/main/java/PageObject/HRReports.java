package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HRReports {
	public WebDriver driver;
	public Actions a;
	
	private By Hr=By.xpath("//i[contains(text(),'supervisor_account')]");
	private By Reports=By.xpath("//li[6]//ul[1]//li[8]//a[1]//span[1]");
	private By checking_reports=By.xpath("//div[@id='modal_154']//header[contains(text(),'Reports')]");
	private By frame=By.xpath("//div[@id='modalBody_154']//iframe[contains(@class,'ifream')]");
	
	
	public HRReports(WebDriver driver) {
		this.driver=driver;
	}
	 public void getHr() {
		   a=new Actions(driver);
		   a.moveToElement(driver.findElement(Hr)).build().perform();
	   }
	   public void getclkHR_Reports() {
		   a=new Actions(driver);
		   a.moveToElement(driver.findElement(Reports)).click().build().perform();
	   }
	  public WebDriver getframe() {
		  return driver.switchTo().frame(driver.findElement(frame));
	  }
	  public String getchecking_Reports() {
		  return driver.findElement(checking_reports).getText();
	  }
}
