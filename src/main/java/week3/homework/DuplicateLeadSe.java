package week3.homework;


import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;



public class DuplicateLeadSe extends SeMethods {
	@Test
	public void DuplicateLead() throws InterruptedException
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

		WebElement eleFindLeads = locateElement("linktext","Find Leads");
		click(eleFindLeads);

		WebElement eleEmail = locateElement("xpath","//span[text()='Email']");
		click(eleEmail);

		WebElement eleemailAddress = locateElement("xpath","//input[@name='emailAddress']");
		type(eleemailAddress, "test@testmail.com");


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

		closeBrowser();

	}

}
