package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Party {
	public WebDriver driver;
	public Actions a;

	private By master = By.xpath("//i[contains(text(),'recent_actors')]");
	private By party = By.xpath("//span[contains(text(),'Party')]");
	private By checkparty = By.xpath("//header[contains(text(),'Party')]");
	private By frame = By.xpath("//div[@id='modalBody_32']//iframe[@class='ifream']");
	
	public Party(WebDriver driver) {
		this.driver=driver;
	}
	public void getMaster() {
		a = new Actions(driver);
		a.moveToElement(driver.findElement(master)).build().perform();
	}

	public void getclk_Party() {
		a = new Actions(driver);
		a.moveToElement(driver.findElement(party)).click().build().perform();
	}

	public WebDriver getframe() {
		return driver.switchTo().frame(driver.findElement(frame));
	}

	public String getparty_checking() {
		return driver.findElement(checkparty).getText();
	}
}
