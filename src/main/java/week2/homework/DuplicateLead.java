package week2.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

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
		objDriver.findElementByXPath("//span[text()='Email']").click();

		objDriver.findElementByXPath("//input[@name='emailAddress']").sendKeys("test@testmail.com");

		objDriver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(10000);

		//String leadname =objDriver.findElementByXPath("(//a[@class='linktext'])[6]").getText();

		objDriver.findElementByXPath("(//a[@class='linktext'])[4]").click();

		objDriver.findElementByXPath("//a[text()='Duplicate Lead']").click();

		String duplicatetitle =objDriver.findElementById("sectionHeaderTitle_leads").getText();
		//String title1=objDriver.getTitle();
		if (objDriver.getTitle().contains(duplicatetitle))
		{
			System.out.println("Title verified Successfully");
		}
		
		objDriver.findElementByXPath("//input[@name='submitButton']").click();
		String leadname1 =objDriver.findElementByXPath("(//a[@class='linktext'])[6]").getText();
		String duplicateName =objDriver.findElementById("viewLead_firstName_sp").getText();
		if (leadname1.equals(duplicateName))
		{
			System.out.println("Captured Name and Duplicated Name are same");
		}
		else
		{
			System.out.println("Captured Name and Duplicated Name are not same");
		}
		//objDriver.close();
	}

}
