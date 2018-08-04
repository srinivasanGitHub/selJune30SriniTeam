package week6.day2.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.Annotations;

public class createLeadPage extends Annotations {
	public createLeadPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="createLeadForm_companyName")
	WebElement elecName;

	@FindBy(id="createLeadForm_firstName")
	WebElement elefName;

	@FindBy(className="errorList")
	WebElement eleErrorMessage;

	@FindBy(id="createLeadForm_lastName")
	WebElement elelName;
	
	@FindBy(id="createLeadForm_primaryPhoneNumber")
	WebElement elelPhoneNum;

	@FindBy(xpath="//input[@name='submitButton']")
	WebElement eleSubmit;

	public createLeadPage typecName(String cName)
	{
		type(elecName,cName);
		return this;
	}
	public createLeadPage typefName(String fName)
	{
		type(elefName,fName);
		return this;
	}
	public createLeadPage typelName(String lName)
	{
		type(elelName,lName);
		return this;
	}
	public createLeadPage typelPhoneNum(String phoneNum)
	{
		type(elelPhoneNum,phoneNum);
		return this;
	}
	public createLeadPage clickSubmitForFailure()
	{
		click(eleSubmit);
		return this;
	}
	//@And("Type Mandatory fields as (.*)")
	public createLeadPage typeMandatory(String cName/*,String fName,String lName*/)
	{
		type(elecName,cName);
		type(elefName,"fName");
		type(elelName,"lName");
		return this;
	}
	//@When("clicking on create lead")
	public viewLeadPage clickSubmit()
	{
		click(eleSubmit);
		return new viewLeadPage();
	}
	public createLeadPage verifyErrorMessage(String errMessage)
	{
		verifyPartialText(eleErrorMessage, errMessage);
		return this;
	}


}
