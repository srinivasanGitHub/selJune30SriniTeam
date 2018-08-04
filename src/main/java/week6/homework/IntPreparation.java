package week6.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;




public class IntPreparation {

	public static void main(String[] args) {


		try {
			System.setProperty("webdriver.ie.driver","C:\\Drivers\\IEDriverServer.exe");
			InternetExplorerDriver objIeDriver =new InternetExplorerDriver();
			objIeDriver.manage().window().maximize();
			objIeDriver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			System.out.println("The IE Browser Launched successfully");
			
			objIeDriver.get("https://www.flipkart.com/");
			Thread.sleep(5000);
			
			//objIeDriver.findElementByXPath("//button[text()='✕']").click();
			
			objIeDriver.findElementByXPath("//input[@title='Search for products, brands and more']").sendKeys("tv",Keys.ENTER);
			objIeDriver.findElementByXPath("//*[@id='container']/div/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/div/div").click();
			
			Set<String> allWindows = objIeDriver.getWindowHandles();
			List<String> listAllWindows = new ArrayList<String>();
			listAllWindows.addAll(allWindows);
			objIeDriver.switchTo().window(listAllWindows.get(1));
			objIeDriver.manage().window().maximize();
			objIeDriver.findElementByXPath("//button[text()='BUY NOW']").click();
			
			objIeDriver.findElementByTagName("input").sendKeys("987899998749");
			objIeDriver.findElementByXPath("//span[text()='CONTINUE']").click();
			
			
			/*objIeDriver.findElementById("txtStationFrom").sendKeys("tsi",Keys.TAB);
			objIeDriver.findElementById("txtStationTo").clear();
			objIeDriver.findElementById("txtStationTo").sendKeys("ms",Keys.TAB);
			objIeDriver.findElementById("chkSelectDateOnly").click();
			WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList']");
			List<WebElement> rows = table.findElements(By.tagName("tr"));
			System.out.println(rows.size());
			int size = objIeDriver.findElementsByXPath("//table[@class='DataTable TrainList']//tr[1]/td").size();
			System.out.println(size);*/
			
		} 
		catch (Exception e) 
		{
			
			System.err.println(e);
		}


	}

}
