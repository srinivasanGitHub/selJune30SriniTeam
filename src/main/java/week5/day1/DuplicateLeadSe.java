package week5.day1;


import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.Annotations;


public class DuplicateLeadSe extends Annotations {
	@Test(groups= {"Regression"},enabled=false,dataProvider="fetchDuplicateData")
	public void DuplicateLead(String eMail) throws InterruptedException
	{
		

		WebElement eleLeads = locateElement("linktext","Leads");
		click(eleLeads);

		WebElement eleFindLeads = locateElement("linktext","Find Leads");
		click(eleFindLeads);

		WebElement eleEmail = locateElement("xpath","//span[text()='Email']");
		click(eleEmail);

		WebElement eleemailAddress = locateElement("xpath","//input[@name='emailAddress']");
		type(eleemailAddress, eMail);


		WebElement eleFindLeads1 = locateElement("xpath","//button[text()='Find Leads']");
		click(eleFindLeads1);
		Thread.sleep(10000);

		WebElement eleLeadname = locateElement("xpath","(//a[@class='linktext'])[6]");
		String  leadFname = getText(eleLeadname);
		click(eleLeadname);

		WebElement eleDupLead = locateElement("xpath","//a[text()='Duplicate Lead']");
		click(eleDupLead);

		WebElement eleTitleText = locateElement("id","sectionHeaderTitle_leads");
		String duplicatetitle =getText(eleTitleText);
		System.out.println(duplicatetitle);
		verifyTitle(duplicatetitle);

		WebElement elesubmitBtn = locateElement("xpath","//input[@name='submitButton']");
		click(elesubmitBtn);

		

		WebElement eleViewFname = locateElement("id","viewLead_firstName_sp");
		click(eleViewFname);
		
		verifyExactText(eleViewFname, leadFname);

		

	}
	@DataProvider(name = "fetchDuplicateData")
	public Object[][] getDuplicateData()
	{
		Object[][] data = new Object[1][1];	
		
		data[0][0] ="test@testmail.com";
		
		
		
		return data;
	}


}
