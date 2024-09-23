package hello;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingInputs {

	public static void main(String[] args) {

		// Launching chrome
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/edit");
		
		//enter name 
		driver.findElementById("fullName").sendKeys("Jagadeesh");
		
		//Append a text and press keyboard tab
		driver.findElementById("join").sendKeys(" Coder", Keys.TAB);
		
		//inside the box
		String myValue = driver.findElementById("getMe").getAttribute("value");
		System.out.println(myValue); 
		
		//clear the text
		driver.findElementById("clearMe").clear();
		
		//disabled field
		boolean isEdit = driver.findElementById("noEdit").isDisplayed();
		System.out.println(isEdit);
		
		//read only field
		String isReadOnly = driver.findElementById("dontwrite").getAttribute("readonly");
		System.out.println(isReadOnly);
		
		//quit browser
		driver.quit();
		
	}

}
