package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class FindElements {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions op = new ChromeOptions();
		op.setHeadless(false);
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.crystalcruises.com/travel-calendar?year=2018");
		driver.manage().timeouts().implicitlyWait
		(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		List<WebElement> allQUOTE = 
				driver.findElementsByLinkText("REQUEST A QUOTE1");
		int size = allQUOTE.size();
		System.out.println(size);
		/*WebElement secondwebElement = allQUOTE.get(1);
		secondwebElement.click();*/
	}

}
