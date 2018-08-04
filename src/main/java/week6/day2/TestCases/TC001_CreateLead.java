package week6.day2.TestCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import wdMethods.Annotations;
import week6.day2.pages.myHomePage;

public class TC001_CreateLead extends Annotations {
	@BeforeTest
	public void SetValues() 
	{
		excelFileName="CreateLeadTC01";
		testName="Create Lead";
		testDesc="Lead Creation";
		category="smoke";
		author="Srini";
		moduleName="Leads";
	}
	
	@Test(dataProvider = "fetchData")
	public void CreateLead(String cName, String fName, String lName,String phoneNum) throws InterruptedException
	{
		new myHomePage()
		.clickLead()
		.clickCreateLeads()
		.typecName(cName)
		.typefName(fName)
		.typelName(lName)
		.typelPhoneNum(phoneNum)
		.clickSubmit()
		.verifyFirstName(fName);
	}

}
