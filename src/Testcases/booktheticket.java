package Testcases;

import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import ObjectRepositery.Loginpage;
import ObjectRepositery.flightslists;
import ObjectRepositery.paymentPage;
import ObjectRepositery.signIn;
import ObjectRepositery.Ticketdetailspage;

public class booktheticket extends baseclass {


	@Test
	public void ticketbooking() throws InterruptedException {

		Scanner scanner = new Scanner(System.in);

		JavascriptExecutor je = (JavascriptExecutor) driver;	
		WebDriverWait wait = new WebDriverWait(driver, 5);


		//first page
		signIn sn  = new signIn(driver);


		wait.until(ExpectedConditions.elementToBeClickable(sn.buttonsigin())).click();

		//switch to popup iframe to enter login credentials into form
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("authiframe"));

		System.out.println("Enter Mobile Number");
		String mobilenumber = scanner.next();
		sn.RegisterNumber().sendKeys(mobilenumber);


		sn.continuebutton().click();//close button




		System.out.println(" Enter 1 Digit in OTP");

		String first = scanner.next();
		wait.until(ExpectedConditions.elementToBeClickable(sn.firstotps() )).sendKeys(first);	

		System.out.println("Enter 2 Digit in OTP");
		String second = scanner.next();
		wait.until(ExpectedConditions.elementToBeClickable(sn.secondotps())).sendKeys(second);
		System.out.println("Enter 3 Digit in OTP");
		String third = scanner.next();
		wait.until(ExpectedConditions.elementToBeClickable(sn.thirdotps())).sendKeys(third);
		System.out.println("Enter 4 Digit in OTP");
		String fourth = scanner.next();
		wait.until(ExpectedConditions.elementToBeClickable(sn.fourthotps())).sendKeys(fourth);


		sn.againcontinuebuttons().click(); // finally continue

		driver.switchTo().defaultContent(); //back to parent class



		// Source - Destination Searching 

		Loginpage lp = new Loginpage(driver); 

		Thread.sleep(2000);
		//source calendar date	
		String mnths="November 2020";
		String reqdates="25";

		lp.calendarpath().click(); // depature path

		while(!lp.monthsyearstext().getText().equalsIgnoreCase(mnths)){
			lp.serachbutton().click();
		}

		List<WebElement> date  = lp.datessearchings();
		int count = date.size();
		for(int i=0;i<count;i++)
		{
			String text  =   lp.datessearchings().get(i).getText();
			if(text.equalsIgnoreCase(reqdates))
			{
				lp.datessearchings().get(i).click();
				break;
			}
		}


		// return calendar date

		String mnth_return="November 2020";
		String dateretrun="28";

		lp.returncalpath().click();

		while(!lp.monthsyearstext().getText().equalsIgnoreCase(mnth_return))
		{
			lp.serachbutton().click();
		}


		List<WebElement> date1  =  lp.datessearchings();
		int count1  =  date1.size();
		for(int i=0;i<count1;i++)
		{
			String text2  =   lp.datessearchings().get(i).getText();
			if(text2.equalsIgnoreCase(dateretrun))
			{
				lp.datessearchings().get(i).click();
				break;
			}
		}




		lp.sourceplace().sendKeys("Mumbai");
		Thread.sleep(2000);
		lp.sourceplace().sendKeys( Keys.ARROW_DOWN );
		lp.sourceplace().sendKeys(Keys.ENTER);


		//Destination place

		WebElement elem = lp.destinationplace();

		((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);

		lp.destinationplace().sendKeys("Delhi");
		Thread.sleep(3000);
		lp.destinationplace().sendKeys( Keys.ARROW_DOWN );
		lp.destinationplace().sendKeys(Keys.ENTER);


		// click on search button
		WebElement button = lp.submit();
		je.executeScript("arguments[0].click()", button);





		// page-2


		flightslists fs = new flightslists(driver);


		WebElement par = fs.prices();
		Actions ac = new Actions(driver);
		ac.doubleClick(par).build().perform();


		List<WebElement>details= fs.costofflights();
		int n = details.size()- (details.size()-1);
		System.out.println("no of flights selecte="+ n);
		for(int i=0; i< n;i++) {

			System.out.println(details.get(i).getText()); 
			fs.towardflights().click();  	
		}



		// return flight 
		WebElement returnar = fs.returnprices();
		Actions returnactions = new Actions(driver);
		returnactions.doubleClick(returnar).build().perform();




		List<WebElement> returndetails= fs.returnpricelists() ;
		System.out.println("Totoal flights ="+returndetails.size());  
		int nr = returndetails.size()-(returndetails.size()-1);
		for(int i=0; i<nr;i++) {

			System.out.println("return prices="+returndetails.get(i).getText());

			fs.returnflightradiobuttons().click(); 	// its select the fitst radio button
		}	

		je.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);

		//final total amount
		fs.finalamount().click();		

		Thread.sleep(3000);

		System.out.println("-----page-3-------");

		/*//Scanner scanner = new Scanner(System.in);
		System.out.println("—title- Mr/Mrs --");
		String titlename = scanner.next();
		System.out.println("—first name --");
		String firstname =scanner.next();
		System.out.println("—Middle Name --");
		String middlename = scanner.next();
		System.out.println("—last Name --");
		String lastname = scanner.next();
		System.out.println("—mobile Number --");
		String number = scanner.next();
		System.out.println("—Email id  --");
		String email = scanner.next();*/




		String titlename = "Mr";

		String firstname ="muneer";
		System.out.println("—Middle Name --");
		String middlename = "basha";
		System.out.println("—last Name --");
		String lastname = "shaik";
		System.out.println("—mobile Number --");
		String number = "9705664543";
		System.out.println("—Email id  --");
		String email = "shaikmyneer438@gmail.com";		



		je.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);

		Ticketdetailspage psd = new Ticketdetailspage(driver);



		WebDriverWait wait3 = new WebDriverWait(driver,30);
		je.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000);

		je.executeScript("document.getElementsByName('AdultmiddleName1').value='basha';");

		//psd.middlenames().sendKeys(middlename); 

		WebElement title1 = wait3.until(ExpectedConditions.elementToBeClickable(psd.title()));
		Select sel = new Select(title1);
		sel.selectByVisibleText(titlename);	

		wait3.until(ExpectedConditions.elementToBeClickable(psd.firstnames())).sendKeys(firstname);



		psd.lastname().sendKeys(lastname); 
		psd.emails().sendKeys(email);	    
		psd.mobilenumbers().sendKeys(number);  

		wait3.until(ExpectedConditions.elementToBeClickable(psd.travelprocedbuttons())).click();//procedbutton



		System.out.println("--------------Page-4----------");

		paymentPage pay = new paymentPage(driver);

		pay.covidnotifications().click();



	}}

