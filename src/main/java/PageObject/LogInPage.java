package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LogInPage {
		public WebDriver driver;

		   private By username=By.xpath("//*[@id=\"username\"]");
		   private By password=By.xpath("//*[@id=\"password\"]");
		   private By check=By.xpath("/html/body/div/div/div/form/div[3]/label");
		   private By login=By.xpath("//*[@id=\"login\"]");

			public LogInPage(WebDriver driver) {
				this.driver=driver;
			}
			public WebElement getuser() {
				 return driver.findElement(username);
			}
			public WebElement getpass() {
				return driver.findElement(password);
			}
			public WebElement getcheck() {
				return driver.findElement(check);
			}
			public WebElement getlogin() {
				return driver.findElement(login);
			}
//			public void gethighLightElement(WebElement element){
//				   JavascriptExecutor js = ((JavascriptExecutor)driver);
//				   js.executeScript("arguments[0].setAttribute('style','background: red; border: 2px solid red;');", element);   
//				 }
			public void getborder(WebElement element){
				   JavascriptExecutor js = ((JavascriptExecutor)driver);
				   js. executeScript("arguments[0].setAttribute('style', 'background: red; border: 4px solid red;');", element);   
				 }
			
		}