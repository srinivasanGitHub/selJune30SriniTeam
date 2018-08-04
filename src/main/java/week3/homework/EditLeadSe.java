package week3.homework;


import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;



public class EditLeadSe extends SeMethods {
	@Test
	public void EditLead() throws InterruptedException
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
		
		WebElement elefName = locateElement("xpath","(//input[@name=\"firstName\"])[3]");
		type(elefName, "Srini");

		WebElement elefndLeadBtn = locateElement("xpath","//button[text()='Find Leads']");
		click(elefndLeadBtn);
		Thread.sleep(5000);
		
		WebElement eleLinkName = locateElement("xpath","(//a[@class='linktext'])[4]");
		click(eleLinkName);
		WebElement eletitle = locateElement("id","sectionHeaderTitle_leads");
		String editTitle= getText(eletitle);
		
		verifyTitle(editTitle);
		
		WebElement eleEditBtn = locateElement("xpath","//a[text()='Edit']");
		click(eleEditBtn);
		
		WebElement elecompName = locateElement("id","updateLeadForm_companyName");
		String compName= getText(elecompName);
		
		elecompName.clear();
		type(elecompName, "TestLeafedited");
		
		WebElement elesmallSubmit = locateElement("xpath","//input[@class='smallSubmit'][1]");
		click(elesmallSubmit);
		
		WebElement eleViewCompName = locateElement("id","viewLead_companyName_sp");
		verifyExactText(eleViewCompName, compName);
		
		closeBrowser();
	}
}
