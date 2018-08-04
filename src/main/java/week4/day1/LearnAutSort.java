package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnAutSort {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/sortable/");
		WebElement frameEle = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(frameEle);
		
		WebElement eleitem1 = driver.findElementByXPath("//ul[@id='sortable']/li[1]");
		WebElement eleitem4 = driver.findElementByXPath("//ul[@id='sortable']/li[4]");
		//System.out.println(eleitem4.getLocation());
		Actions builder =new Actions(driver);
		int x =eleitem4.getLocation().getX();
		int y = eleitem4.getLocation().getY();
		//builder.clickAndHold(eleitem1).release(eleitem4).perform();
		builder.dragAndDropBy(eleitem1,x,y).perform();
	}

}
