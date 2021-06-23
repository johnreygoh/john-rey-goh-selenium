package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice3 {

	WebDriver driver = null;

	@Test
	public void testlinks() throws Exception {

		driver.get("file:///C:/Users/core360/Desktop/site1/index.html");
		Thread.sleep(3000);
			
		// basis for validation
		// home
		String hometitle = "home";
		String homeurl = "file:///C:/Users/core360/Desktop/site1/index.html";
		String homebanner = "My Site";

		// page1
		String page1title = "Page1";
		String page1url = "file:///C:/Users/core360/Desktop/site1/page1.html";
		String page1banner = "Page1";

		// page2
		String page2title = "Page2";
		String page2url = "file:///C:/Users/core360/Desktop/site1/page2.html";
		String page2banner = "Page2";
		
		// user story check
		WebElement a2 = driver.findElement(By.id("linkpage1"));
		
		//click page1 link
		a2.click();
		Thread.sleep(5000);
		
		//validate
		String page1testurl = driver.getCurrentUrl();
		if(page1testurl.equals(page1url)) {
			System.out.println("page1 url correct.");
		}else {
			System.out.println("page1 url error.");
		}

		String page1testtitle = driver.getTitle();
		if(page1testtitle.equals(page1title)) {
			System.out.println("page1 title correct.");
		}else {
			System.out.println("page1 title error.");
		}
		
		String page1testbanner = driver.findElement(By.id("title")).getText();
		if(page1testbanner.equals(page1banner)) {
			System.out.println("page1 banner correct");
		}else {
			System.out.println("page1 banner error");
		}
		
		
		//click page2 link
		WebElement a3 = driver.findElement(By.id("linkpage2"));
		a3.click();
		Thread.sleep(5000);
		
		//validate
		String page2testurl = driver.getCurrentUrl();
		if(page2testurl.equals(page2url)) {
			System.out.println("page2 url correct.");
		}else {
			System.out.println("page2 url error.");
		}

		String page2testtitle = driver.getTitle();
		if(page2testtitle.equals(page2title)) {
			System.out.println("page2 title correct.");
		}else {
			System.out.println("page2 title error.");
		}
		
		String page2testbanner = driver.findElement(By.id("title")).getText();
		if(page2testbanner.equals(page2banner)) {
			System.out.println("page2 banner correct");
		}else {
			System.out.println("page2 banner error");
		}
		
		//click home link
		WebElement a1 = driver.findElement(By.id("linkhome"));
		a1.click();
		Thread.sleep(5000);
		
		//validate
		String hometesturl = driver.getCurrentUrl();
		if(hometesturl.equals(homeurl)) {
			System.out.println("home url correct.");
		}else {
			System.out.println("home url error.");
		}

		String hometesttitle = driver.getTitle();
		if(hometesttitle.equals(hometitle)) {
			System.out.println("home title correct.");
		}else {
			System.out.println("home title error.");
		}
		
		String hometestbanner = driver.findElement(By.id("title")).getText();
		if(hometestbanner.equals(homebanner)) {
			System.out.println("home banner correct");
		}else {
			System.out.println("home banner error");
		}
		
		
	}

	@BeforeMethod
	public void beforeMethod() {

		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");
		driver = new FirefoxDriver();

	}

	@AfterMethod
	public void afterMethod() {

		// driver.close();

	}
}
