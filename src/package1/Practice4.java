package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice4 {

	WebDriver driver=null;
	
	@Test
	public void f() {
		
		driver.get("file:///C:/Users/core360/Desktop/site1/index.html");
		
		WebElement txt_name = driver.findElement(By.xpath("/html/body/form/input[1]"));
		WebElement txt_office = driver.findElement(By.xpath("/html/body/form/input[2]"));
		WebElement txt_email = driver.findElement(By.xpath("/html/body/form/input[3]"));
		
		txt_name.sendKeys("Michael");
		txt_office.sendKeys("USA");
		txt_email.sendKeys("michael@abc.com");
		
		
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
