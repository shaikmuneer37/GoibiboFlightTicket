package ObjectRepositery;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Ticketdetailspage {  
	
	
	
	public WebDriver driver;
	
	public Ticketdetailspage(WebDriver driver) {
		this.driver =driver;
		
	}
	
	
	
	By title = By.xpath("//select[@data-fieldname='Title']");
	
	public WebElement title() {
		return driver.findElement(title);
	}
	
	By firstname = By.xpath("//input[@data-field='firstName']");
	public WebElement firstnames() {
		return driver.findElement(firstname);
	}
	
	By middlename = By.xpath("//input[@data-field='middleName']");
	public WebElement middlenames() {
		return driver.findElement(firstname);
	}
	By lastname = By.xpath("//input[@data-field='lastName']");
	public WebElement lastname() {
		return driver.findElement(lastname);
	}
	
	By mobilenumber = By.xpath("//input[@data-field='mobile' and @maxlength='10']");
	public WebElement mobilenumbers() {
		return driver.findElement(mobilenumber);
	}
	
	By email = By.xpath("//input[@data-fieldname='Email']");
	public WebElement emails() {
		return driver.findElement(email);
	}
	
	By procedbutton = By.xpath("//*[@id='travellerForm']/div[2]/button");
	public WebElement travelprocedbuttons() {
		return driver.findElement(procedbutton);
	}
	
	/*driver.findElement(By.xpath("//input[@data-field='firstName']" )).sendKeys(firstname); 
	driver.findElement(By.xpath("//input[@data-field='middleName']")).sendKeys(middlename); 		
	driver.findElement(By.xpath("//input[@data-field='lastName']" )).sendKeys(lastname); 
	driver.findElement(By.xpath("//input[@data-fieldname='Email']")).sendKeys(email);	    
	driver.findElement(By.xpath("//input[@data-field='mobile' and @maxlength='10']")).sendKeys(number);  
	
	WebElement title1 = driver.findElement(By.xpath("//select[@data-fieldname='Title']"));
	Select sel = new Select(title1);
	sel.selectByVisibleText(titlename);	

	//procedbutton
	driver.findElement(By.xpath("//button[@class='button orange col-md-3 fr large dF justifyCenter min37']" )).click();
	//covid notification
	driver.findElement(By.xpath("//div[@class='flexCol pad20 black']//button[@class='button blue large fb padLR30']")).click();

	//proceed button
	driver.findElement(By.xpath("//span[@class='ico16 quicks f700']")).click();*/


}
