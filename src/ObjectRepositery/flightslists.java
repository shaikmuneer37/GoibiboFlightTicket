package ObjectRepositery;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class flightslists {
	
	
 WebDriver driver ;

	public flightslists(WebDriver driver) {
		this.driver= driver;
		
	}



	By price = By.xpath("//ul[@class='fltHpySrt ico12 dF justifyAround whiteBg pad10 brdrRd5']//li[@id='PRICE']");
	public WebElement prices() {
		return driver.findElement(price);
	}
	
	By costofflight = By.xpath("//*[@class='dF justifyBetween alignItemsEnd padTB10']");
	public List<WebElement> costofflights() {
		return driver.findElements(costofflight);
	}
	
	public By towordflight = By.cssSelector("div[class='fltHpyOnwrdWrp'] div[data-cy='flightItem_NAV42#:SG258SG8481'] span[class='custRad']");
	public WebElement towardflights() {
		return driver.findElement(towordflight);
	}
	
	//returnside
	
	
	By returnprice = By.xpath("//*[@class='fltHpyRtrnWrp']//li[@id='PRICE']");
	public WebElement returnprices() {
		return driver.findElement(returnprice);
	}
	
	 By returnpricelist = By.xpath("//div[@class='fltHpyRtrnWrp']//div[@class='fltHpyRsltCard flexCol whiteBg marginT10 brdrRd5']");
	 public List<WebElement> returnpricelists() {
		 return driver.findElements(returnpricelist);
		 }
	 
	 By returnflightradiobutton = By.xpath("//div[@class='fltHpyRtrnWrp']//div[@class='fltHpyRsltCard flexCol whiteBg marginT10 brdrRd5']//span[@class='custRad']");
	 public WebElement returnflightradiobuttons() {
		 return driver.findElement(returnflightradiobutton);
	 }
	 
	 
	 By totalcost = By.cssSelector("div[class='flexCol fltHpyRsltCard whiteBg brdrRd10 pad10 stickyHpy marginT5 padB15'] input[type='button']");
	 public WebElement finalamount() {
		 return driver.findElement(totalcost);
	 }
	
	
	
}
	
	/*public WebDriver driver ;


	public flightslists(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//ul[@class='fltHpySrt ico12 dF justifyAround whiteBg pad10 brdrRd5']//li[@id='PRICE']")
	public WebElement price;
	
	public WebElement price() {
		return price;
	}
	
	@FindBy(xpath="//*[@class='dF justifyBetween alignItemsEnd padTB10']")
   public List<WebElement> costofflight;
	
	public List<WebElement> costofflight() {
		return costofflight ;
	}
	
	@FindBy(css="div[class='fltHpyOnwrdWrp'] div[data-cy='flightItem_NAV42#:SG258SG8481'] span[class='custRad']")
			public WebElement towordflight;
	public WebElement towardflight() {
		return towordflight;
	}
	
	//returnside
	
	
	@FindBy(xpath="//*[@class='fltHpyRtrnWrp']//li[@id='PRICE']")
			public WebElement returnprice;
	public WebElement returnprice() {
		return returnprice;
	}
	
	@FindBy(xpath="//div[@class='fltHpyRtrnWrp']//div[@class='fltHpyRsltCard flexCol whiteBg marginT10 brdrRd5']")
	 public List<WebElement> returnpricelist;
	 public List<WebElement> returnpricelists() {
		 return returnpricelist;
		 }
	 
	 @FindBy(css="div[class='fltHpyRtrnWrp'] div[data-cy='flightItem_NAV42#:SG8480SG377'] span[class='custRad']")
	 public WebElement returnflightradiobutton;
	 public WebElement returnflightradiobutton() {
		 return returnflightradiobutton;
	 }
	 
	 
	
	@FindBy(css="div[class='flexCol fltHpyRsltCard whiteBg brdrRd10 pad10 stickyHpy marginT5 padB15'] input[type='button']" )
	public WebElement totalamountbutton;
	public WebElement totalamountbutton() {
		 return returnflightradiobutton;
	 }*/


	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
