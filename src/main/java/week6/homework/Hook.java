package week6.homework;

import org.openqa.selenium.WebElement;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.SeMethods;

public class Hook extends SeMethods {

	@Before
	public void before() {
		beginResult();
		startTest("TC001","CreateLead");
		startTestIteration("Leads","gopi","smoke");
		startApp("Chrome","http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesmanager");
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		WebElement eleCrmsfa = locateElement("linktext","CRM/SFA");
		click(eleCrmsfa);
	}
	@After
	public void after() {
		closeBrowser();
		endResult();
	}

}
