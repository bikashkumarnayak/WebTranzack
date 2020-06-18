package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class KtcTrips {
	public WebDriver driver;
	Actions a;
	
	private By reports = By.xpath("//i[contains(text(),'assignment')]");
	private By ktc_Trip_Reports = By.xpath("//span[contains(text(),'Ktc Trips')]");
	private By checDriverPerformance = By.xpath("//header[contains(text(),'Ktc trips')]");
	private By frame = By.xpath("//div[@id='modalBody_126']//iframe[@class='ifream']");

	public KtcTrips(WebDriver driver) {
		this.driver=driver;
	}
	public void getReports() {
		a=new Actions(driver);
		a.moveToElement(driver.findElement(reports)).build().perform();
	}
	public void getclkktc_Reports() {
		a.moveToElement(driver.findElement(ktc_Trip_Reports)).click().build().perform();
			
	}
	public String getCheck_reports() {
		return driver.findElement(checDriverPerformance).getText();
	}
	public WebDriver getfream() {
		return driver.switchTo().frame(driver.findElement(frame));
	}
	
}
