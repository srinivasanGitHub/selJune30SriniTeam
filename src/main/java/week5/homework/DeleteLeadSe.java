package week5.homework;


import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.Annotations;


public class DeleteLeadSe extends Annotations {
	@Test(groups= {"sanity"},dependsOnMethods="CreateLead",dataProvider="fetchDeleteData")
	public void DeleteLead(String phoneNum) throws InterruptedException
	{
		
		WebElement eleLeads= locateElement("linktext","Leads");
		click(eleLeads);
		
		WebElement eleFindLeads = locateElement("linktext","Find Leads");
		click(eleFindLeads);
		
		WebElement elePhone = locateElement("xpath","//span[text()='Phone']");
		click(elePhone);
		WebElement elephoneNumber = locateElement("xpath","//input[@name='phoneNumber']");
		type(elephoneNumber, phoneNum);
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
		
		
		
	}
	@DataProvider(name = "fetchDeleteData")
	public Object[][] getDeleteData()
	{
		Object[][] data = new Object[1][1];	
		
		data[0][0] ="9998887770";
		
		
		
		return data;
	}

}
