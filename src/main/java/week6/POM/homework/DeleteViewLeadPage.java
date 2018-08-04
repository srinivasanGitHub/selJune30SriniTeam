package week6.POM.homework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;

public class DeleteViewLeadPage extends Annotations {
	
	public DeleteViewLeadPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[text()='Delete']")
	WebElement eleBtnDelete;
	
	
	public eidtFindLeadPage delete_clickdeleteBtn()
	{
		click(eleBtnDelete);
		return new eidtFindLeadPage();
	}
}
