package week6.day1;



import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import wdMethods.Annotations;

public class CreateLeadSe extends Annotations {
	
	@BeforeTest
	public void SetValues() 
	{
		excelFileName="CreateLeadTC";
		testName="Create Lead";
		testDesc="Lead Creation";
		category="smoke";
		author="Srini";
		moduleName="Leads";
	}
	
	@Test(/*groups= {"smoke"},*//*invocationCount=2,*/dataProvider = "fetchData")
	public void CreateLead(String cName, String fName, String lName, String email, String ph) throws InterruptedException
	{
		
		
		
		WebElement eleCreateLead = locateElement("linktext","Create Lead");
		click(eleCreateLead);
		
		WebElement eleCompName = locateElement("id", "createLeadForm_companyName");
		type(eleCompName,cName);
		
		WebElement eleFirstName = locateElement("id", "createLeadForm_firstName");
		type(eleFirstName,fName);
		
		//String firstName =getAttribute(eleFirstName);
		
		
		WebElement eleLastName = locateElement("id", "createLeadForm_lastName");
		type(eleLastName,lName);
		
		/*
		WebElement   eleFirstNameLoc = locateElement("id","createLeadForm_firstNameLocal");
		type(eleFirstNameLoc,"sri");*/
		
		
		/*
		WebElement   eleSalutation = locateElement("id","createLeadForm_personalTitle");
		type(eleSalutation,"SriniLead");*/
			
		
		/*WebElement eleSourceDD = locateElement("id","createLeadForm_dataSourceId");
		selectDropDownUsingText(eleSourceDD,"Self Generated");
		

		WebElement   eleTitle = locateElement("id","createLeadForm_generalProfTitle");
		type(eleTitle,"LeadfromSrini");
		
		WebElement   eleAnnulRevenue = locateElement("id","createLeadForm_annualRevenue");
		type(eleAnnulRevenue,"1500000");
		
		WebElement   eleChooseIndustry = locateElement("id","createLeadForm_industryEnumId");
		selectDropDownUsingText(eleChooseIndustry,"Computer Software");
		
		
		WebElement   eleChooseOwnership = locateElement("id","createLeadForm_ownershipEnumId");
		selectDropDownUsingText(eleChooseOwnership,"Sole Proprietorship");
		
		
		WebElement   eleSICCode = locateElement("id","createLeadForm_sicCode");
		type(eleSICCode,"1243563");
		
		WebElement   eleDescription = locateElement("id","createLeadForm_description");
		type(eleDescription,"This sole proprietorship company");
		
		WebElement   eleImpNote = locateElement("id","createLeadForm_importantNote");
		type(eleImpNote,"This is self generated Lead");
		
		WebElement   eleCountryCode = locateElement("id","createLeadForm_primaryPhoneCountryCode");
		eleCountryCode.clear();
		type(eleCountryCode,"+91");
		
		WebElement   eleAreaCode = locateElement("id","createLeadForm_primaryPhoneAreaCode");
		type(eleAreaCode,"044");
		
		WebElement   eleExtCode = locateElement("id","createLeadForm_primaryPhoneExtension");
		type(eleExtCode,"099");
		
		WebElement   eleDept = locateElement("id","createLeadForm_departmentName");
		type(eleDept,"IT");
		
		WebElement elePreCurrency = locateElement("id","createLeadForm_currencyUomId");
		selectDropDownUsingText(elePreCurrency,"INR - Indian Rupee");
		
		WebElement   eleNoOfEmployees = locateElement("id","createLeadForm_numberEmployees");
		type(eleNoOfEmployees,"200");
		
		WebElement   eleTickerSymbol = locateElement("id","createLeadForm_tickerSymbol");
		type(eleTickerSymbol,"54");
		
		WebElement   elePrimaryPhone = locateElement("id","createLeadForm_primaryPhoneAskForName");
		type(elePrimaryPhone,"2314111");
			
		WebElement   eleWebUrl = locateElement("id","createLeadForm_primaryWebUrl");
		type(eleWebUrl,"www.test.com");
		

		WebElement eleMarketingCamp = locateElement("id","createLeadForm_marketingCampaignId");
		selectDropDownUsingText(eleMarketingCamp,"Affiliate Sites");*/
		
		WebElement eleEmail = locateElement("id","createLeadForm_primaryEmail");
		type(eleEmail,email); 
		
		WebElement elePhoneNumber = locateElement("id","createLeadForm_primaryPhoneNumber");
		type(elePhoneNumber,ph);
			
		/*WebElement eleCountryDD = locateElement("id", "createLeadForm_generalCountryGeoId");
		selectDropDownUsingText(eleCountryDD, "India");
		Thread.sleep(2000);
		
		WebElement eleStateDD = locateElement("id", "createLeadForm_generalStateProvinceGeoId");
		selectDropDownUsingText(eleStateDD, "TAMILNADU");
		
		WebElement elePostalCode = locateElement("id", "createLeadForm_generalPostalCode");
		type(elePostalCode,"34567890");
		
		WebElement elePostalCodeExt = locateElement("id", "createLeadForm_generalPostalCodeExt");
		type(elePostalCodeExt,"00");
		
		WebElement eleToName = locateElement("id", "createLeadForm_generalToName");
		type(eleToName,"CompanyAdmin");
		WebElement eleAddr1 = locateElement("id", "createLeadForm_generalAddress1");
		type(eleAddr1,"44,north car street");
		WebElement eleAddr2 = locateElement("id", "createLeadForm_generalAddress2");
		type(eleAddr2,"mylapore");
		WebElement eleCity = locateElement("id", "createLeadForm_generalCity");
		type(eleCity,"Chennai");*/
		
		
		
		WebElement eleCreateLeadButton = locateElement("class","smallSubmit");
		click(eleCreateLeadButton);
		
		/*WebElement eleViewFirstName = locateElement("id", "viewLead_firstName_sp");
		verifyExactText(eleViewFirstName, firstName);*/
		
		
		
	}
	

}
