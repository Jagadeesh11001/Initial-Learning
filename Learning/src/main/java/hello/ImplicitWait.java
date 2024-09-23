package hello;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		// to do
		// Launch browser
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// launch URL
		driver.get("https://letcode.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// click login btn
		driver.findElementByLinkText("Log in").click();
		
		// enter email id
		driver.findElementByName("ema")
		.sendKeys("jagadeesh76980@gmail.com");
		
		// enter password
		driver.findElementByName("password")
		.sendKeys("Jagan@Code");
		
		// click login btn
		driver.findElementByXPath("//button[.='LOGIN']").click();

		
		
		
		
	 }

}
