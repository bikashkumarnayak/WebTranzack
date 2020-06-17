package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Group {
	public WebDriver driver;
	public Actions a;

	private By master = By.xpath("//i[contains(text(),'recent_actors')]");
	private By group = By.xpath("//span[contains(text(),'Groups')]");
	private By checkgroup = By.xpath("//header[contains(text(),'Groups')]");
	private By frame = By.xpath("//div[@id='modalBody_35']//iframe[@class='ifream']");

	public Group(WebDriver driver) {
		this.driver = driver;
	}

	public void getMaster() {
		a = new Actions(driver);
		a.moveToElement(driver.findElement(master)).build().perform();
	}

	public void getclk_Groups() {
		a = new Actions(driver);
		a.moveToElement(driver.findElement(group)).click().build().perform();
	}

	public WebDriver getframe() {
		return driver.switchTo().frame(driver.findElement(frame));
	}

	public String getGroups_checking() {
		return driver.findElement(checkgroup).getText();
	}

}
