package week6.POM.homework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;
public class DeleteFindLeadsPage extends Annotations {
	public String LeadId;
	public DeleteFindLeadsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//span[text()='Phone']")
	WebElement elePhoneTab;
	
	@FindBy(xpath ="//input[@name='phoneNumber']")
	WebElement elePhoneNum;
	
	@FindBy(xpath ="//input[@name='id']")
	WebElement eleLeadId;
	
	@FindBy(xpath="(//a[@class='linktext'])[4]")
	WebElement eleLinkName;
	
	@FindBy(xpath ="//button[text()='Find Leads']")
	WebElement eleBtnFindLead;
	
	@FindBy(xpath ="//div[text()='No records to display']")
	WebElement eleNoRecordMsg;
	
	public DeleteFindLeadsPage delete_typePhoneNum(String phoneNum)
	{
		type(elePhoneNum,phoneNum);
		return this;
	}
	public DeleteFindLeadsPage delete_clickPhoneTab()
	{
		click(elePhoneTab);
		return this;
	}
	
	public DeleteFindLeadsPage  delete_clickBtnFind() throws InterruptedException
	{
		click(eleBtnFindLead);
		Thread.sleep(3000);
		return this;
	}
	
	public DeleteFindLeadsPage delete_typeLeadId()
	{
		System.out.println(LeadId);
		type(eleLeadId,LeadId);
		return this;
	}
	public DeleteViewLeadPage  delete_clickFirstResult()
	{
		 LeadId = getText(eleLinkName);
		click(eleLinkName);
		return new DeleteViewLeadPage();
	}
	
	public DeleteFindLeadsPage delete_verifyErrorMsg()
	{
		verifyDisplayed(eleNoRecordMsg);
		return this;
	}

}
