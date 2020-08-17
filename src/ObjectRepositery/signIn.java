package ObjectRepositery;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signIn {



	public WebDriver driver;

	public signIn(WebDriver driver) {
		this.driver= driver;
	}


	By buttonsignin = By.partialLinkText("Sign In"); 

	By RegisterNumber = By.xpath("//*[@id='authMobile']");

	By continuebutton = By.xpath("//*[@id='mobileSubmitBtn']");

	By enterotp = By.xpath("/html/body/section/div[3]/div[3]");

	By againcontinuebutton = By.xpath("//*[@id='authOtpSubmitBtn']") ;

	By firstotp = By.xpath("//*[@class='userDetailBlk']/div/input[@id='otp_index0']");

	By secondotp = By.xpath("//*[@class='userDetailBlk']/div/input[@id='otp_index1']");

	By thirdotp = By.xpath("//*[@class='userDetailBlk']/div/input[@id='otp_index2']");

	By fourthotp = By.xpath("//*[@class='userDetailBlk']/div/input[@id='otp_index3']");

	public WebElement buttonsigin() {
		return driver.findElement(buttonsignin);
	}

	public WebElement RegisterNumber() {
		return driver.findElement(RegisterNumber);
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

	public WebElement firstotps() {

		return driver.findElement(firstotp);
	}

	public WebElement secondotps() {

		return driver.findElement(secondotp);
	}
	public WebElement thirdotps() {

		return driver.findElement(thirdotp);
	}
	public WebElement fourthotps() {

		return driver.findElement(fourthotp);
	}
}
