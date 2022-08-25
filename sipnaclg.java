package Project;

import java.awt.Window;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sipnaclg {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Rohit\\Desktop\\selenium jar\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver w=new ChromeDriver();
		w.get("https://sipnaengg.ac.in/");
		Thread.sleep(2000);
		w.manage().window().maximize();
		
	// for Innovative Practices link
		w.findElement(By.linkText("Innovative Practices")).click();
		Thread.sleep(3000);
		System.out.println("Innovative Link Open");

		JavascriptExecutor js=(JavascriptExecutor) w;
		js.executeScript("window.scrollTo(0,2500)");
		
		w.navigate().back();
		System.out.println("Innovative Link Close\n");
		
	// for Highlights link
			w.findElement(By.linkText("Highlights")).click();
			Thread.sleep(3000);
			System.out.println("Highlights Link is Opened");
				
			w.findElement(By.xpath("//a[contains(text(),'ADMISSION ENQUIRY ..(Click to view)')]")).click();
		
	//for enquiry button
			Thread.sleep(2000);
			w.findElement(By.linkText("Enquiry form")).click();
			Thread.sleep(3000);
			w.navigate().back();
			
	 //For know more button 
			Thread.sleep(2000);
			w.findElement(By.linkText("Know More")).click();
			Thread.sleep(3000);
			w.navigate().back();
			Thread.sleep(2000);
			w.navigate().to("https://sipnaengg.ac.in/");
			System.out.println("Redirecting to main page. \n");
		
// for admission 20-21 link
			Thread.sleep(4000);
			w.findElement(By.xpath("//body/div[@id='page']/div[@id='content']/div[@id='primary']/div[1]/div[1]/div[1]/main[1]/article[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/h3[1]/a[1]")).click();
			Thread.sleep(3000);
			System.out.println("admission Link is Opened");

		//visit us link
			w.findElement(By.xpath("//strong[contains(text(),'Visit Us: https://admission.sipnaengg.ac.in/')]")).click();

			JavascriptExecutor js1=(JavascriptExecutor) w;
			js1.executeScript("window.scrollTo(0,4000)");
				
			w.navigate().back();
			Thread.sleep(2000);
			w.navigate().to("https://sipnaengg.ac.in/");
			System.out.println("Redirecting to main page. \n");
			
//=======================================================================================		
	//for president desk link
			w.findElement(By.xpath("//body/div[@id='page']/div[@id='content']/div[@id='primary']/div[1]/div[1]/div[1]/main[1]/article[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/p[1]/a[1]")).click();
			Thread.sleep(2000);
			w.navigate().back();
			
	//for principle desk link	
			w.findElement(By.xpath("//body/div[@id='page']/div[@id='content']/div[@id='primary']/div[1]/div[1]/div[1]/main[1]/article[1]/div[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[2]/p[1]/a[1]")).click();
			Thread.sleep(2000);
			w.navigate().back();
			
	//for Read more link
		w.findElement(By.linkText("READ MORE")).click();
		Thread.sleep(2000);
		w.navigate().back();
	
	//for R and D cell link
		w.findElement(By.xpath("//body/div[@id='page']/div[@id='content']/div[@id='primary']/div[1]/div[1]/div[1]/main[1]/article[1]/div[1]/div[16]/div[1]/div[1]/div[1]/div[1]/div[2]/p[2]/span[1]/a[1]")).click();
		Thread.sleep(3000);
		System.out.println("Redirecting to main page");
		w.navigate().back();
		
	//for award and achievement link
		w.findElement(By.xpath("//body/div[@id='page']/div[@id='content']/div[@id='primary']/div[1]/div[1]/div[1]/main[1]/article[1]/div[1]/div[16]/div[3]/div[1]/div[1]/div[1]/div[2]/p[2]/span[1]/a[1]")).click();
		Thread.sleep(2000);
		System.out.println("Redirecting to main page");
		w.navigate().back();
	
	//for news - View all button
		w.findElement(By.linkText("VIEW ALL")).click();
		Thread.sleep(5000);
		
		JavascriptExecutor js20=(JavascriptExecutor) w;
		js20.executeScript("window.scrollTo(0,2000)");
		Thread.sleep(5000);
		
		w.navigate().back();
		System.out.println("Redirecting to main page");
//===============================================================================				
	//Defect- dropdown not working
		/*for latest event
	 	Select s=new Select(w.findElement(By.tagName("select")));
		s.selectByValue("1");
	
	//Defect- search button not working
		w.findElement(By.cssSelector("#mec_sf_s_4915")).sendKeys("Shivmohotstav");
		w.findElement(By.xpath("//body/div[@id='page']/div[@id='content']/div[@id='primary']/div[1]/div[1]/div[1]/main[1]/article[1]/div[1]/div[18]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/i[1]")).click();
		*/
//==================================================================================	
	//for redirecting another branch of clg
		w.findElement(By.xpath("//body/div[@id='page']/div[@id='content']/div[@id='primary']/div[1]/div[1]/div[1]/main[1]/article[1]/div[1]/div[20]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
		System.out.println("Sipna School of Planning & Architecture Site is Opened");
		Thread.sleep(2000);
		w.navigate().back();
		
	// for redirecting to chikhaldara branch
		w.findElement(By.xpath("//body/div[@id='page']/div[@id='content']/div[@id='primary']/div[1]/div[1]/div[1]/main[1]/article[1]/div[1]/div[20]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
		System.out.println("Sipna Arts,Science & Commerce College, Chikhaldara Site is opened\n");
		Thread.sleep(2000);
		w.navigate().back();

//===========================================================================
	//for Campus facility link	
		Actions act=new Actions(w);
		act.moveToElement(w.findElement(By.xpath("/html[1]/body[1]/div[2]/header[1]/div[2]/div[3]/nav[1]/ul[1]/li[8]/a[1]"))).perform();
		Thread.sleep(5000);
	
	//for gym and sport link	
		w.findElement(By.xpath("//header/div[2]/div[3]/nav[1]/ul[1]/li[8]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(4000);
		JavascriptExecutor js12=(JavascriptExecutor) w;
		js12.executeScript("window.scrollTo(0,500)");
		Thread.sleep(5000);
		w.navigate().back();	

	//for Girls hostel Link
		Thread.sleep(2000);
		act.moveToElement(w.findElement(By.xpath("/html[1]/body[1]/div[2]/header[1]/div[2]/div[3]/nav[1]/ul[1]/li[8]/a[1]"))).perform();
		Thread.sleep(2000);
	
		w.findElement(By.xpath("//header/div[2]/div[3]/nav[1]/ul[1]/li[8]/ul[1]/li[2]/a[1]")).click();
		Thread.sleep(4000);
		JavascriptExecutor js13=(JavascriptExecutor) w;
		js13.executeScript("window.scrollTo(0,500)");
		Thread.sleep(5000);

		w.navigate().back();
	
	//for ambulance link
			Thread.sleep(3000);
		act.moveToElement(w.findElement(By.xpath("/html[1]/body[1]/div[2]/header[1]/div[2]/div[3]/nav[1]/ul[1]/li[8]/a[1]"))).perform();
		Thread.sleep(5000);
			
		w.findElement(By.xpath("//header/div[2]/div[3]/nav[1]/ul[1]/li[8]/ul[1]/li[3]/a[1]")).click();
		Thread.sleep(4000);
		JavascriptExecutor js14=(JavascriptExecutor) w;
		js14.executeScript("window.scrollTo(0,400)");
		Thread.sleep(5000);

		w.navigate().back();

//for ATM link
		Thread.sleep(3000);	
		act.moveToElement(w.findElement(By.xpath("/html[1]/body[1]/div[2]/header[1]/div[2]/div[3]/nav[1]/ul[1]/li[8]/a[1]"))).perform();
		Thread.sleep(5000);
								
		w.findElement(By.xpath("//header/div[2]/div[3]/nav[1]/ul[1]/li[8]/ul[1]/li[4]/a[1]")).click();
		Thread.sleep(4000);
		JavascriptExecutor js15=(JavascriptExecutor) w;
		js15.executeScript("window.scrollTo(0,300)");
		Thread.sleep(5000);

		w.navigate().back();

//for Medical dispensary link
		Thread.sleep(3000);		
		act.moveToElement(w.findElement(By.xpath("/html[1]/body[1]/div[2]/header[1]/div[2]/div[3]/nav[1]/ul[1]/li[8]/a[1]"))).perform();
		Thread.sleep(5000);
								
		w.findElement(By.xpath("/html[1]/body[1]/div[2]/header[1]/div[2]/div[3]/nav[1]/ul[1]/li[8]/ul[1]/li[5]/a[1]")).click();
		Thread.sleep(4000);
		JavascriptExecutor js16=(JavascriptExecutor) w;
		js16.executeScript("window.scrollTo(0,400)");
		Thread.sleep(5000);

		w.navigate().back();

	//for audio & video learning link
		Thread.sleep(3000);
		act.moveToElement(w.findElement(By.xpath("/html[1]/body[1]/div[2]/header[1]/div[2]/div[3]/nav[1]/ul[1]/li[8]/a[1]"))).perform();
		Thread.sleep(5000);
								
		w.findElement(By.xpath("//header/div[2]/div[3]/nav[1]/ul[1]/li[8]/ul[1]/li[6]/a[1]")).click();
		Thread.sleep(4000);
		JavascriptExecutor js17=(JavascriptExecutor) w;
		js17.executeScript("window.scrollTo(0,400)");
		Thread.sleep(5000);

		w.navigate().back();

//=================================================================================	
	//for IQAC link
		w.findElement(By.xpath("//header/div[2]/div[3]/nav[1]/ul[1]/li[9]/a[1]")).click();
		Thread.sleep(5000);

		JavascriptExecutor js18=(JavascriptExecutor) w;
		js18.executeScript("window.scrollTo(0,400)");
		Thread.sleep(4000);
		
	//	for action taken report link
		w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/main[1]/article[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]/div[1]/span[1]")).click();
		Thread.sleep(4000);
		
	//for NAAC SSR link
		w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/main[1]/article[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")).click();
		Thread.sleep(4000);
	
	//for NAAC certificate link
		w.findElement(By.xpath("//span[contains(text(),'NAAC Certificate')]")).click();
		Thread.sleep(4000);

	//for Academic calendar link	
		w.findElement(By.xpath("//span[contains(text(),'Academic Calender Links')]")).click();
		Thread.sleep(4000);
		
		w.navigate().back();	
	//====================================================================================	
// for Library link
		w.findElement(By.xpath("//header/div[2]/div[3]/nav[1]/ul[1]/li[10]/a[1]")).click();
		Thread.sleep(3000);
		
		JavascriptExecutor js19=(JavascriptExecutor) w;
		js19.executeScript("window.scrollTo(0,400)");
		Thread.sleep(4000);
		
	//for closing about link
		w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/main[1]/article[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/h2heading[1]")).click();
		Thread.sleep(2000);
		
	//for library resources link
		w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/main[1]/article[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/h2heading[2]")).click();
		Thread.sleep(3000);
		w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/main[1]/article[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/h2heading[2]")).click();
		Thread.sleep(3000);
		
	//for library timing link
		w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/main[1]/article[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/h2heading[3]")).click();
		Thread.sleep(3000);
		w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/main[1]/article[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/h2heading[3]")).click();
		Thread.sleep(3000);
	
	//for library staff link
		w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/main[1]/article[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/h2heading[4]")).click();
		Thread.sleep(3000);
		JavascriptExecutor js20=(JavascriptExecutor) w;
		js20.executeScript("window.scrollTo(0,1600)");
		Thread.sleep(4000);
		w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/main[1]/article[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/h2heading[4]")).click();
		
		w.navigate().back();
		System.out.println("Redirecting to main page.\n");

//===========================================================================================	
//functional defect - back to home option is not there
		//for featured link	- ICC Link
	/*
		w.findElement(By.linkText("Internal Complaint Committee(ICC)")).click();
		System.out.println("ICC link is Opened");
		Thread.sleep(4000);
		Set <String> windows=w.getWindowHandles();
		
		Iterator <String> itr=windows.iterator();
		String parent_window=itr.next();  
		String child_window=itr.next();
		Thread.sleep(5000);
		w.switchTo().window(child_window);
	
		JavascriptExecutor js2=(JavascriptExecutor) w;
		js2.executeScript("window.scrollTo(0,500)");
		Thread.sleep(3000);
		System.out.println("Back to main page");
		w.close();
		*/
//----------------------------------------------------------------------------------------
		// For Entrepreneurship Development Cell Link
			Thread.sleep(3000);	
		w.findElement(By.linkText("Entrepreneurship Development Cell")).click();
		System.out.println("Entrepreneurship Development Cell link is Opened");
		Thread.sleep(2000);
		
//function defect- about button is remain open			
	//for about  option
		System.out.println("About option is opened ");
		Thread.sleep(2000);
		w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/main[1]/article[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/h2heading[1]")).click();
		System.out.println("About option is close\n");
		Thread.sleep(2000);
	
	//for program and workshop option
		w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/main[1]/article[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/h2heading[2]")).click();
		System.out.println("Program and workshop option is opened ");
		Thread.sleep(2000);
		w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/main[1]/article[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/h2heading[2]")).click();
		System.out.println("Program and workshop option is closed\n ");
		Thread.sleep(2000);
		
	//for Start-ups option
		w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/main[1]/article[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/h2heading[3]")).click();
		System.out.println("Start-ups option is opened ");
		Thread.sleep(2000);
		w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/main[1]/article[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/h2heading[3]")).click();
		System.out.println("Start-ups option is closed\n ");
		Thread.sleep(2000);
	
	//for Image gallary option
		w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/main[1]/article[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/h2heading[4]")).click();
		System.out.println("Image gallary option is opened ");
		Thread.sleep(2000);		
		w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/main[1]/article[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/h2heading[4]")).click();
		System.out.println("Image gallary option is closed\n ");
		Thread.sleep(2000);
		
		w.navigate().back();
		System.out.println("Redirecting to main page");
		
	//for solar plant link	
		w.findElement(By.linkText("Solar Power Plant at Sipna")).click();
		System.out.println("Solar plant link is opened");
		Thread.sleep(2000);
		
		JavascriptExecutor js3=(JavascriptExecutor) w;
		js3.executeScript("window.scrollTo(0,1500)");
		w.navigate().back();
		System.out.println("Redirected to main page\n");	
	
	//for IPR link
		w.findElement(By.linkText("Intellectual Property Right")).click();
		System.out.println("Intellectual Property Right link is opened");
		Thread.sleep(2000);
		
		JavascriptExecutor js4=(JavascriptExecutor) w;
		js4.executeScript("window.scrollTo(0,2500)");
		w.navigate().back();
		System.out.println("Redirected to main page. \n");		

	//for IIC (MHRD) link
		w.findElement(By.cssSelector("#menu-item-71")).click();
		Thread.sleep(3000);
		w.navigate().back();

	//for LMS desc. link
		w.findElement(By.linkText("LMS Description")).click();
	 	Thread.sleep(3000);
	 	System.out.println("LMS Description wesite is opened");
	
	 	//for search button	 	
	 	Scanner sc=new Scanner(System.in);
	 	System.out.println("Enter search:");
		String search=sc.nextLine();
		
		w.findElement(By.xpath("//body/div[@id='page']/div[@id='content']/div[@id='primary']/div[1]/div[1]/div[2]/aside[1]/div[1]/form[1]/label[1]/input[1]")).sendKeys(search);
		w.findElement(By.xpath("//body/div[@id='page']/div[@id='content']/div[@id='primary']/div[1]/div[1]/div[2]/aside[1]/div[1]/form[1]/input[1]")).click();
	 	System.out.println("your search for "+search+ " is shown\n");
	 	
	 	JavascriptExecutor js5=(JavascriptExecutor) w;
		js5.executeScript("window.scrollTo(0,1500)");
		Thread.sleep(5000);
		w.navigate().back();
	
//Non-Functional defect
//for Civil Engineeing link
		w.findElement(By.linkText("Civil Engineeing")).click();
		System.out.println("Civil Engineeing link is opened.");
		JavascriptExecutor js6=(JavascriptExecutor) w;
		js6.executeScript("window.scrollTo(0,700)");
		Thread.sleep(5000);
		w.navigate().back();
		System.out.println("Back To LMS wesite.\n");
	
	//for CSE link
		w.findElement(By.linkText("CSE")).click();
		System.out.println("CSE link is opened.");
		JavascriptExecutor js7=(JavascriptExecutor) w;
		js7.executeScript("window.scrollTo(0,700)");
		Thread.sleep(5000);
		w.navigate().back();
		System.out.println("Back To LMS wesite");
		w.navigate().back();
		System.out.println("Redirecting to main page.\n");
	
	//for image gallery link
		w.findElement(By.linkText("Image Gallery")).click();
		System.out.println("Image gallary is opened");
		Thread.sleep(3000);
			
		JavascriptExecutor js8=(JavascriptExecutor) w;
		js8.executeScript("window.scrollTo(0,1500)");
		Thread.sleep(3000);
		
		w.navigate().back();
		System.out.println("Redirecting to main page\n");

	//for video Gallary
		w.findElement(By.linkText("Video Gallery")).click();
		System.out.println("Video Gallery is Opened");
		Thread.sleep(4000);
		JavascriptExecutor js9=(JavascriptExecutor) w;
		js9.executeScript("window.scrollTo(0,1500)");
		Thread.sleep(5000);
		w.navigate().back();
		System.out.println("Redirecting to main page.\n");	
		
	//for IETE Amravati Center	
		Thread.sleep(3000);
		w.findElement(By.linkText("IETE Amravati Center")).click();
		System.out.println("IETE Amravati Center is Opened");
		Thread.sleep(4000);
		JavascriptExecutor js10=(JavascriptExecutor) w;
		js10.executeScript("window.scrollTo(0,500)");
		Thread.sleep(5000);
		w.navigate().back();
		System.out.println("Redirecting to main page.\n");	
	
//=====================================================================================
		//functional defect	-link is fail to redirecting on another page	
		//for mail login link
		//w.findElement(By.linkText("Mail Login")).click();
		
//=====================================================================================		
	//for mandatory disclosure link	
		w.findElement(By.linkText("Mandatory Disclosure")).click();
		Thread.sleep(2000);
		w.navigate().back();
		
	//for fees structure link	
		w.findElement(By.linkText("Fees Structure 2020-21")).click();
		JavascriptExecutor js11=(JavascriptExecutor) w;
		js11.executeScript("window.scrollTo(0,500)");
	
		Thread.sleep(4000);
		w.navigate().back();
	
	//for scroll up button
		w.findElement(By.xpath("//body/a[1]")).click();
		System.out.println("Scroll upto top of page");
		
	}

}
