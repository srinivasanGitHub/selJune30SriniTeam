package week6.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginPage {

	
		ChromeDriver objDriver =new ChromeDriver();
		@Given("open browser")
		public void LaunchBrowser()
		{
			System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");

			
			objDriver.get("http://leaftaps.com/opentaps/");
		}
		@And("Enter username")
		public void enterUserName()
		{
			objDriver.findElementById("username").sendKeys("DemoSalesManager");
		}
		
		@And("Enter password")
		public void enterPassWord()
		{
			WebElement password =objDriver.findElement(By.id("password"));
			password.sendKeys("crmsfa");
		}

		//Login to Leaftaps
		@Then("Click Login")
		public void ClickLogin()
		{
		
		objDriver.findElementByClassName("decorativeSubmit").click();
		}
	

}
