package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class AddTyreToVehicle {
	public WebDriver driver;
	public Actions a;
	private By Tyre=By.xpath("//i[contains(text(),'donut_small')]");
	private By addTyreToVehicle=By.xpath("//span[contains(text(),'Add Tyre To Vehicle')]");
	private By frame=By.xpath("//div[@id='modalBody_55']//iframe[@class='ifream']");
	private By Check=By.xpath("//header[contains(text(),'Add tyre to vehicle')]");
	
	public AddTyreToVehicle(WebDriver driver) {
		 this.driver=driver;
	}
   public void getTyre() {
	   a=new Actions(driver);
	   a.moveToElement(driver.findElement(Tyre)).build().perform();
   }
   public void getclkaddTyreto_vehicle() {
	   a=new Actions(driver);
	   a.moveToElement(driver.findElement(addTyreToVehicle)).click().build().perform();
   }
  public WebDriver getframe() {
	  return driver.switchTo().frame(driver.findElement(frame));
  }
  public String getchecking() {
	  return driver.findElement(Check).getText();
  }
}
