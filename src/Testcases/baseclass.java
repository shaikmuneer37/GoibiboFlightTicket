package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class baseclass {
	
	public WebDriver driver ;
	
	@Test
	public void testbase() {
		
		String browsername ="chrome";
		
		if(browsername.equalsIgnoreCase("chrome")) 
		{
			
		
		System.setProperty("webdriver.chrome.driver" ,System.getProperty("user.dir")+"/Drivers/chromedriver.exe");

		 driver=new ChromeDriver();
		}
		
		else if(browsername.equalsIgnoreCase("firefox"))  {
		 System.setProperty("webdriver.gecko.driver" ,System.getProperty("user.dir")+"/Drivers/geckodriver.exe");

		 driver=new FirefoxDriver();
		}
		 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		//driver.get("https://www.goibibo.com");
		//2 nd page
		driver.get("https://www.goibibo.com/flights/air-BOM-DEL-20201125-20201128-1-0-0-E-D/");
//driver.get("https://www.goibibo.com/flight-review/?ls=2&t=ecaaf6fcea594efb659a2ea774640293");
	
	
	}
	

}
