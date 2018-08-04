package week6.POM.homework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;

public class editFindLeadsPage extends Annotations {
	
	public editFindLeadsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="(//input[@name=\"firstName\"])[3]")
	WebElement elefName;
	
	@FindBy(xpath="(//a[@class='linktext'])[4]")
	WebElement eleLinkName;
	
	@FindBy(xpath ="//button[text()='Find Leads']")
	WebElement eleBtnFindLead;
	
	public editFindLeadsPage typeFname(String fName)
	{
		type(elefName,fName);
		return this;
	}
	public editFindLeadsPage  clickBtnFind()
	{
		click(eleBtnFindLead);
		return this;
	}
	public editViewLeadPage  clickFirstResult()
	{
		click(eleLinkName);
		return new editViewLeadPage();
	}
	

}
