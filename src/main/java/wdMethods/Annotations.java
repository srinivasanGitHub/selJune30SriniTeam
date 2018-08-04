package wdMethods;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import week6.day1.ReadExcel;


public class Annotations  extends SeMethods{
	
	public String excelFileName,testName,testDesc,category,author,moduleName;
	
	
	@BeforeSuite
	public void startSuite()
	{
		beginResult();
	}
	
	@BeforeClass
	public void startTest()
	{
		startTest(testName,testDesc);
	}
	
	
	
	
	@Parameters({"url","uName","pwd"})
	@BeforeMethod(groups= {"smoke","sanity"})
	public void login(String url,String uName,String pwd)
	{
		startTestIteration(moduleName,author,category);
		startApp("Chrome",url);
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, uName);
		WebElement elePassword = locateElement("id","password");
		type(elePassword, pwd);
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		WebElement eleCrmsfa = locateElement("linktext","CRM/SFA");
		click(eleCrmsfa);
	}
	
	@DataProvider(name = "fetchData" /*indices = {1}*/)
	public Object getData() throws IOException {
		
		ReadExcel objReadExcel =new ReadExcel();
		 return objReadExcel.readExcel(excelFileName);
	}
	
	@AfterMethod(groups= {"smoke","sanity"})
	public void closeBrowserApp()
	{
		closeBrowser();
	}
	@AfterSuite
	public void stopSuite() {
		endResult();
	}
	
		
		
	}
	

	


