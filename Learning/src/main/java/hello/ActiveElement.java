package hello;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveElement {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement activeEle = driver.switchTo().activeElement();
		activeEle.sendKeys("jagadeesh76980@gmail.com", 
				Keys.TAB, 
				"12345678",
				Keys.ENTER);
		
		driver.quit();
		
		
	}

}
