package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class FreightPaymentVoucher {
	public WebDriver driver;
	public Actions a;
	
	private By master = By.xpath("//i[contains(text(),'recent_actors')]");
	private By fright_Payment_voucher = By.xpath("//span[contains(text(),'Freight Payment Voucher')]");
	private By check_fright_Payment_voucher = By.xpath("//header[contains(text(),'Freight payment voucher')]");
	private By frame = By.xpath("//div[@id='modalBody_150']//iframe[contains(@class,'ifream')]");
	
	public FreightPaymentVoucher(WebDriver driver) {
		this.driver=driver;
	}
	public void getMaster() {
		a = new Actions(driver);
		a.moveToElement(driver.findElement(master)).build().perform();
	}

	public void getclk_fright_Payment_voucher() {
		a = new Actions(driver);
		a.moveToElement(driver.findElement(fright_Payment_voucher)).click().build().perform();
	}

	public WebDriver getframe() {
		return driver.switchTo().frame(driver.findElement(frame));
	}

	public String getfright_Payment_voucher_checking() {
		return driver.findElement(check_fright_Payment_voucher).getText();
	}
}
