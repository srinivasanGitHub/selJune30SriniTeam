package week6.day2.TestCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import wdMethods.Annotations;
import week6.POM.homework.editMyLeadTabPage;

public class TC002_EditLead extends Annotations{
	
	@BeforeTest
	public void SetValues() 
	{
		excelFileName="EditLeadTC";
		testName="Edit Lead";
		testDesc=" edit existing lead";
		category="smoke";
		author="Srini";
		moduleName="Leads";
	}
	
	@Test(dataProvider = "fetchData")
	public void EditLead(String fName,String cName) throws InterruptedException
	{
		new editMyLeadTabPage()
		.clickLead()
		.clikFindLead()
		.typeFname(fName)
		.clickBtnFind()
		.clickFirstResult()
		.verifyEditPageTitle()
		.clickEditBtn()
		.typeCname(cName)
		.clickUpdate()
		.verifyUpdatedCname(cName);
		
	}
	

}
