package week3.day1;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LearningFrames {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();		
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://jqueryui.com/selectable/");
			
			WebElement frameEle = driver.findElementByClassName("demo-frame");
			driver.switchTo().frame(frameEle);
			
			driver.findElementByXPath("//ol[@id='selectable']/li[1]").click();
			Thread.sleep(2000);
			driver.findElementByXPath("//ol[@id='selectable']/li[4]").click();
			Thread.sleep(2000);
			driver.switchTo().defaultContent();
			driver.findElementByLinkText("jQuery UI").click();
			
		}

	}
