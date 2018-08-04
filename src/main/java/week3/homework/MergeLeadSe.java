package week3.homework;


import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;



public class MergeLeadSe  extends SeMethods
{
	@Test
	public void mergeLead() throws InterruptedException
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
		WebElement eleLeads = locateElement("linktext","Leads");
		click(eleLeads);
		WebElement eleMergeLeads = locateElement("linktext","Merge Leads");
		click(eleMergeLeads);
		WebElement eleFromLookup = locateElement("xpath","(//img[@alt='Lookup'])[1]");
		click(eleFromLookup);
		switchToWindow(1);
		WebElement eleLeadFromId = locateElement("xpath","//input[@name='id']");
		type(eleLeadFromId,"11936");
		
		WebElement eleFindLeadbtn = locateElement("xpath","//button[text()='Find Leads']");
		click(eleFindLeadbtn);
		Thread.sleep(5000);
		
		WebElement eleFirstLead = locateElement("xpath","(//a[@class='linktext'])[1]");
		clickWithNoSnap(eleFirstLead);
		switchToWindow(0);
		
		WebElement eleToLookup = locateElement("xpath","(//img[@alt='Lookup'])[2]");
		click(eleToLookup);
		switchToWindow(1);
		
		WebElement eleLeadToId = locateElement("xpath","//input[@name='id']");
		type(eleLeadToId,"11937");
		
		WebElement eleFindLead = locateElement("xpath","//button[text()='Find Leads']");
		click(eleFindLead);
		Thread.sleep(5000);
		
		WebElement eleFirstLead2 = locateElement("xpath","(//a[@class='linktext'])[1]");
		clickWithNoSnap(eleFirstLead2);
		switchToWindow(0);
				
		
		WebElement elemergebutton = locateElement("class","buttonDangerous");
		clickWithNoSnap(elemergebutton);
		
		acceptAlert();
		
		WebElement eleFindLeads = locateElement("linktext","Find Leads");
		click(eleFindLeads);
		
		
		WebElement eleFindLeadID = locateElement("xpath","//input[@name='id']");
		type(eleFindLeadID, "11936");
		
		WebElement eleFindLeadbtn1 = locateElement("xpath","//button[text()='Find Leads']");
		click(eleFindLeadbtn1);
		
		WebElement eleRecordsDisp = locateElement("xpath","//div[text()='No records to display']");
		verifyDisplayed(eleRecordsDisp);
	}
	

}
