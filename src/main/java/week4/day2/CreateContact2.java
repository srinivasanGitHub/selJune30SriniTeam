package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateContact2 {
     @Test
	public void createcontact2() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");

		ChromeDriver objDriver =new ChromeDriver();
		objDriver.get("http://leaftaps.com/opentaps/");
		objDriver.manage().window().maximize();
		//Login to Leaftaps

		objDriver.findElementById("username").sendKeys("DemoSalesManager");
		WebElement password =objDriver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		objDriver.findElementByClassName("decorativeSubmit").click();
		objDriver.findElementByLinkText("CRM/SFA").click();
		objDriver.findElementByLinkText("Create Contact").click();
		objDriver.findElementById("firstNameField").sendKeys("Srini",Keys.TAB);
		objDriver.findElementById("lastNameField").sendKeys("vasan");
		objDriver.findElementById("createContactForm_firstNameLocal").sendKeys("seenu");
		objDriver.findElementById("createContactForm_lastNameLocal").sendKeys("vas");
		objDriver.findElementById("createContactForm_personalTitle").sendKeys("Personal title");
		objDriver.findElementById("createContactForm_generalProfTitle").sendKeys("Contact Title");
		objDriver.findElementById("createContactForm_departmentName").sendKeys("CSE");
		
		WebElement CurrencyDD = objDriver.findElementById("createContactForm_preferredCurrencyUomId");
		Select objCurrencyDD =new Select(CurrencyDD);
		objCurrencyDD.selectByVisibleText("INR - Indian Rupee");
		
		objDriver.findElementById("createContactForm_description").sendKeys("My contact Description");
		objDriver.findElementById("createContactForm_importantNote").sendKeys("Contact Note");
		
		
		objDriver.findElementById("createContactForm_primaryPhoneCountryCode").clear();
		objDriver.findElementById("createContactForm_primaryPhoneCountryCode").sendKeys("91");
		objDriver.findElementById("createContactForm_primaryPhoneAreaCode").sendKeys("044");
		objDriver.findElementById("createContactForm_primaryPhoneExtension").sendKeys("099");
		
		//objDriver.findElementById("createContactForm_primaryWebUrl").sendKeys("www.test.com");
		
		String ToName = objDriver.findElementById("generalToNameField").getAttribute("value");
		System.out.println(ToName);
		objDriver.findElementById("createContactForm_generalAddress1").sendKeys("44,north car street");
		objDriver.findElementById("createContactForm_generalAddress2").sendKeys("mylapore");
		objDriver.findElementById("createContactForm_generalCity").sendKeys("Chennai");
		objDriver.findElementById("createContactForm_primaryEmail").sendKeys("test@testmail.com");
		objDriver.findElementById("createContactForm_primaryPhoneNumber").sendKeys("2314111");
		objDriver.findElementById("createContactForm_primaryPhoneAskForName").sendKeys("HR");
		
		objDriver.findElementById("createContactForm_generalAttnName").sendKeys("MyContact");
		
		WebElement CountryDD = objDriver.findElementById("createContactForm_generalCountryGeoId");
		Select objCountryDD =new Select(CountryDD);
		objCountryDD.selectByVisibleText("India");
		Thread.sleep(2000);
		
		WebElement StateDD = objDriver.findElementById("createContactForm_generalStateProvinceGeoId");
		Select objStateDD =new Select(StateDD);
		objStateDD.selectByVisibleText("TAMILNADU");
		
		objDriver.findElementById("createContactForm_generalPostalCode").sendKeys("600012");
		objDriver.findElementById("createContactForm_generalPostalCodeExt").sendKeys("00");
		
		
		objDriver.findElementByClassName("smallSubmit").click();
		
		String viewFirstName = objDriver.findElementById("viewContact_firstName_sp").getText();
		System.out.println(viewFirstName);
		if (ToName.contains(viewFirstName))
		{
			System.out.println("FirstName Verified successfully and contact created");
		}
		else
		{
			System.out.println("FirstName Verification failed");
		}
		
		objDriver.findElementByXPath("//a[text()='Edit']").click();
		
		WebElement MarketDD = objDriver.findElementById("addMarketingCampaignForm_marketingCampaignId");
		Select objMarketDD =new Select(MarketDD);
		objMarketDD.selectByVisibleText("Car and Driver");
		
		String marketname = objMarketDD.getFirstSelectedOption().getText();
		System.out.println(marketname);
		objDriver.findElementByXPath("//input[@value ='Add']").click();
		
		objDriver.findElementByXPath("//input[@value ='Update']").click();
		
		String viewMarketname = objDriver.findElementById("viewContact_marketingCampaigns_sp").getText();
		System.out.println(viewMarketname);
		if (marketname.equals(viewMarketname))
		{
			System.out.println("Marketing Campaign verified Successfully");
		}
		else
		{
			System.out.println("Marketing Campaign verification failed");
		}
	}

}
