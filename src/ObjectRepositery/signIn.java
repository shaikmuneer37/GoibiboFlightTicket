package ObjectRepositery;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signIn {
	
	
	
public WebDriver driver;
	
	public signIn(WebDriver driver) {
		this.driver= driver;
	}

	
	By buttonsignin = By.xpath("//*[text()='Sign In']");
	
	By RegNumber = By.xpath("//*[@id='authMobile']");
	
	By continuebutton = By.xpath("//*[@id='mobileSubmitBtn']");
	
	By enterotp = By.xpath("/html/body/section/div[3]/div[3]");
	
	By againcontinuebutton = By.xpath("//*[@id='authOtpSubmitBtn']") ;
	
	public WebElement buttonsigin() {
		return driver.findElement(buttonsignin);
	}
	
	public WebElement RegisterNumber() {
		return driver.findElement(RegNumber);
	}
	

	public WebElement continuebutton() {
		return driver.findElement(continuebutton);
	}
	
	public WebElement enterotp() {
		return driver.findElement(enterotp);
	}
	
	public WebElement againcontinuebuttons() {
		return driver.findElement(againcontinuebutton);
	}
}
