package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Users {
	public WebDriver driver;
	public Actions a;

	private By master = By.xpath("//i[contains(text(),'recent_actors')]");
	private By user = By.xpath("//span[contains(text(),'Users')]");
	private By checkuser = By.xpath("//header[contains(text(),'Users')]");
	private By frame = By.xpath("//div[@id='modalBody_37']//iframe[@class='ifream']");

	public Users(WebDriver driver) {
		this.driver = driver;
	}

	public void getMaster() {
		a = new Actions(driver);
		a.moveToElement(driver.findElement(master)).build().perform();
	}

	public void getclk_Groups() {
		a = new Actions(driver);
		a.moveToElement(driver.findElement(user)).click().build().perform();
	}

	public WebDriver getframe() {
		return driver.switchTo().frame(driver.findElement(frame));
	}

	public String getGroups_checking() {
		return driver.findElement(checkuser).getText();
	}
}
