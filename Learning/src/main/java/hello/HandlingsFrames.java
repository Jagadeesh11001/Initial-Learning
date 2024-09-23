package hello;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingsFrames {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/frame");

		WebElement myFrame = driver.findElementByXPath("//iframe[@src=\"frameUI\"]");
		driver.switchTo().frame(myFrame);
		driver.findElementByName("fname").sendKeys("Jagan");
		driver.findElementByName("lname").sendKeys("V");
		

		
		
		
	}

}
