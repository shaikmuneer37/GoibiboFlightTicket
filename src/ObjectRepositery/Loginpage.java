package ObjectRepositery;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Loginpage {
	
	
	public WebDriver driver ;

	public Loginpage(WebDriver driver){
		this.driver =driver;
	}

	
	By fromplace = By.id("gosuggest_inputSrc");
    By toplace = By.id("gosuggest_inputDest");
	By calenarpath = By.id("departureCalendar");
	By calmonthyeartext = By.xpath("//div[@class='DayPicker DayPicker--en']//div[@class='DayPicker-Caption']");
	By calsearch = By.xpath("//*[contains(@class,'DayPicker-NavButton DayPicker-NavButton--next')]");
	By datessearching = By.xpath("//*[@class='calDate']");
	
	//return calendar
	By returncal = By.id("returnCalendar");

	By button = By.id("gi_search_btn");
	public WebElement sourceplace() {
		return driver.findElement(fromplace);
		
	}
	
	public WebElement destinationplace() {
		return  driver.findElement(toplace);
		
	}
	public WebElement calendarpath() {
		return driver.findElement(calenarpath);
		
	}
	public WebElement monthsyearstext() {
		return driver.findElement(calmonthyeartext);
		
	}
	public WebElement serachbutton() {
		return driver.findElement(calsearch);
	}
	public List<WebElement> datessearchings() {
		return  driver.findElements(datessearching);
		
	}
	
	public WebElement returncalpath() {
		return driver.findElement(returncal);
	}
	
	public WebElement submit() {
		return driver.findElement(button);
	}
	
	

	
}

	/*public Loginpage(WebDriver driver){
		this.driver =driver;
		PageFactory.initElements(baseclass.driver, this);
	}

	
	@FindBy(id="gosuggest_inputSrc")
	public WebElement source ;
	
	@FindBy(id="gosuggest_inputDest")
	public WebElement destination; 
	
	@FindBy(id="departureCalendar")
	public WebElement calenarpath;
	
	@FindBy(xpath="//div[@class='DayPicker DayPicker--en']//div[@class='DayPicker-Caption']")
	public WebElement calmonthyeartext;
	
	@FindBy(xpath="//*[contains(@class,'DayPicker-NavButton DayPicker-NavButton--next')]")
	public WebElement calsearch;	
	
	@FindBy(xpath="//*[@class='calDate']")
	public List<WebElement> datessearching; 
	
	//return calendar
	@FindBy(id="returnCalendar")
	public WebElement returncal;

	@FindBy(id="gi_search_btn")
	public WebElement button;
	
	public WebElement source() {
		return source;
		
	}
	
	public WebElement destination() {
		return  destination;
		
	}
	public WebElement calendarpath() {
		return calenarpath;
		
	}
	public WebElement monthsyearstext() {
		return calmonthyeartext;
		
	}
	public WebElement serachbutton() {
		return calsearch;
	}
	public List<WebElement> datessearchings() {
		return   datessearching;
		
	}
	
	public WebElement returncalpath() {
		return returncal;
	}
	
	public WebElement submit() {
		return button;
	}
}*/
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	

