package week5.day1;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.Annotations;

public class EditLeadSe extends Annotations {
	@Test(groups= {"sanity"},dependsOnMethods="CreateLead",dataProvider="fetchEditLeadData")
	public void EditLead(String fName,String compName) throws InterruptedException
	{
		
		
		WebElement eleLeads = locateElement("linktext","Leads");
		click(eleLeads);

		WebElement eleFindLeads = locateElement("linktext","Find Leads");
		click(eleFindLeads);
		
		WebElement elefName = locateElement("xpath","(//input[@name=\"firstName\"])[3]");
		type(elefName, fName);

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
		String companyName= getText(elecompName);
		
		elecompName.clear();
		type(elecompName, compName);
		
		WebElement elesmallSubmit = locateElement("xpath","//input[@class='smallSubmit'][1]");
		click(elesmallSubmit);
		
		WebElement eleViewCompName = locateElement("id","viewLead_companyName_sp");
		verifyExactText(eleViewCompName, companyName);
		
		
	}
	public Object[][] getEditData()
	{
		Object[][] data = new Object[1][2];
		
		data[0][0] = "srini";
		data[0][1]="TestLeafedited";
		return data;
	}
	}
