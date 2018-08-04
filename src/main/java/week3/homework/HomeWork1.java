package week3.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.findElementByLinkText("Contact Us").click();
		
		Set<String> allWindowHandle= driver.getWindowHandles();
		List<String> listOfAllWinHandle = new ArrayList<String>();
		listOfAllWinHandle.addAll(allWindowHandle);
		driver.switchTo().window(listOfAllWinHandle.get(1));
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(listOfAllWinHandle.get(0));
		driver.findElementByLinkText("Compatible Browser").click();

		Set<String> allWindowHandle1= driver.getWindowHandles();

		List<String> listOfAllWinHandle1 = new ArrayList<String>();
		listOfAllWinHandle1.addAll(allWindowHandle1);
		driver.switchTo().window(listOfAllWinHandle1.get(2));
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(listOfAllWinHandle1.get(0)).close();
		driver.switchTo().window(listOfAllWinHandle1.get(1)).close();
		
		driver.switchTo().window(listOfAllWinHandle1.get(2));
		
		
		System.out.println(driver.findElementByClassName("content_12").getText());

	}

}
