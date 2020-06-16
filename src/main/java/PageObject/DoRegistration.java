package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

public class DoRegistration {
	public WebDriver driver;
	public Actions a;
	
	private By master = By.xpath("//i[contains(text(),'recent_actors')]");
	private By DoResistration = By.xpath("//span[contains(text(),'D.o Registration')]");
	private By checkDoregistration = By.xpath("//header[contains(text(),'D.o registration')]");
	private By frame = By.xpath("//div[@id='modalBody_63']//iframe[contains(@class,'ifream')]");
	public DoRegistration(WebDriver driver) {
		this.driver=driver;
	}
	public void getMaster() {
		a = new Actions(driver);
		a.moveToElement(driver.findElement(master)).build().perform();
	}

	public void getclk_DoRegistration() {
		a = new Actions(driver);
		a.moveToElement(driver.findElement(DoResistration)).click().build().perform();
	}

	public WebDriver getframe() {
		return driver.switchTo().frame(driver.findElement(frame));
	}

	public String getDoregistration_checking() {
		return driver.findElement(checkDoregistration).getText();
	}
}
