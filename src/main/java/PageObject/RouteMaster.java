package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class RouteMaster {
	public WebDriver driver;
	public Actions a;

	private By master = By.xpath("//i[contains(text(),'recent_actors')]");
	private By Rout_Master = By.xpath("//span[contains(text(),'Route Master')]");
	private By check_Rout_Master = By.xpath("//header[contains(text(),'Route master')]");
	private By frame = By.xpath("//div[@id='modalBody_35']//iframe[@class='ifream']");

	public RouteMaster(WebDriver driver) {
		this.driver=driver;
	}
	public void getMaster() {
		a = new Actions(driver);
		a.moveToElement(driver.findElement(master)).build().perform();
	}
	public void getclk_RoutMaster() {
		a = new Actions(driver);
		a.moveToElement(driver.findElement(Rout_Master)).click().build().perform();
	}

	public WebDriver getframe() {
		return driver.switchTo().frame(driver.findElement(frame));
	}

	public String getRoutMaster_checking() {
		return driver.findElement(check_Rout_Master).getText();
	}
}
