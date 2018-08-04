package week6.day2.TestCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import wdMethods.Annotations;
import week6.POM.homework.editMyLeadTabPage;

public class TC003_DeleteLead extends Annotations {
	@BeforeTest
	public void SetValues() 
	{
		excelFileName="DeleteLeadTC";
		testName="Delete Lead";
		testDesc="Delete existing Lead";
		category="smoke";
		author="Srini";
		moduleName="Leads";
	}

	@Test(dataProvider = "fetchData")
	public void DeleteLead(String phoneNum) throws InterruptedException
	{
		new editMyLeadTabPage()
		.clickLead()
		.delete_clikFindLead()
		.delete_clickPhoneTab()
		.delete_typePhoneNum(phoneNum)
		.delete_clickBtnFind()
		.delete_clickFirstResult()
		.delete_clickdeleteBtn()
		.delete_clikFindLead()
		.delete_typeLeadId()
		.delete_clickBtnFind()
		.delete_verifyErrorMsg();
		
	}
}

