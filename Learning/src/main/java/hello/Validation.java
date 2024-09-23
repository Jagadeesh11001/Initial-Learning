package hello;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation {
	
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver",
				//"./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		
		//isDisplayed
		WebElement signUp = driver.findElementByLinkText("Sign up");
		signUp.isDisplayed();
		System.out.println(signUp.isDisplayed());
		
		//isEnabled
		driver.get("https://letcode.in/edit");
		WebElement edit = driver.findElementById("noEdit");
		edit.isEnabled();
		System.out.println(edit.isEnabled());
		
		driver.get("https://letcode.in/buttons");
		WebElement btn =driver.findElementById("isDisabled");
		System.out.println(btn.isEnabled());
		
		//isSelected
		driver.get("https://letcode.in/radio");
		WebElement checkBox = driver.findElementByXPath("(//label[@class='checkbox']//input)[1]");
		System.out.println(checkBox.isSelected());
		
		
		
		driver.quit();
		
		
		
		
	}

}
