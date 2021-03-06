package week2.codingchallenges;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllDDValues {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();

	
		driver.get("http://leafground.com/pages/Dropdown.html");

		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement element=driver.findElementById("dropdown1");
		Select dropdown=new Select(element);
		
		List<WebElement> ddOptions = dropdown.getOptions();
		int totalCoount = ddOptions.size();
	
		for(WebElement eachoptions:ddOptions )
		{
			System.out.println(eachoptions.getText());
		}
		System.out.println("TotalCount="+totalCoount);
	}

}
