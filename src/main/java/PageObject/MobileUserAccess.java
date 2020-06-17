package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class MobileUserAccess {
	public WebDriver driver;
	public Actions a;

	private By master = By.xpath("//i[contains(text(),'recent_actors')]");
	private By  MobileUserAccess= By.xpath("//span[contains(text(),'Mobile User Access')]");
	private By checkMobileUserAccess = By.xpath("//header[contains(text(),'Mobile user access')]");
	private By frame = By.xpath("//div[@id='modalBody_129']//iframe[@class='ifream']");

	public MobileUserAccess(WebDriver driver) {
		this.driver = driver;
	}

	public void getMaster() {
		a = new Actions(driver);
		a.moveToElement(driver.findElement(master)).build().perform();
	}

	public void getclk_MobileUserAccess() {
		a = new Actions(driver);
		a.moveToElement(driver.findElement(MobileUserAccess)).click().build().perform();
	}

	public WebDriver getframe() {
		return driver.switchTo().frame(driver.findElement(frame));
	}

	public String getMobileUserAccess_checking() {
		return driver.findElement(checkMobileUserAccess).getText();
	}

}
