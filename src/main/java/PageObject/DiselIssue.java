package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DiselIssue {
	public WebDriver driver;
	public Actions a;
	
	private By HSD=By.xpath("//i[contains(text(),'local_gas_station')]");
	private By Disel_issue=By.xpath("//span[contains(text(),'Diesel Issue')]");
	private By frame=By.xpath("//div[@id='modalBody_115']//iframe[contains(@class,'ifream')]");
	private By Check_Diselissue=By.xpath("//header[contains(text(),'Diesel issue')]");
	
	
	
	
	public DiselIssue(WebDriver driver) {
		this.driver=driver;
	}
	public void getHSD() {
		a=new Actions(driver);
		a.moveToElement(driver.findElement(HSD)).build().perform();
	}
	public void getClkDiselIssue() {
		a=new Actions(driver);
		a.moveToElement(driver.findElement(Disel_issue)).click().build().perform();
	}
	public WebDriver getframe() {
		return driver.switchTo().frame(driver.findElement(frame));
	}
	public String getcheckDiselIssue() {
	return driver.findElement(Check_Diselissue).getText();
	}

}
