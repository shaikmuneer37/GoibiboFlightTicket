package ObjectRepositery;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class paymentPage {
	
	
	public WebDriver driver;
	
	public paymentPage(WebDriver driver) {
		this.driver= driver;
	}
	
	
	By covidnotification = By.xpath("//div[@class='flexCol pad20 black']//button[@class='button blue large fb padLR30']");
	public WebElement covidnotifications() {
		return driver.findElement(covidnotification);
	}
	
	
}
	
	



