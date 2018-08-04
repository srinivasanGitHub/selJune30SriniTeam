package week6.day2.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.Annotations;

public class myLeadPage extends Annotations {
	public myLeadPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Create Lead")
	WebElement eleCreateLeads;
	@And("Click Create Lead")
	public createLeadPage clickCreateLeads()
	{
		
		click(eleCreateLeads);
		return new createLeadPage();
	}
	

}
