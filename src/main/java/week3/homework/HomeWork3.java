package week3.homework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://layout.jquery-dev.com/demos/iframe_local.html");
		
		WebElement frameEle = driver.findElementById("childIframe");
		driver.switchTo().frame(frameEle);
		driver.findElementByXPath("//button[text()='Close Me']").click();
		

	}

}
