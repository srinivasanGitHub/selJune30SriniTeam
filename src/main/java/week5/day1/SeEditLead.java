package week5.day1;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;



public class SeEditLead extends SeMethods {
	@Test
	//@Test(groups= {"sanity"})
	//@Test(dependsOnMethods= {"week3day2.SeCreateLead.secreatelead"})
	public void seeditlead() throws InterruptedException {
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		Thread.sleep(5000);
		WebElement elecrm = locateElement("linktext", "CRM/SFA");
		click(elecrm);
		WebElement elecreatelead = locateElement("linktext", "Create Lead");
		click(elecreatelead);
		WebElement findleads = locateElement("linktext", "Find Leads");
		click(findleads);
		WebElement firstname = locateElement("xpath","(//input[@name='firstName'])[3]");
		type(firstname, "Anitha");
		WebElement clickfind = locateElement("xpath","//button[text()[contains(.,'Find Leads')]]");
		click(clickfind);
		Thread.sleep(3000);
		WebElement firstresult = locateElement("xpath","(//a[@class='linktext'])[4]");
		click(firstresult);
		Thread.sleep(3000);
		verifyTitle("View Lead | opentaps CRM");
		WebElement clickedit = locateElement("linktext","Edit");
		click(clickedit);
		WebElement elecompna = locateElement("updateLeadForm_companyName");
		elecompna.clear();
		type(elecompna, "TCS");
		WebElement update = locateElement("xpath","//tr[12]/td[2]/input[@class='smallSubmit']");
		click(update);
		
		//Confirm the changed name appears- Failing
		WebElement verifyname = locateElement("viewLead_companyName_sp");
		verifyExactText(verifyname, "TCS");
	    //closeBrowser();
	}

}