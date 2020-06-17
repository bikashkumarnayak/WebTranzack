package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class Devices {
	WebDriver driver;
	public Actions a;
	
	private By master = By.xpath("//i[contains(text(),'recent_actors')]");
	private By Devices = By.xpath("//span[contains(text(),'Devices')]");
	private By checkDevices = By.xpath("//header[contains(text(),'Devices')]");
	private By frame = By.xpath("//div[@id='modalBody_34']//iframe[contains(@class,'ifream')]");

	
	public Devices(WebDriver driver) {
		 this.driver=driver;
	}
	public void getMaster() {
		a = new Actions(driver);
		a.moveToElement(driver.findElement(master)).build().perform();
	}

	public void getclk_Devices() {
		a = new Actions(driver);
		a.moveToElement(driver.findElement(Devices)).click().build().perform();
	}

	public WebDriver getframe() {
		return driver.switchTo().frame(driver.findElement(frame));
	}

	public String getDevices_checking() {
		return driver.findElement(checkDevices).getText();
	}

}
