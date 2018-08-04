package week5.day1;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.Annotations;


public class CreateContactSe extends Annotations {
	@Test
	public void CreateContact() throws InterruptedException
	{
		//login();
		
		WebElement elecreatelead = locateElement("linktext", "Create Contact");
		click(elecreatelead);
		
		WebElement elefoname = locateElement("firstNameField");
		type(elefoname, "Srini");
		WebElement elesurnam = locateElement("lastNameField");
		type(elesurnam, "vasan");
		
		WebElement elelocfname = locateElement("createContactForm_firstNameLocal");
		type(elelocfname, "seenu");
		WebElement eleloclastname = locateElement("createContactForm_lastNameLocal");
		type(eleloclastname, "vas");
		
		WebElement eletitle = locateElement("createContactForm_personalTitle");
		type(eletitle, "Personal title");
		
		WebElement eleproftitle = locateElement("createContactForm_generalProfTitle");
		type(eleproftitle, "Contact Title");
		
		WebElement eledept = locateElement("createContactForm_departmentName");
		type(eledept, "HR");
		
				
		WebElement source = locateElement("createContactForm_preferredCurrencyUomId");
		selectDropDownUsingText(source, "INR - Indian Rupee");
		
		WebElement eledesc = locateElement("createContactForm_description");
		type(eledesc, "My contact Description");
		
		WebElement eleNote = locateElement("createContactForm_importantNote");
		type(eleNote, "Contact Note");
		
		WebElement eleccode = locateElement("createContactForm_primaryPhoneCountryCode");
		type(eleccode, "91");
		
		
		WebElement eleAreaCodet = locateElement("createContactForm_primaryPhoneAreaCode");
		type(eleAreaCodet, "044");
		
		WebElement elephoneExt = locateElement("createContactForm_primaryPhoneExtension");
		type(elephoneExt, "099");
		
		
		WebElement eleToname = locateElement("generalToNameField");
		String Toname = getAttribute(eleToname);
		
		
		WebElement eleAddr1 = locateElement("createContactForm_generalAddress1");
		type(eleAddr1, "44,north car street");
		WebElement eleAddr2 = locateElement("createContactForm_generalAddress2");
		type(eleAddr2, "mylapore");
		
		WebElement eleCity = locateElement("createContactForm_generalCity");
		type(eleCity, "Chennai");
		WebElement eleemail = locateElement("createContactForm_primaryEmail");
		type(eleemail, "test@testmail.com");
		WebElement elephoneNum = locateElement("createContactForm_primaryPhoneNumber");
		type(elephoneNum, "2314111");
		WebElement eleAskfor = locateElement("createContactForm_primaryPhoneAskForName");
		type(eleAskfor, "HR");
		
		WebElement eleattName = locateElement("createContactForm_generalAttnName");
		type(eleattName, "MyContact");
		
		
		WebElement Countrysource = locateElement("createContactForm_generalCountryGeoId");
		selectDropDownUsingText(Countrysource, "India");
		Thread.sleep(3000);
		
		WebElement CountryState = locateElement("createContactForm_generalStateProvinceGeoId");
		selectDropDownUsingText(CountryState, "TAMILNADU");
		
		
		
		WebElement elePostal = locateElement("createContactForm_generalPostalCode");
		type(elePostal, "600012");
		WebElement elePOCode = locateElement("createContactForm_generalPostalCodeExt");
		type(elePOCode, "00");
		
		WebElement eleCreateContact = locateElement("class","smallSubmit");
		click(eleCreateContact);
		
		WebElement elefirstname = locateElement("viewContact_firstName_sp");
		System.out.println(elefirstname.getText());	
		System.out.println(Toname);
		verifyPartialText(elefirstname, Toname);
		
		WebElement eleEdit = locateElement("xpath","//a[text()='Edit']");
		click(eleEdit);
		
		

		WebElement marketing = locateElement("addMarketingCampaignForm_marketingCampaignId");
		selectDropDownUsingText(marketing, "Car and Driver");
		String marketName = getTextFromDropDown(marketing);
		
		WebElement eleAdd = locateElement("xpath","//input[@value ='Add']");
		click(eleAdd);
		
		WebElement eleUpdate = locateElement("xpath","//input[@value ='Update']");
		click(eleUpdate);
		
		WebElement viewMarketing = locateElement("viewContact_marketingCampaigns_sp");
		
		verifyExactText(viewMarketing, marketName);
		
		//closeBrowser();
		
		
	}

}
