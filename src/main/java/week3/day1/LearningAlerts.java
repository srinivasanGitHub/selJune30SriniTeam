package week3.day1;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningAlerts {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		//driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");		
		driver.findElementByLinkText("Check Availability").click();
		
		Alert myAlert = driver.switchTo().alert();
				
		String alertTxt = myAlert.getText();
		Thread.sleep(5000);
//		System.out.println(myAlert.getText());
		System.out.println(alertTxt);
		myAlert.accept();
	}
}