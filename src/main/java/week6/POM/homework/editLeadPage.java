package week6.POM.homework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;

public class editLeadPage extends Annotations {
	
	public editLeadPage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="updateLeadForm_companyName")
	WebElement eleCname;
	
	@FindBy(xpath="//input[@class='smallSubmit'][1]")
	WebElement eleUpdateBtn;
	
	public editLeadPage typeCname(String cName)
	{
		eleCname.clear();
		type(eleCname, cName);
		return this;
	}
	
	public editUpdatedViewLeadPage clickUpdate()
	{
		click(eleUpdateBtn);
		return new editUpdatedViewLeadPage();
	}
}
