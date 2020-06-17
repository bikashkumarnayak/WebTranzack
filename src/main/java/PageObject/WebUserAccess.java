package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class WebUserAccess {
	public WebDriver driver;
	public Actions a;

	private By master = By.xpath("//i[contains(text(),'recent_actors')]");
	private By WB_UserAccess = By.xpath("//span[contains(text(),'Web User Access')]");
	private By checkWB_UserAccess = By.xpath("//header[contains(text(),'Web user access')]");
	private By frame = By.xpath("//div[@id='modalBody_42']//iframe[contains(@class,'ifream')]");
	
	public WebUserAccess(WebDriver driver) {
		this.driver=driver;
	}
	public void getMaster() {
		a = new Actions(driver);
		a.moveToElement(driver.findElement(master)).build().perform();
	}

	public void getclk_WBUserAccess() {
		a = new Actions(driver);
		a.moveToElement(driver.findElement(WB_UserAccess)).click().build().perform();
	}

	public WebDriver getframe() {
		return driver.switchTo().frame(driver.findElement(frame));
	}

	public String getWBUserAccess_checking() {
		return driver.findElement(checkWB_UserAccess).getText();
	}

}
