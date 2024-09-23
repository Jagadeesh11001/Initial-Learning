package hello;

import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		// to do
		// Launch browser
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// launch URL
		driver.get("https://letcode.in/");
		
		// click login btn
		driver.findElementByLinkText("Log in").click();
		
		// enter email id
		driver.findElementByName("email")
		.sendKeys("jagadeesh76980@gmail.com");
		
		// enter password
		driver.findElementByName("password")
		.sendKeys("Jagan@Code");
		
		// click login btn
		driver.findElementByXPath("//button[.='LOGIN']").click();

		
		
		
		
	 }

}
