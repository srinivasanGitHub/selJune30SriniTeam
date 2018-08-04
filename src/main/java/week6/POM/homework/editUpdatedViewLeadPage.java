package week6.POM.homework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;

public class editUpdatedViewLeadPage extends Annotations {
	
	public editUpdatedViewLeadPage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="viewLead_companyName_sp")
	WebElement eleViewCompName;
	
	public editUpdatedViewLeadPage verifyUpdatedCname(String cName)
	{
		verifyExactText(eleViewCompName, cName);
		return this;
	}
}
