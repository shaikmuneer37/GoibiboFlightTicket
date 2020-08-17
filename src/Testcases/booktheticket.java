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
       
		Scanner sc = new Scanner(System.in);
		
		JavascriptExecutor je = (JavascriptExecutor) driver;	
	

		
		signIn sn  = new signIn(driver);
		
		List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
		System.out.println("Total number of iframes are " + iframeElements.size());
		
		
		
		 /*sn.buttonsigin().click(); 
		  * WebElement myframe =	driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[1]/div[2]/div/div/iframe"));
     	//driver.switchTo().frame(myframe);
     	Thread.sleep(3000);
     	je.executeScript("arguments[0].click()", myframe);*/
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Sign In"))).click();

		//switch to popup iframe to enter login credentials into form
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("authiframe"));
		
		System.out.println("Enter Mobile Number");
     	driver.findElement(By.xpath("//*[@id='authMobile']")).sendKeys("9705664547");
		
		
  
		sn.continuebutton().click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Continue"))).click();
		//close button
		driver.findElement(By.xpath("//*[@id='authOverlay']/div/a")).click();
		
		System.out.println(" OTP");
		String otp = sc.next();
		//sn.enterotp().sendKeys("0093");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@class='userDetailBlk']/div/input[@id='otp_index0']")).sendKeys("3");
		driver.findElement(By.xpath("//*[@class='userDetailBlk']/div/input[@id='otp_index1']")).sendKeys("2");
		driver.findElement(By.xpath("//*[@class='userDetailBlk']/div/input[@id='otp_index2']")).sendKeys("8");
		driver.findElement(By.xpath("//*[@class='userDetailBlk']/div/input[@id='otp_index3']")).sendKeys("2");
		
		sn.againcontinuebuttons().click(); // finally continue
		
		// child to parent frame work
		driver.switchTo().defaultContent(); 
		//FirstPage		

		Loginpage lp = new Loginpage(driver);
		
     	//source calendar date	
		String mnths="November 2020";
		String reqdates="25";
		lp.calendarpath().click();
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

		// source place
		
				lp.sourceplace().sendKeys("Mumbai");
				Thread.sleep(2000);
				lp.sourceplace().sendKeys( Keys.ARROW_DOWN );
				lp.sourceplace().sendKeys(Keys.ENTER);
				

				//Destination place
			
				lp.destinationplace().sendKeys("Delhi");
				Thread.sleep(3000);
				lp.destinationplace().sendKeys( Keys.ARROW_DOWN );
			    lp.destinationplace().sendKeys(Keys.ENTER);
	// search button
		//JavascriptExecutor je = (JavascriptExecutor) driver;	
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


		//final total amount
		fs.finalamount().click();		



		System.out.println("-----page-3-------");

		/*Scanner scanner = new Scanner(System.in);
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

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


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


		Ticketdetailspage psd = new Ticketdetailspage(driver);
		WebElement title1 = psd.title() ;
		Select sel = new Select(title1);
		sel.selectByVisibleText(titlename);	

		psd.firstnames().sendKeys(firstname); 
		psd.middlenames().sendKeys(middlename); 		
		psd.lastname().sendKeys(lastname); 
		psd.emails().sendKeys(email);	    
		psd.mobilenumbers().sendKeys(number);  

		psd.travelprocedbuttons();



		System.out.println("--------------Page-4----------");

		paymentPage pay = new paymentPage(driver);

		pay.covidnotifications().click();



	}}

