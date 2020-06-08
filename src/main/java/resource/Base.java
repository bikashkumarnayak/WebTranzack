package resource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Base {
	
	public Properties prop;
	public static WebDriver driver;

	public WebDriver initializeDriver() throws IOException  {
		
		prop = new Properties();
		FileInputStream fil = new FileInputStream(System.getProperty("user.dir")+
				"\\src\\main\\java\\resource\\data.Properties");
		prop.load(fil);
		//String browserName=System.getProperty("browser");
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.silentOutput", "true");
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			ChromeOptions options=new ChromeOptions();
			if(browserName.contains("headless"))
			options.addArguments("headless");

			driver = new ChromeDriver(options);

		} else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();

		} else {
			System.out.println("browser not Present");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	public void getScreenshot(String result) throws Exception {
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr,new File(System.getProperty("user.dir")+"\\Screen\\ScreenShot" + result + "ScreenShot.png"));
	}
//	public String getScreenshotPath(String TestCaseName,WebDriver Driver) throws IOException {
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		File Source=ts.getScreenshotAs(OutputType.FILE);
//		String destpath=System.getProperty("user.dir")+"\\Screen\\ScreenShot" + TestCaseName + ".png";
//		File file=new File(destpath);
//		FileUtils.copyFile(Source, file);
//		return destpath;
//	}

	}

	

	

