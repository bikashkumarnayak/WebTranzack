package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;



public class Dashboard {
	public WebDriver driver;
	
	private By master = By.xpath("//*[@id=\"menuPanel\"]/li[3]/a/i");
	private By reports = By.xpath("//*[@id=\"menuPanel\"]/li[4]/a/i");
	private By HSD = By.xpath("//*[@id=\"menuPanel\"]/li[5]/a/i");
	private By HR = By.xpath("//*[@id=\"menuPanel\"]/li[6]/a");
	private By Tyre = By.xpath("//*[@id=\"menuPanel\"]/li[7]/a/i");
	private By Approval = By.xpath("//*[@id=\"menuPanel\"]/li[8]/a/i");
	private By Store = By.xpath("//*[@id=\"menuPanel\"]/li[9]/a");
	private By Finance = By.xpath("//*[@id=\"menuPanel\"]/li[10]/a/i");
	private By clkmenu = By.xpath("//*[@id=\"topToggleIcon\"]/i");
	private By clkmaster = By.xpath("//*[@id=\"menuPanel\"]/li[3]/a/span[1]");
	private By clkreport = By.xpath("//*[@id=\"menuPanel\"]/li[4]/a/span[1]");
	private By clkhsd = By.xpath("//*[@id=\"menuPanel\"]/li[5]/a");
	private By clkHR = By.xpath("//*[@id=\"menuPanel\"]/li[6]/a/span[1]");
	private By clkTyr = By.xpath("//*[@id=\"menuPanel\"]/li[7]/a/span[1]");
	private By clkApp = By.xpath("//*[@id=\"menuPanel\"]/li[8]/a/span[1]");
	private By clkSP = By.xpath("//*[@id=\"menuPanel\"]/li[9]/a/span[1]");
	private By clkFin = By.xpath("//*[@id=\"menuPanel\"]/li[10]/a/span[1]");

   

	public Dashboard(WebDriver driver) {
		this.driver = driver;
	}
	public void getmaster() {
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(master)).build().perform();
	}
	public void getreport() {
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(reports)).build().perform();
	}
	public void gethsd() {
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(HSD)).build().perform();
	}
	public void gethr() {
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(HR)).build().perform();
	}
	public void gettyre() {
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(Tyre)).build().perform();
	}
	public void getapproval() {
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(Approval)).build().perform();
	}
	public void getstore() {
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(Store)).build().perform();
	}
	public void getfinance() {
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(Finance)).build().perform();
	}
	public void getmenu() {
		Actions a=new Actions(driver);
		 a.moveToElement(driver.findElement(clkmenu)).click().build().perform();
		
	}

	public void getclkMaster() throws InterruptedException {
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(clkmaster)).click().build().perform();
	}
	
	public void getclickReport() {
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(clkreport)).click().build().perform();
	}

	public void getclickHSD() {
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(clkhsd)).click().build().perform();
		
	}
	public void getclickHResource() {
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(clkHR)).click().build().perform();
		
	}
	public void getclickTyre() {
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(clkTyr)).click().build().perform();
	}
	public void getclickApproval() {
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(clkApp)).click().build().perform();
		
	}
	public void getclickStoreP() {
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(clkSP)).click().build().perform();
		
	}
	public void getclickFinance() {
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(clkFin)).click().build().perform();
		
	}
	
}
