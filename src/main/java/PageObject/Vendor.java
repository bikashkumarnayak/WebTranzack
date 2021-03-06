package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Vendor {
	public WebDriver driver;
	public Actions a;

	private By master = By.xpath("//i[contains(text(),'recent_actors')]");
	private By vendor = By.xpath("//li[16]//a[1]//span[1]");
	private By checkvendor = By.xpath("//header[contains(text(),'Vendor')]");
	private By frame = By.xpath("//div[@id='modalBody_157']//iframe[contains(@class,'ifream')]");

	public Vendor(WebDriver driver) {
		this.driver=driver;
	}
	public void getMaster() {
		a = new Actions(driver);
		a.moveToElement(driver.findElement(master)).build().perform();
	}

	public void getclk_vendor() {
		a = new Actions(driver);
		a.moveToElement(driver.findElement(vendor)).click().build().perform();
	}

	public WebDriver getframe() {
		return driver.switchTo().frame(driver.findElement(frame));
	}

	public String getVendor_checking() {
		return driver.findElement(checkvendor).getText();
	}
}
