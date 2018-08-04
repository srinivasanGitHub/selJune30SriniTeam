package week5.day2.TestNG;



import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.Annotations;

public class CreateLead extends Annotations{

	@Test(dataProvider = "fetchData1")
	public void createLead(String cName, String fName, String lName, String email, int ph) {			
		click(locateElement("linkText", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"), cName);
		type(locateElement("id", "createLeadForm_firstName"), fName);
		type(locateElement("id", "createLeadForm_lastName"), lName);
		type(locateElement("id", "createLeadForm_primaryEmail"), email);
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"), ""+ph);
		click(locateElement("name", "submitButton"));			
	}
	
	@DataProvider(name = "fetchData", indices = {1})
	public Object[][] getData() {
		Object[][] data = new Object[3][5];		
		data[0][0] ="TestLeaf";
		data[0][1] ="Babu";
		data[0][2] ="M";
		data[0][3] ="babu@testleaf.com";
		data[0][4] =12345678;
		
		data[1][0] ="TL";
		data[1][1] ="Sarath";
		data[1][2] ="M";
		data[1][3] ="sarath@testleaf.com";
		data[1][4] =98989856;
		
		data[2][0] ="TL";
		data[2][1] ="Koushik";
		data[2][2] ="M";
		data[2][3] ="Koushik@testleaf.com";
		data[2][4] =76767676;
		
		return data;
		
	}
	
	@DataProvider(name = "fetchData1", indices = {1})
	public Object[] getData1() {
		Object[] data = new Object[5];		
		data[0] ="TestLeaf";
		data[1] ="Babu";
		data[2] ="M";
		data[3] ="babu@testleaf.com";
		data[4] =12345678;	 	
		
		return data;
		
	}
	
	
	
	
	
}












