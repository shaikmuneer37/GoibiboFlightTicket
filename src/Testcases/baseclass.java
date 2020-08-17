package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class baseclass {
	
	public WebDriver driver ;
	
	@Test
	public void testbase() {
		
		System.setProperty("webdriver.chrome.driver" ,System.getProperty("user.dir")+"/Drivers/chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		 driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("https://www.goibibo.com");
		//driver.get("https://www.goibibo.com/flight-review/?ls=1&t=2231a1a2053a05b624a0d059d7b51109");
	//	driver.get("https://www.goibibo.com/flights/air-BOM-DEL-20201125-20201128-1-0-0-E-D/");
	
		//driver.get("https://www.goibibo.com/flights/air-BOM-DEL-20201110-20201118-1-0-0-E-D/");
	}
	

}
