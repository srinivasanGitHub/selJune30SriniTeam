package week5.day1;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.Annotations;



public class SeCreateLead extends Annotations{
	
	@Test(dataProvider="fetchData")
	public void secreatelead(String cName,String fName,String lName,String eMail,int phone) {
		 
			
			WebElement elecreatelead = locateElement("linktext", "Create Lead");
			//WebElement elecreatelead = locateElement("linkText", "Create Lead1");
			click(elecreatelead);
			WebElement elecompna = locateElement("createLeadForm_companyName");
			type(elecompna, cName);
			WebElement elefoname = locateElement("createLeadForm_firstName");
			type(elefoname, fName);
			WebElement elesurnam = locateElement("createLeadForm_lastName");
			type(elesurnam, lName);
			/*WebElement source = locateElement("createLeadForm_dataSourceId");
			selectDropDownUsingIndex(source, 2);
			WebElement elefonamelocal = locateElement("createLeadForm_firstNameLocal");
			type(elefonamelocal, "Ash");
			WebElement elesurnamlocal = locateElement("createLeadForm_lastNameLocal");
			type(elesurnamlocal, "Srini");
			WebElement salutation = locateElement("createLeadForm_personalTitle");
			type(salutation, "Work");
			WebElement title = locateElement("createLeadForm_generalProfTitle");
			type(title, "Homework");
			WebElement revenue = locateElement("createLeadForm_annualRevenue");
			type(revenue, "1000000");
			WebElement industry = locateElement("createLeadForm_industryEnumId");
			selectDropDownUsingIndex(industry, 5 );
			WebElement ownership = locateElement("createLeadForm_ownershipEnumId");
			selectDropDownUsingIndex(ownership, 3 );
			WebElement siccode = locateElement("createLeadForm_sicCode");
			type(siccode, "SIC568");
			WebElement description = locateElement("createLeadForm_description");
			type(description, "create lead");
			WebElement impnote = locateElement("createLeadForm_importantNote");
			type(impnote, "note2");
			WebElement countrycode = locateElement("createLeadForm_primaryPhoneCountryCode");
			type(countrycode, "91");
			WebElement areacode = locateElement("createLeadForm_primaryPhoneAreaCode");
			type(areacode, "Sri");
			WebElement extension = locateElement("createLeadForm_primaryPhoneExtension");
			type(extension, "work");
			WebElement department = locateElement("createLeadForm_departmentName");
			type(department, "TCS");
			WebElement currency = locateElement("createLeadForm_currencyUomId");
			selectDropDownUsingText(currency,"INR - Indian Rupee");
			WebElement noofemp = locateElement("createLeadForm_numberEmployees");
			type(noofemp, "15");
			WebElement tickersymbol = locateElement("createLeadForm_tickerSymbol");
			type(tickersymbol, "Accenture");
			WebElement askfor = locateElement("createLeadForm_primaryPhoneAskForName");
			type(askfor, "Jishan");
			WebElement weburl = locateElement("createLeadForm_primaryWebUrl");
			type(weburl, "www.bta.com");
			WebElement toname = locateElement("createLeadForm_generalToName");
			type(toname, "Ash");
			WebElement address1 = locateElement("createLeadForm_generalAddress1");
			type(address1, "Address1");
			WebElement address2 = locateElement("createLeadForm_generalAddress2");
			type(address2, "Address2");
			WebElement city = locateElement("createLeadForm_generalCity");
			type(city, "Chennai");
			WebElement country = locateElement("createLeadForm_generalCountryGeoId");
			selectDropDownUsingText(country,"India");
			WebElement state = locateElement("createLeadForm_generalStateProvinceGeoId");
			selectDropDownUsingText(state,"TAMILNADU");
			WebElement postalcode = locateElement("createLeadForm_generalPostalCode");
			type(postalcode, "600041");
			WebElement postalcodeextn = locateElement("createLeadForm_generalPostalCodeExt");
			type(postalcodeextn, "586");
			WebElement markcamp = locateElement("createLeadForm_marketingCampaignId");
			selectDropDownUsingIndex(markcamp, 5);*/
			WebElement priemail = locateElement("createLeadForm_primaryEmail");
			type(priemail, eMail);
			WebElement priphonemo = locateElement("createLeadForm_primaryPhoneNumber");
			type(priphonemo, ""+phone);
			WebElement clickcrelead = locateElement("class","smallSubmit");
			click(clickcrelead);
			/*WebElement verifyt = locateElement("viewLead_firstName_sp");
			verifyExactText(verifyt, "Anitha");*/
			
				
			
	 }
	@DataProvider(name="fetchData",indices= {1})
	public Object[][] getData()
	{
		Object[][] data =new Object[2][5];
		
		data[0][0]="TL";
		data[0][1]="srini";
		data[0][2]="vasan";
		data[0][3]="srini@gmail.com";
		data[0][4]=5874555;
		
		data[1][0]="csc";
		data[1][1]="anbu";
		data[1][2]="selvam";
		data[1][3]="anbu@gmail.com";
		data[1][4]=3258744;
		
		return data;
	}
	

}