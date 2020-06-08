package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Attendance {
   WebDriver driver;
   private By Attendance=By.xpath("//*[@id=\"menuPanel\"]/li[6]/ul/li[2]/a/span[1]");
   private By Frame = By.cssSelector("#modalBody_23 > div.modal-contents.-ui-widget-content > div > iframe");
   private By Copy=By.xpath("//*[@id=\"attendanceTable_wrapper\"]/div[1]/button[1]/i");
   private By Excel=By.xpath("//*[@id=\"attendanceTable_wrapper\"]/div[1]/button[2]/i");
   private By CSV=By.xpath("//*[@id=\"attendanceTable_wrapper\"]/div[1]/button[3]/i");
   private By PDF=By.xpath("//*[@id=\"attendanceTable_wrapper\"]/div[1]/button[4]/i");
   private By Date=By.xpath("//*[@id='txtDate']");
   private By Month=By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]");
   private By year=By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]");
   private By Table=By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody");
   private By Submit=By.id("submitbtn");
   
   
   
   public Attendance(WebDriver driver) {
	   this.driver=driver;
   }
   
   public WebElement getAttendance() {
	   return driver.findElement(Attendance);
   }
   public WebDriver getFrame() {
		return driver.switchTo().frame(driver.findElement(Frame));
	}
   public WebElement getDate() {
	   return driver.findElement(Date);
   }
   public WebElement getMonth(){
	   return driver.findElement(Month);
   }
   public WebElement getYear(){
	   return driver.findElement(year);
   }
   public List<WebElement> getallData(){
	      return driver.findElements(Table);
   }
   public WebElement getSubmit() {
	   return driver.findElement(Submit);
   }
   public WebElement getTable() {
	   return driver.findElement(Table);
   }
   
   public WebElement getCoppy() {
	   return driver.findElement(Copy);
   }
   public WebElement getExcel() {
	   return driver.findElement(Excel);
   }
   public WebElement getCSV() {
	   return driver.findElement(CSV);
   }
   public WebElement getPDF() {
	   return driver.findElement(PDF);
   }
}
