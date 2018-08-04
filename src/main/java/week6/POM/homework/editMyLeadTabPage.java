package week6.POM.homework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import wdMethods.Annotations;


public class editMyLeadTabPage extends Annotations{
	public editMyLeadTabPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Leads")
	WebElement eleLeads;
	
	
	public eidtFindLeadPage clickLead()
	{
		click(eleLeads);
		return new eidtFindLeadPage();
	}
	

}

