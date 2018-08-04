package wdMethods;

import java.io.File;
import java.io.IOException;

import java.util.*;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import wdMethods.Reporter;

public class SeMethods extends Reporter implements WdMethods{
	public static RemoteWebDriver driver ;

	public void startApp(String browser, String url) {
		try {
			
			if (browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();			
			} else if (browser.equalsIgnoreCase("firefox")) 
			{
				System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckoriver.exe");
				driver = new FirefoxDriver();	
			}
			else if (browser.equalsIgnoreCase("IE"))
			{
				System.setProperty("webdriver.ie.driver","C:\\Drivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}


			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			System.out.println("The Browser "+browser+" is Launched Successfully");
			reportStep("The browser launched successfully", "pass");
		} 
		catch (WebDriverException e)
		{
			System.err.println("WebDriverException has occurred");
			reportStep("The browser not launched", "fail");
			throw new RuntimeException();
		}

		catch (Exception e)
		{
			reportStep("The browser not launched", "fail");
			System.err.println("Exception has occurred");
			throw new RuntimeException();
		}
		finally {
			takeSnap();
		}


	}


	public WebElement locateElement(String locator, String locValue) {
		try 
		{
			switch (locator)
			{
			case "id": 	  return driver.findElementById(locValue);
			case "class": return driver.findElementByClassName(locValue);
			case "xpath": return driver.findElementByXPath(locValue);
			case "linktext": return driver.findElementByLinkText(locValue);
			case "name": return driver.findElementByName(locValue);
			case "tagname": return driver.findElementByTagName(locValue);
			case "partiallinktext": return driver.findElementByPartialLinkText(locValue);
			}
			return null;
		} 
		catch(NoSuchElementException e)
		{
			reportStep("Exception has occurred in locateElement", "fail");
			System.err.println("Exception has occurred in locateElement "+ e);
			throw new RuntimeException(e);
		}
		catch (Exception e)
		{
			reportStep("Exception has occurred in locateElement", "fail");
			System.err.println("Exception has occurred in locateElement "+ e);
			throw new RuntimeException();
		}
	}

	public WebElement locateElement(String locValue) 
	{
		try 
		{
			return driver.findElementById(locValue);
		} 
		catch (Exception e) 
		{
			reportStep("Exception has occurred in locateElement", "fail");
			System.err.println("Exception has occurred in locateElement "+ e);
			throw new RuntimeException();
		}
	}

	public void type(WebElement ele, String data) {
		try {
			ele.sendKeys(data);
			reportStep("The Data "+data+" is Entered Successfully", "pass");
			System.out.println("The Data "+data+" is Entered Successfully");
		}
		catch (Exception e)
		{
			reportStep("Exception has occurred in type ", "fail");
			System.err.println("Exception has occurred in type   "+ e);
			throw new RuntimeException(e);
		}
		finally
		{
			takeSnap();
		}

	}

	public void click(WebElement ele) {
		try {
			ele.click();
			reportStep("The Element "+ele+" is clicked Successfully", "pass");
			System.out.println("The Element  "+ele+" is clicked Successfully");
		} 
		catch (Exception e)
		{
			reportStep("Exception has occurred in click", "fail");
			System.err.println("Exception has occurred in click  "+ e);
			throw new RuntimeException();
		}
		finally 
		{
			takeSnap();
		}

	}
	public void clickWithNoSnap (WebElement ele) {
		try {
			ele.click();
			reportStep("The Element  "+ele+" is clickedSuccessfully", "pass");
			System.out.println("The Element  "+ele+" is clicked Successfully");
		} 
		catch (Exception e) 
		{
			reportStep("Exception has occurred in clickWithNoSnap", "fail");
			System.err.println("Exception has occurred in clickWithNoSnap "+e);
			throw new RuntimeException();
		}

	}

	public String getText(WebElement ele) {

		String text;
		try {
			text = ele.getText();
			System.out.println(text);
			return text;
		} catch (Exception e) 
		{
			reportStep("Exception has occurred in getText", "fail");
			System.err.println("Exception has occurred in getText "+ e);
			throw new RuntimeException();
		}

	}
	public String getTextFromDropDown(WebElement ele) {

		String text;
		try {
			Select objDD = new Select(ele);	
			text =objDD.getFirstSelectedOption().getText();
			return text;
		} catch (Exception e) 
		{
			reportStep("Exception has occurred in getTextFromDropDown", "fail");
			System.err.println("Exception has occurred in getTextFromDropDown "+e);
			throw new RuntimeException();
		}

	}
	public String getAttribute(WebElement ele) {

		String text;
		try {
			text = ele.getAttribute("value");
			System.out.println(text);
			return text;
		} catch (Exception e) 
		{
			reportStep("Exception has occurred in getAttribute", "fail");
			System.err.println("Exception has occurred in getAttribute "+ e);
			throw new RuntimeException();
		}

	}

	public void selectDropDownUsingText(WebElement ele, String value) 
	{
		try {
			Select objDD = new Select(ele);	
			objDD.selectByVisibleText(value);
			reportStep("Selected value using text from dropdown "+value,"pass");
			System.out.println("Selected value using text from dropdown "+value);
		} 
		catch (Exception e) 
		{
			reportStep("Exception has occurred in  selectDropDownUsingText ", "fail");
			System.err.println(" Exception has occurred in  selectDropDownUsingText " +e);
			throw new RuntimeException();
		}
		finally 
		{
			takeSnap();
		}

	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {

		try {
			Select objDD = new Select(ele);	
			objDD.selectByIndex(index);
			reportStep("Selected value using from dropdown "+index,"pass");
			System.out.println("Selected value using from dropdown "+index);
		} catch (Exception e) 
		{
			reportStep("Exception has occurred in selectDropDownUsingIndex", "fail");
			System.err.println("Exception has occurred in selectDropDownUsingIndex  "+e);
			throw new RuntimeException();
		}
		finally
		{
			takeSnap();
		}


	}

	public void verifyTitle(String expectedTitle) 
	{
		try {
			String currentTitle = driver.getTitle();
			System.out.println(currentTitle);
			if(currentTitle.contains(expectedTitle))
			{
				reportStep("Title verification  passed", "pass");
				System.out.println("Title verified Successfully");				
			}
			else
			{
				reportStep("Title verification  failed", "fail");
				System.out.println("Title verification failed");				
			}
		} 
		catch (Exception e) 
		{
			reportStep("Exception has occurred in verifyTitle ", "fail");
			System.err.println("Exception has occurred in verifyTitle  "+e);
			throw new RuntimeException();
		}
		finally {
			takeSnap();
		}
	}

	public void verifyExactText(WebElement ele, String expectedText) 
	{
		try {
			String currentText = ele.getText();
			if(currentText.equals(expectedText))
			{
				reportStep("Text verification passed", "pass");
				System.out.println("Text Verified Successfully");

			}
			else
			{
				reportStep("Text verification failed", "fail");
				System.out.println("Text Verification failed");
			}

		} catch (Exception e) 
		{
			reportStep("Exception has occurred in verifyExactText", "fail");
			System.err.println("Exception has occurred in verifyExactText "+e);
			throw new RuntimeException();
		}
		finally {
			takeSnap();
		}
	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		try {
			String currentText = ele.getText();
			if(expectedText.contains(currentText))
			{
				reportStep("Partial Text verification passed", "pass");
				System.out.println("Partial Text Verified Successfully");
			}
			else
			{
				reportStep("Partial Text verification failed", "fail");
				System.out.println("Partial Text Verification failed");
			}
		} catch (Exception e) 
		{
			reportStep("Exception has occurred in verifyPartialText", "fail");
			System.err.println("Exception has occurred in verifyPartialText "+e);
			throw new RuntimeException();
		}
		finally {
			takeSnap();
		}


	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {

		try {
			if(ele.getAttribute(value).equals(attribute))
			{
				reportStep("Attribute verification passed", "pass");
				System.out.println("Attribute verification successfully");
			}
			else
			{
				reportStep("Attribute verification failed", "fail");
				System.out.println("Attribute verification failed");
			}
		} catch (Exception e) 
		{
			reportStep("Exception has occurred in verifyExactAttribute", "fail");
			System.err.println("Exception has occurred in verifyExactAttribute "+e);
			throw new RuntimeException();
		}
		finally {
			takeSnap();
		}

	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {

		try {
			if(ele.getAttribute(value).contains(attribute))
			{
				reportStep("Attribute verification passed", "pass");
				System.out.println("Attribute verification successfully");
			}
			else
			{
				reportStep("Attribute verification failed", "fail");
				System.out.println("Attribute verification failed");
			}
		} catch (Exception e) 
		{
			reportStep("Exception has occurred in verifyPartialAttribute", "fail");
			System.err.println("Exception has occurred in verifyPartialAttribute "+e);
			throw new RuntimeException();
		}
		finally {
			takeSnap();
		}


	}

	public void verifySelected(WebElement ele) {

		try {
			if(ele.isSelected())
			{
				reportStep(ele+" is selected","pass");
				System.out.println( ele+" is selected");
			}
			else
			{
				reportStep(ele+" is not selected","fail");
				System.out.println( ele+" is not selected");
			}
		} catch (Exception e) 
		{
			reportStep("Exception has occurred in verifySelected", "fail");
			System.err.println("Exception has occurred in verifySelected "+e);
			throw new RuntimeException();
		}
		finally {
			takeSnap();
		}

	}

	public void verifyDisplayed(WebElement ele) {
		try {
			if(ele.isDisplayed())
			{
				reportStep(ele+" is Displayed", "pass");
				System.out.println( ele+" is Displayed");
			}
			else
			{
				reportStep(ele+" is not Displayed", "fail");
				System.out.println( ele+" is not Displayed");
			}
		} catch (Exception e) 
		{
			reportStep("Exception has occurred in verifyDisplayed", "fail");
			System.err.println("Exception has occurred in verifyDisplayed "+e);
			throw new RuntimeException();
		}
		finally {
			takeSnap();
		}



	}
	public void verifyEnabled(WebElement ele) {
		try {
			if(ele.isEnabled())
			{
				reportStep(ele+" is enabled", "pass");
				System.out.println( ele+" is enabled");
			}
			else
			{
				reportStep(ele+" is not enabled", "fail");
				System.out.println( ele+" is not enabled");
			}
		} catch (Exception e) 
		{
			reportStep("Exception has occurred in verifyEnabled", "fail");
			System.err.println("Exception has occurred in verifyEnabled  "+e);
			throw new RuntimeException();
		}finally {
			takeSnap();
		}

	}


	public void switchToWindow(int index)
	{
		try {
			Set<String> allWindows = driver.getWindowHandles();
			List<String> listAllWindows = new ArrayList<String>();
			listAllWindows.addAll(allWindows);
			driver.switchTo().window(listAllWindows.get(index));
			reportStep("Window Switched successfully", "pass");
			System.out.println("Window Switched successfully");
		} catch (Exception e) 
		{
			reportStep("Exception has occurred in switchToWindow", "fail");
			System.err.println("Exception has occurred in switchToWindow "+e);
			throw new RuntimeException();
		}
		finally {
			takeSnap();
		}


	}

	public void switchToFrame(WebElement ele) {

		try {
			driver.switchTo().frame(ele);
		} catch (Exception e) 
		{
			reportStep("Exception has occurred in switchToFrame", "fail");
			System.err.println("Exception has occurred in switchToFrame "+e);
			throw new RuntimeException();
		}
		finally {
			takeSnap();
		}


	}
	public void MouseOverandClick(WebElement ele)
	{
		try
		{
			Actions builder = new Actions(driver);
			builder.moveToElement(ele).perform();
			reportStep(ele + " Clicked successfully", "pass");
			System.out.println(ele + " Clicked successfully");

		}
		catch (Exception e) 
		{
			reportStep("Exception has occurred in MouseOverandClick", "fail");
			System.err.println("Exception has occurred in MouseOverandClick "+e);
			throw new RuntimeException();
		}
		finally {
			takeSnap();
		}
	}
	public void dragAndDrop(WebElement sourceEle, WebElement targetEle)
	{
		try
		{
			Actions builder = new Actions(driver);
			builder.dragAndDrop(sourceEle, targetEle).click();

		}
		catch (Exception e) 
		{
			reportStep("Exception has occurred in dragAndDrop", "fail");
			System.err.println("Exception has occurred in dragAndDrop "+e);
			throw new RuntimeException();
		}
		finally {
			takeSnap();
		}
	}
	public Alert switchToAlert() {
		try {

			return driver.switchTo().alert();
		} catch (Exception e) 
		{
			reportStep("Exception has occurred in switchToAlert", "fail");
			System.err.println("Exception has occurred in switchToAlert "+e);
			throw new RuntimeException();
		}
	}

	public void acceptAlert() {

		try {
			driver.switchTo().alert().accept();
			reportStep("Alert accepted successfully", "pass");
			System.out.println("Alert accepted successfully");
		} catch (Exception e) 
		{
			reportStep("Exception has occurred in acceptAlert", "fail");
			System.err.println("Exception has occurred in acceptAlert "+e);
			throw new RuntimeException();
		}

	}

	public void dismissAlert() {

		try {
			driver.switchTo().alert().dismiss();
			reportStep("Alert dismissed successfully", "pass");
			System.out.println("Alert dismissed successfully");
		} catch (Exception e) 
		{
			reportStep("Exception has occurred in dismissAlert", "fail");
			System.err.println("Exception has occurred in dismissAlert "+e);
			throw new RuntimeException();
		}
	}

	public String getAlertText() {

		try {
			return driver.switchTo().alert().getText();
		} catch (Exception e) 
		{
			reportStep("Exception has occurred in getAlertText", "fail");
			System.err.println("Exception has occurred in getAlertText "+e);
			throw new RuntimeException();
		}
	}

	public void takeSnap() 
	{
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("C:\\EclipseWorkSpace\\Selenium\\src\\main\\resources\\snaps\\img_"+java.time.LocalTime.now().toString().replace(":","_").replace(".","_")+".png");
		try {
			FileUtils.copyFile(src, desc);
		} catch (IOException e) 
		{
			reportStep("Exception has occurred in takeSnap", "fail");
			System.err.println("Exception has occurred in takeSnap "+e);
			throw new RuntimeException();
		}

	}

	public void waitUntilVisiblityofEle(WebElement ele)
	{
		try {
			WebDriverWait objWait = new WebDriverWait(driver,10);
			objWait.until(ExpectedConditions.visibilityOf(ele));
			ele.click();
		} catch (Exception e) 
		{
			reportStep("Exception has occurred in waitUntilVisiblityofEle", "fail");
			System.err.println("Exception has occurred in waitUntilVisiblityofEle "+e);
			throw new RuntimeException();
		}
	}

	public void closeBrowser() {
		driver.close();

	}

	public void closeAllBrowsers() {

		driver.quit();

	}





}
