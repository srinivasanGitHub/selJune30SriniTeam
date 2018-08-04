package week2.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");

		ChromeDriver objDriver =new ChromeDriver();
		objDriver.get("http://leaftaps.com/opentaps/");

		//Login to Leaftaps

		objDriver.findElementById("username").sendKeys("DemoSalesManager");
		WebElement password =objDriver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		objDriver.findElementByClassName("decorativeSubmit").click();
		objDriver.findElementByLinkText("CRM/SFA").click();
		objDriver.findElementByLinkText("Leads").click();
		objDriver.findElementByLinkText("Find Leads").click();
		objDriver.findElementByXPath("//span[text()='Phone']").click();
		
		objDriver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("9998887770");
		
		objDriver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(10000);
		
		String leadID =objDriver.findElementByXPath("(//a[@class='linktext'])[4]").getText();
		
		objDriver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		
		objDriver.findElementByXPath("//a[text()='Delete']").click();
		
		objDriver.findElementByLinkText("Find Leads").click();
		
		objDriver.findElementByXPath("//input[@name='id']").sendKeys(leadID);
		
		objDriver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000);
		
		if(objDriver.findElementByXPath("//div[text()='No records to display']").isDisplayed())
		{
			System.out.println("Record Deleted Successfully");
			
		}
		
		objDriver.close();
		
		

	}

}
