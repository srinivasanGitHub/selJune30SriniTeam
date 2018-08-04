package week2.day2;


import org.openqa.selenium.chrome.ChromeDriver;

public class webTableDay2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		ChromeDriver objDrive =new ChromeDriver();
		objDrive.get("http://leafground.com/pages/table.html");

		int rows = objDrive.findElementsByXPath("//section[@class='innerblock']//table//tr").size();

		System.out.println(rows);

		int columns = objDrive.findElementsByXPath("//section[@class='innerblock']//table//tr[2]//td").size();

		System.out.println(columns);

		String RowVaule = objDrive.findElementByXPath("//section[@class='innerblock']//table//tr[3]/td[2]").getText();

		System.out.println(RowVaule);


	}

}
