package hello;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/alert");
		
		// simple alert
		driver.findElementById("accept").click();
		Alert alrt = driver.switchTo().alert();
		String text = alrt.getText();
		System.out.println("simple alert text" + text);
		alrt.accept();
		
		driver.findElementById("prompt").click();
		driver.switchTo().alert();
		alrt.sendKeys("Jagan");
		alrt.accept();
		String name = driver.findElementById("myName").getText();
		System.out.println(name);
	
	}

}
