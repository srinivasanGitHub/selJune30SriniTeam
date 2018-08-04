package week2.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");

		ChromeDriver objDriver =new ChromeDriver();
		objDriver.get("http://leaftaps.com/opentaps/");

		//Login to Leaftaps

		objDriver.findElementById("username").sendKeys("DemoSalesManager");
		WebElement password =objDriver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		objDriver.findElementByClassName("decorativeSubmit").click();
		objDriver.findElementByLinkText("CRM/SFA").click();
		objDriver.findElementByLinkText("Create Lead").click();
		
		objDriver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		objDriver.findElementById("createLeadForm_parentPartyId").sendKeys("");
		objDriver.findElementById("createLeadForm_firstName").sendKeys("Srinivasan");
		String firstName = objDriver.findElementById("createLeadForm_firstName").getAttribute("value");
		objDriver.findElementById("createLeadForm_lastName").sendKeys("vasan k");
		objDriver.findElementById("createLeadForm_firstNameLocal").sendKeys("srini");
		objDriver.findElementById("createLeadForm_lastNameLocal").sendKeys("vas");
		objDriver.findElementById("createLeadForm_personalTitle").sendKeys("SriniLead");
		
		WebElement sourceDD = objDriver.findElementById("createLeadForm_dataSourceId");
		Select objsourceDD =new Select(sourceDD);
		objsourceDD.selectByVisibleText("Self Generated");
		
		
		objDriver.findElementById("createLeadForm_generalProfTitle").sendKeys("LeadfromSrini");
		objDriver.findElementById("createLeadForm_annualRevenue").sendKeys("1500000");
		
		
		WebElement industryDD = objDriver.findElementById("createLeadForm_industryEnumId");
		Select objindustryDD =new Select(industryDD);
		objindustryDD.selectByVisibleText("Computer Software");
		
		WebElement ownerDD = objDriver.findElementById("createLeadForm_ownershipEnumId");
		Select objownerDD =new Select(ownerDD);
		objownerDD.selectByVisibleText("Sole Proprietorship");
		
		objDriver.findElementById("createLeadForm_sicCode").sendKeys("1243563");
		objDriver.findElementById("createLeadForm_description").sendKeys("This sole proprietorship company");
		objDriver.findElementById("createLeadForm_importantNote").sendKeys("This is self generated Lead");
		objDriver.findElementById("createLeadForm_primaryPhoneCountryCode").clear();
		objDriver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("91");
		objDriver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("044");
		objDriver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("099");
		objDriver.findElementById("createLeadForm_departmentName").sendKeys("IT");
		
		WebElement CurrencyDD = objDriver.findElementById("createLeadForm_currencyUomId");
		Select objCurrencyDD =new Select(CurrencyDD);
		objCurrencyDD.selectByVisibleText("INR - Indian Rupee");
		
		objDriver.findElementById("createLeadForm_numberEmployees").sendKeys("200");
		objDriver.findElementById("createLeadForm_tickerSymbol").sendKeys("54");
		objDriver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("HR");
		objDriver.findElementById("createLeadForm_primaryWebUrl").sendKeys("www.test.com");
		objDriver.findElementById("createLeadForm_generalToName").sendKeys("CompanyAdmin");
		objDriver.findElementById("createLeadForm_generalAddress1").sendKeys("44,north car street");
		objDriver.findElementById("createLeadForm_generalAddress2").sendKeys("mylapore");
		objDriver.findElementById("createLeadForm_generalCity").sendKeys("Chennai");
		
		WebElement CountryDD = objDriver.findElementById("createLeadForm_generalCountryGeoId");
		Select objCountryDD =new Select(CountryDD);
		objCountryDD.selectByVisibleText("India");
		Thread.sleep(2000);
		
		WebElement StateDD = objDriver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select objStateDD =new Select(StateDD);
		objStateDD.selectByVisibleText("TAMILNADU");
		
		objDriver.findElementById("createLeadForm_generalPostalCode").sendKeys("600012");
		objDriver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("00");
		
		WebElement MarketingCampDD = objDriver.findElementById("createLeadForm_marketingCampaignId");
		Select objMarketingCampDD =new Select(MarketingCampDD);
		objMarketingCampDD.selectByVisibleText("Affiliate Sites");
		
		objDriver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("2314111");
		objDriver.findElementById("createLeadForm_primaryEmail").sendKeys("test@testmail.com");
		objDriver.findElementByClassName("smallSubmit").click();
		
		System.out.println(firstName);
		
		String viewFirstName = objDriver.findElementById("viewLead_firstName_sp").getText();
		System.out.println(viewFirstName);
		if (firstName.equals(viewFirstName))
		{
			System.out.println("FirstName Verified and Lead Created Successfully");
		}
		else
		{
			System.out.println("FirstName Verification failed");
		}

		
		//if(firstName ==objDriver.findElementById("") )
		
		
	}

}
