package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnMouseOver {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver  = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//button[text()='✕']").click();
		
		WebElement eleElectronics = driver.findElementByXPath("//span[text()='Electronics']");
		WebElement eleApple = driver.findElementByXPath("//span[text()='Apple']");
		
		Actions builder = new Actions(driver);
		//builder.moveToElement(eleElectronics).click(eleApple).perform();
		builder.moveToElement(eleElectronics).perform();
		//Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(eleApple));
		eleApple.click();
		
		
		
	}
}
