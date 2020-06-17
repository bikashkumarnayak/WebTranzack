package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Setting {
	public WebDriver driver;
	
	public Actions a;

	private By master = By.xpath("//i[contains(text(),'recent_actors')]");
	private By setting = By.xpath("//span[contains(text(),'Settings')]");
	private By checksetting = By.xpath("//header[contains(text(),'Settings')]");
	private By frame = By.xpath("//div[@id='modalBody_49']//iframe[@class='ifream']");
	
	public Setting(WebDriver driver) {
		this.driver=driver;
	}
	public void getMaster() {
		a = new Actions(driver);
		a.moveToElement(driver.findElement(master)).build().perform();
	}

	public void getclk_Setting() {
		a = new Actions(driver);
		a.moveToElement(driver.findElement(setting)).click().build().perform();
	}

	public WebDriver getframe() {
		return driver.switchTo().frame(driver.findElement(frame));
	}

	public String getSetting_checking() {
		return driver.findElement(checksetting).getText();
	}
}
