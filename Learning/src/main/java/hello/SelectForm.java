package hello;

import org.openqa.selenium.chrome.ChromeDriver;

public class SelectForm {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/signin");
		driver.manage().window().maximize();
		
		driver.findElementByName("email").sendKeys("Jagadeesh76980@gmail.com");
		driver.findElementByName("password").sendKeys("Jagan@Code");
		driver.findElementByXPath("//button[@class='button is-primary']").submit();
		               
		
		driver.quit();
		
		
	}

}
