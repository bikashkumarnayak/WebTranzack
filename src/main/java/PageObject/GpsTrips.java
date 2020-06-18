package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class GpsTrips {
	public WebDriver driver;
	public Actions a;
	
	private By reports = By.xpath("//i[contains(text(),'assignment')]");
	private By Gps_Trips = By.xpath("//span[contains(text(),'Gps Trips')]");
	private By Check_Gps_Trips = By.xpath("//header[contains(text(),'Gps trips')]");
	private By frame = By.xpath("//div[@id='modalBody_44']//iframe[@class='ifream']");

	
	public GpsTrips(WebDriver driver) {
		this.driver=driver;
	}
	public void getReports() {
		a=new Actions(driver);
		a.moveToElement(driver.findElement(reports)).build().perform();
	}
	public void getGps_Reports() {
		a=new Actions(driver);
		a.moveToElement(driver.findElement(Gps_Trips)).click().build().perform();
	}
	public String getCheck_EventReports() {
		return driver.findElement(Check_Gps_Trips).getText();
	}
	public WebDriver getframe() {
		return driver.switchTo().frame(driver.findElement(frame));
	}
}
