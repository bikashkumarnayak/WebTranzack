package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HistoricPlayback {
	public WebDriver driver;
	public Actions a;
	
	private By reports = By.xpath("//i[contains(text(),'assignment')]");
	private By Historic_Playback = By.xpath("//span[contains(text(),'Historic Playback')]");
	private By checkHistoric_Playback = By.xpath("//header[contains(text(),'Historic playback')]");
	private By frame = By.xpath("//div[@id='modalBody_43']//iframe[@class='ifream']");

	public HistoricPlayback(WebDriver driver) {
		this.driver=driver;
	}
	public void getReports() {
	a=new Actions(driver);
	a.moveToElement(driver.findElement(reports)).build().perform();
	}
	public void getClk_Historic_PayBack() {
		a.moveToElement(driver.findElement(Historic_Playback)).click().build().perform();
	}
	public String getcheck_Historic_Payback() {
		return driver.findElement(checkHistoric_Playback).getText();
	}
	public WebDriver getfrme() {
		return  driver.switchTo().frame(driver.findElement(frame));
	}
}
