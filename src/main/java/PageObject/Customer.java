package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Customer {
	public WebDriver driver;
	public Actions a;
	
	private By master=By.xpath("//i[contains(text(),'recent_actors')]");
	private By customer=By.xpath("//span[contains(text(),'Customer')]");
	private By frame=By.xpath("//div[@id='modalBody_36']//iframe[@class='ifream']");
	private By checkcustomer=By.xpath("//header[contains(text(),'Customer')]");
	
	public Customer(WebDriver driver) {
		this.driver=driver;
	}
	public void getclkMaster() {
		   a=new Actions(driver);
		   a.moveToElement(driver.findElement(master)).build().perform();
	   }
	 public void getclkCustomer() {
		   a=new Actions(driver);
		   a.moveToElement(driver.findElement(customer)).click().build().perform();
	   }
	  public WebDriver getframe() {
		  return driver.switchTo().frame(driver.findElement(frame));
	  }
	  public String getcheckingCustomer() {
		  return driver.findElement(checkcustomer).getText();
	  }
}
