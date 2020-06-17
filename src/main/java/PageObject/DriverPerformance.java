package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DriverPerformance {
	public WebDriver driver;
	public Actions a;

	private By reports = By.xpath("//i[contains(text(),'assignment')]");
	private By Driver_Performance = By.xpath("//span[contains(text(),'Driver Performance')]");
	private By checDriverPerformance = By.xpath("//header[contains(text(),'Driver performance')]");
	private By frame = By.xpath("//div[@id='modalBody_19']//iframe[contains(@class,'ifream')]");

	
	public DriverPerformance(WebDriver driver) {
		this.driver=driver;
	}
	public void getReports() {
		a = new Actions(driver);
		a.moveToElement(driver.findElement(reports)).build().perform();
	}

	public void getclk_DriverPerformance() {
		a = new Actions(driver);
		a.moveToElement(driver.findElement(Driver_Performance)).click().build().perform();
	}

	public WebDriver getframe() {
		return driver.switchTo().frame(driver.findElement(frame));
	}

	public String getDriverPerformance_checking() {
		return driver.findElement(checDriverPerformance).getText();
	}

}
