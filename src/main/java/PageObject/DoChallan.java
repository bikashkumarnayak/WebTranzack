package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DoChallan {
	public WebDriver driver;
	public Actions a;
	private By master = By.xpath("//i[contains(text(),'recent_actors')]");
	private By DoChallan = By.xpath("//span[contains(text(),'D.o Challan')]");
	private By checkDoChallan = By.xpath("//header[contains(text(),'D.o challan')]");
	private By frame = By.xpath("//div[@id='modalBody_96']//iframe[contains(@class,'ifream')]");

	public DoChallan(WebDriver driver) {
		this.driver = driver;
	}

	public void getMaster() {
		a = new Actions(driver);
		a.moveToElement(driver.findElement(master)).build().perform();
	}

	public void getclk_Dochallan() {
		a = new Actions(driver);
		a.moveToElement(driver.findElement(DoChallan)).click().build().perform();
	}

	public WebDriver getframe() {
		return driver.switchTo().frame(driver.findElement(frame));
	}

	public String getDochallan_checking() {
		return driver.findElement(checkDoChallan).getText();
	}
}
