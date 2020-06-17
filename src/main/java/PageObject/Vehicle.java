package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Vehicle {
	public WebDriver driver;
	public Actions a;

	private By master = By.xpath("//i[contains(text(),'recent_actors')]");
	private By Vehicle = By.xpath("//li[3]//ul[1]//li[1]//a[1]//span[1]");
	private By checkVehicle = By.xpath("//div[@id='modal_31']//header[contains(text(),'Vehicle')]");
	private By frame = By.xpath("//div[@id='modalBody_31']//iframe[contains(@class,'ifream')]");

	public Vehicle(WebDriver driver) {
		this.driver=driver;
	}
	public void getMaster() {
		a = new Actions(driver);
		a.moveToElement(driver.findElement(master)).build().perform();
	}

	public void getclk_Vehicle() {
		a = new Actions(driver);
		a.moveToElement(driver.findElement(Vehicle)).click().build().perform();
	}

	public WebDriver getframe() {
		return driver.switchTo().frame(driver.findElement(frame));
	}

	public String getVehicle_checking() {
		return driver.findElement(checkVehicle).getText();
	}
}
