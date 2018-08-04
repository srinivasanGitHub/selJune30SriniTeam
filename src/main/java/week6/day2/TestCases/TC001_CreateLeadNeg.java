package week6.day2.TestCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import wdMethods.Annotations;
import week6.day2.pages.myHomePage;

public class TC001_CreateLeadNeg extends Annotations {
	@BeforeTest
	public void SetValues() 
	{
		excelFileName="CreateLeadNeg";
		testName="Create Lead";
		testDesc="Lead Creation";
		category="smoke";
		author="Srini";
		moduleName="Leads";
	}
	
	@Test(dataProvider = "fetchData")
	public void CreateLead(String cName, String fName, String lName,String errMessage) throws InterruptedException
	{
		new myHomePage()
		.clickLead()
		.clickCreateLeads()
		.typecName(cName)
		.typefName(fName)
		.typelName(lName)
		.clickSubmitForFailure()
		.verifyErrorMessage(errMessage);
		
	}

}
