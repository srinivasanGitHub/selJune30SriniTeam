package week4.day1;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnAut {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		WebElement frameEle = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(frameEle);
		
	
		WebElement eleDragable = driver.findElementByXPath("//p[text()='Drag me to my target']");
		WebElement eleDroppable =driver.findElementByXPath("//p[text()='Drop here']");
		Actions builder =new Actions(driver);
		builder.dragAndDrop(eleDragable, eleDroppable).perform();
		
		
	}

}
