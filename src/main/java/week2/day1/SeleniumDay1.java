package week2.day1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class SeleniumDay1 {

	public static void main(String[] args) {
		
	    System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
	    ChromeOptions objChrop =new ChromeOptions();
	    objChrop.setHeadless(true);
	    
		ChromeDriver objDrive =new ChromeDriver();
		objDrive.get("http://leaftaps.com/opentaps/");
		objDrive.findElementById("username").sendKeys("DemoSalesManager");
		//objDrive.manage().window().maximize();
		WebElement password =objDrive.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		objDrive.findElementByClassName("decorativeSubmit").click();
		objDrive.findElementByLinkText("CRM/SFA").click();
		
		
		objDrive.findElementByLinkText("Create Lead").click();
		//objDrive.findElementByClassName("LoginName").click();
		/*objDrive.findElementById("createLeadForm_companyName").sendKeys("CSC");
		objDrive.findElementById("createLeadForm_firstName").sendKeys("Srinivasan");
		objDrive.findElementById("createLeadForm_lastName").sendKeys(" K ");
		
		
		
		WebElement source = objDrive.findElementById("createLeadForm_industryEnumId");
		Select objDD =new Select(source);
		
		List<WebElement> alloptions = objDD.getOptions(); // For Quick Assist Ctrl +2,L
		int size = alloptions.size();
		System.out.println(size);
		for(WebElement eachoption : alloptions)
		{			
			System.out.println(eachoption.getText());
		}
		objDD.selectByVisibleText("Insurance");
		
		
		objDrive.findElementByClassName("smallSubmit").click();
		*/
		//List<WebElement> listofDD =new ArrayList<WebElement>();
		
		List<WebElement> listofDD = objDrive.findElementsByTagName("select");	
		int size =listofDD.size();
		System.out.println(size);
		
		System.out.println("Successfully Tested");
	}

}
