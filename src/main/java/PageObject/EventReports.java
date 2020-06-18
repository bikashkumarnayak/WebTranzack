package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class EventReports {
	public WebDriver driver;
	public Actions a;

	private By reports = By.xpath("//i[contains(text(),'assignment')]");
	private By Event_Reports = By.xpath("//span[contains(text(),'Event Reports')]");
	private By checkEventReport = By.xpath("//header[contains(text(),'Event reports')]");
	private By frame = By.xpath("//div[@id='modalBody_47']//iframe[@class='ifream']");

	public EventReports(WebDriver driver) {
		this.driver=driver;
	}
	public void getReports() {
		a = new Actions(driver);
		a.moveToElement(driver.findElement(reports)).build().perform();
	}

	public void getclk_EventReports() {
		a = new Actions(driver);
		a.moveToElement(driver.findElement(Event_Reports)).click().build().perform();
	}

	public WebDriver getframe() {
		return driver.switchTo().frame(driver.findElement(frame));
	}

	public String getEventReports_checking() {
		return driver.findElement(checkEventReport).getText();
	}
}
