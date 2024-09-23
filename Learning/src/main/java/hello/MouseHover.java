package hello;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement fash = driver.findElementByXPath("//span[.='Fashion']");
		Actions builder = new Actions(driver);
		builder.moveToElement(fash).perform();
		Thread.sleep(3000);
		driver.findElementByLinkText("Essentials").click();
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
	}

}
