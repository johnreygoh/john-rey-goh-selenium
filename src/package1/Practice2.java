package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice2 {

	WebDriver driver = null;

	@Test
	public void getcontrols() throws Exception {

		// driver.get("file:///C:/Users/core360/Desktop/site1/index.html");
		driver.get("https://www.sti.edu/");

		//list all input control depending on condition
		List<WebElement> textboxes = driver.findElements(By.tagName("input"));
		String tbType = "";
		for (WebElement textbox : textboxes) {

			tbType = textbox.getAttribute("type");
			if (tbType.equals("text")) {
				System.out.println("id:" + textbox.getAttribute("id") + " name:" + textbox.getAttribute("name"));
			}
			
		}
		
		//get all id of all paragraphs
		List<WebElement> paragraphsid = driver.findElements(By.tagName("p"));
		for(WebElement paragraphid:paragraphsid) {
			System.out.println("paragraph id:" + paragraphid.getAttribute("id")
			+ "\n" + paragraphid.getText() + "\n\n");
		}
		
		
		//get texts in a paragraph
		//WebElement parag = driver.findElement(By.id("article1"));
		//System.out.println(parag.getText());
		
		WebElement tb_name = driver.findElement(By.id("text1"));
		WebElement tb_office = driver.findElement(By.id("text2"));
		WebElement tb_email = driver.findElement(By.id("text3"));
		WebElement rad_gender = driver.findElement(By.id("radio2"));
		
		
		tb_name.sendKeys("Manny");
		tb_office.sendKeys("Manila");
		tb_email.sendKeys("manny@abc.com");
		rad_gender.click();
		
		
				
		Thread.sleep(5000);
	}

	@BeforeMethod
	public void beforeMethod() {

		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");
		driver = new FirefoxDriver();

	}

	@AfterMethod
	public void afterMethod() {

		driver.close();
		
		//add other commands here to run when closing the test
		

	}

}
