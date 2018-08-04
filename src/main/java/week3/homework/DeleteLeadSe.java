package week3.homework;


import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;



public class DeleteLeadSe extends SeMethods {
	@Test
	public void DeleteLead() throws InterruptedException
	{
		startApp("Chrome","http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		WebElement eleCrmsfa = locateElement("linktext","CRM/SFA");
		click(eleCrmsfa);
		
		WebElement eleLeads= locateElement("linktext","Leads");
		click(eleLeads);
		
		WebElement eleFindLeads = locateElement("linktext","Find Leads");
		click(eleFindLeads);
		
		WebElement elePhone = locateElement("xpath","//span[text()='Phone']");
		click(elePhone);
		WebElement elephoneNumber = locateElement("xpath","//input[@name='phoneNumber']");
		type(elephoneNumber, "9998887770");
		WebElement eleFindLeads1 = locateElement("xpath","//button[text()='Find Leads']");
		click(eleFindLeads1);
		Thread.sleep(10000);
		
		WebElement eleLeadId = locateElement("xpath","(//a[@class='linktext'])[4]");
		String LeadId = getText(eleLeadId);
		click(eleLeadId);
	
		WebElement eleDelete = locateElement("xpath","//a[text()='Delete']");
		click(eleDelete);
		
		WebElement eleFindLeadsRe = locateElement("linktext","Find Leads");
		click(eleFindLeadsRe);
		
		WebElement eleFindLeadId = locateElement("xpath","//input[@name='id']");
		type(eleFindLeadId, LeadId);;
		
		WebElement eleFindBtn = locateElement("xpath","//button[text()='Find Leads']");
		click(eleFindBtn);
		Thread.sleep(5000);
		
		
		WebElement eleRecordsDisp = locateElement("xpath","//div[text()='No records to display']");
		verifyDisplayed(eleRecordsDisp);
		
		closeBrowser();
		
	}

}
