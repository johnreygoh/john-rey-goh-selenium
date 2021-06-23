package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice1 {

	WebDriver driver = null;

	@BeforeMethod
	public void beforeMethod() {

		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		//driver = new ChromeDriver();

		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");
		driver = new FirefoxDriver();

		
	}

	@Test
	public void test1() throws Exception {

		driver.get("https://www.meralco.com.ph");
		Thread.sleep(5000);
		
		WebElement searchtextbox = driver.findElement(By.name("keys"));
		searchtextbox.sendKeys("manila");
		searchtextbox.submit();
		Thread.sleep(2000);
		

	}

	@AfterMethod
	public void afterMethod() {

		// driver.close();

	}

}
