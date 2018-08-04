package week5.day1;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.Annotations;
import wdMethods.SeMethods;

public class DeleteLeadSeMethod extends SeMethods{


	
		@Test
		public void deleteLead() throws InterruptedException{
		
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		WebElement elecrm = locateElement("linktext", "CRM/SFA");
		click(elecrm);
		locateElement("linktext", "Create Lead").click();
		locateElement("linktext", "Find Leads").click();
		locateElement("linktext", "Phone").click();
		locateElement("xpath", "//input[@name='phoneNumber']").sendKeys("9856566651");
		locateElement("xpath", "//button[text()[contains(.,'Find Leads')]]").click();
	    Thread.sleep(5000);
	    locateElement("xpath", "(//a[@class='linktext'])[4]").click();
	    Thread.sleep(5000);
	    locateElement("xpath", "(//a[@class='subMenuButtonDangerous'])").click();
	    locateElement("linktext", "Find Leads").click();
	    locateElement("xpath", "//input[@name='id']").sendKeys("10281");
	    locateElement("xpath", "//button[text()[contains(.,'Find Leads')]]").click();
	    Thread.sleep(5000);
	    if(locateElement("xpath", "//div[text()='No records to display']").isDisplayed())
	    {
	   	 System.out.println("Deleted Successfully");
	    }
	    closeBrowser();
		
		}

	}

