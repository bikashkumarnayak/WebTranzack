package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Geofences {
	
	public WebDriver driver;
	public Actions a;

	private By master = By.xpath("//i[contains(text(),'recent_actors')]");
	private By Geofences = By.xpath("//span[contains(text(),'Geofences')]");
	private By checkGeofences = By.xpath("//header[contains(text(),'Geofences')]");
	private By frame = By.xpath("//div[@id='modalBody_39']//iframe[@class='ifream']");
	public Geofences(WebDriver driver) {
		this.driver=driver;
	}
	public void getMaster() {
		a = new Actions(driver);
		a.moveToElement(driver.findElement(master)).build().perform();
	}

	public void getclk_Geofences() {
		a = new Actions(driver);
		a.moveToElement(driver.findElement(Geofences)).click().build().perform();
	}

	public WebDriver getframe() {
		return driver.switchTo().frame(driver.findElement(frame));
	}

	public String getGeofences_checking() {
		return driver.findElement(checkGeofences).getText();
	}
}
