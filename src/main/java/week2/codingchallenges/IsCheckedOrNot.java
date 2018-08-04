package week2.codingchallenges;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsCheckedOrNot {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	List<WebElement> CheckBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement eachCheckBox:CheckBoxes)
		{
			if(eachCheckBox.isSelected())
			{
				System.out.println(eachCheckBox.getText() + " Checkbox is Selected");
			}
			else
			{
				System.out.println(eachCheckBox.getText() + "Checkbox is not Selected");
			}
		}

	}

}
