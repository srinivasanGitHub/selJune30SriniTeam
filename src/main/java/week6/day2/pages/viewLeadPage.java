package week6.day2.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import wdMethods.Annotations;

public class viewLeadPage extends Annotations {
	public viewLeadPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="viewLead_firstName_sp")
	WebElement elefName;
	
	//@Then("New lead created")
	public void verifyFirstName(String fName )
	{
		
		verifyPartialText(elefName, "fName");
		
	}
	

}
