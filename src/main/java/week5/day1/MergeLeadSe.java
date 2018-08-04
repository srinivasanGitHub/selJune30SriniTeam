package week5.day1;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.Annotations;


public class MergeLeadSe  extends Annotations {
	@Test(groups= {"Regression"},timeOut=20000)
	public void mergeLead() throws InterruptedException
	{
		
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
