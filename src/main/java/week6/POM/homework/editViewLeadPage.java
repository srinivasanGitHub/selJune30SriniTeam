package week6.POM.homework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;

public class editViewLeadPage extends Annotations {
	
	public editViewLeadPage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//title[text()='View Lead | opentaps CRM']")
	WebElement eleTitleId;
	
	@FindBy(xpath="//a[text()='Edit']")
	WebElement eleBtnEdit;
	
	public editViewLeadPage verifyEditPageTitle()
	{
		verifyTitle(getText(eleTitleId));
		return this;
	}
	public editLeadPage clickEditBtn()
	{
		click(eleBtnEdit);
		return new editLeadPage();
	}

}
