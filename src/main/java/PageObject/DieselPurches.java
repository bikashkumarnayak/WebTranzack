package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DieselPurches {
	public WebDriver driver;
	public Actions a;
	
	private By HSD=By.xpath("//i[contains(text(),'local_gas_station')]");
	private By DiselPurches=By.xpath("//span[contains(text(),'Diesel Purchase')]");
	private By frame=By.xpath("//div[@id='modalBody_116']//iframe[contains(@class,'ifream')]");
	private By Check_Diselpurches=By.xpath("//header[contains(text(),'Diesel purchase')]");
	public DieselPurches(WebDriver driver) {
		this.driver=driver;
	}
	public void gethsd() {
		   a=new Actions(driver);
		   a.moveToElement(driver.findElement(HSD)).build().perform();
	   }
	   public void getclkDiselPurches() {
		   a=new Actions(driver);
		   a.moveToElement(driver.findElement(DiselPurches)).click().build().perform();
	   }
	  public WebDriver getframe() {
		  return driver.switchTo().frame(driver.findElement(frame));
	  }
	  public String getcheckingDiselPurches() {
		  return driver.findElement(Check_Diselpurches).getText();
	  }

}
