package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import resource.Base;

public class Devices extends Base {
	WebDriver driver;
	public Actions a;
	
	
	public Devices(WebDriver driver) {
		 this.driver=driver;
	}

}
