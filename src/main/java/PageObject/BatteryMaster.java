package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class BatteryMaster {
	public WebDriver driver;
	public Actions a;
	
	private By master=By.xpath("//i[contains(text(),'recent_actors')]");
	private By batterymaster=By.xpath("//span[contains(text(),'Battery Master')]");
	private By checkBattery=By.xpath("//header[contains(text(),'Battery master')]");
	private By frame=By.xpath("//div[@id='modalBody_156']//iframe[@class='ifream']");
	
	public BatteryMaster(WebDriver driver) {
		this.driver=driver;
	}
	public void getMaster() {
		   a=new Actions(driver);
		   a.moveToElement(driver.findElement(master)).build().perform();
	   }
	 public void getclk_Batterymaster() {
		   a=new Actions(driver);
		   a.moveToElement(driver.findElement(batterymaster)).click().build().perform();
	   }
	  public WebDriver getframe() {
		  return driver.switchTo().frame(driver.findElement(frame));
	  }
	  public String getBattery_checking() {
		  return driver.findElement(checkBattery).getText();
	  }
}
