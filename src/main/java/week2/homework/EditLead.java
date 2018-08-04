package week2.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

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
		objDriver.findElementByXPath("(//input[@name=\"firstName\"])[3]").sendKeys("Srini");
		objDriver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000);
		objDriver.findElementByXPath("(//a[@class='linktext'])[4]").click();

		
		String editTitle =objDriver.findElementById("sectionHeaderTitle_leads").getText();
		if (objDriver.getTitle().contains(editTitle))
		{
			System.out.println("Title verified Successfully");
		}

		objDriver.findElementByXPath("//a[text()='Edit']").click();

		String compName = objDriver.findElementById("updateLeadForm_companyName").getText();
		/*System.out.println("Please Update the CompanyName");
		
		Thread.sleep(10000);*/
		objDriver.findElementById("updateLeadForm_companyName").clear();
		objDriver.findElementById("updateLeadForm_companyName").sendKeys("TestLeafedited");
		objDriver.findElementByXPath("//input[@class='smallSubmit'][1]").click();

		String newCompName = objDriver.findElementById("viewLead_companyName_sp").getText();

		if (!(compName.equals(newCompName)))
		{
			System.out.println("Company Name updated Successfully");
		}
		objDriver.close();
	}

}
