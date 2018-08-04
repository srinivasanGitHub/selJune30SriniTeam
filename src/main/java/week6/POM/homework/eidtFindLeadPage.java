package week6.POM.homework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;

public class eidtFindLeadPage extends Annotations {
	
	public eidtFindLeadPage()
	{
		PageFactory.initElements(driver, this);
	}
	 @FindBy(linkText="Find Leads")
	 WebElement eleFindLeads;
	 
	 public editFindLeadsPage clikFindLead()
	 {
		 click(eleFindLeads);
		
		 return new editFindLeadsPage();
	 }
	 
	 public DeleteFindLeadsPage delete_clikFindLead()
	 {
		 click(eleFindLeads);
		
		 return new DeleteFindLeadsPage();
	 }
}
