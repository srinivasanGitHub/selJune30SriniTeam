package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnAutMove {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElementByXPath("//button[text()='✕']").click();
		
		WebElement eleTv = driver.findElementByXPath("//span[text()='TVs & Appliances']");
		WebElement eleThomson = driver.findElementByXPath("//span[text()='Thomson']");
		
		Actions builder = new Actions(driver);
		builder.moveToElement(eleTv).pause(3000).click(eleThomson).perform();
	}

}
