package week6.day2.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import wdMethods.Annotations;

public class myHomePage extends Annotations {
	public myHomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Leads")
	WebElement eleLeads;
	
	@Given("Click Leads")
	public myLeadPage clickLead()
	{
		click(eleLeads);
		return new myLeadPage();
	}
	

}
