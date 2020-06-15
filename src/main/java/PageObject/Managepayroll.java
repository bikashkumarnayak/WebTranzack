package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Managepayroll {
	public WebDriver driver;
	public Actions a;
	
	private By hr=By.xpath("//i[contains(text(),'supervisor_account')]");
	private By managepayroll=By.xpath("//span[contains(text(),'Manage Payroll')]");
	private By check_managePayRoll=By.xpath("//header[contains(text(),'Manage payroll')]");
	private By frame=By.xpath("//div[@id='modalBody_146']//iframe[@class='ifream']");
	
	public Managepayroll(WebDriver driver) {
		this.driver=driver;
	}
	 public void getHr() {
		   a=new Actions(driver);
		   a.moveToElement(driver.findElement(hr)).build().perform();
	   }
	   public void getclkManage_payroll() {
		   a=new Actions(driver);
		   a.moveToElement(driver.findElement(managepayroll)).click().build().perform();
	   }
	  public WebDriver getframe() {
		  return driver.switchTo().frame(driver.findElement(frame));
	  }
	  public String getchecking_manage_payroll() {
		  return driver.findElement(check_managePayRoll).getText();
	  }
}
