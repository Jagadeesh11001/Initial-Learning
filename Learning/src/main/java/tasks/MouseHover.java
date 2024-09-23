package tasks;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/");
		
		WebElement course = driver.findElementByLinkText("Courses");
		Actions builder = new Actions(driver);
		builder.moveToElement(course).perform();
		Thread.sleep(3000);
		
		driver.findElementByLinkText("Selenium-Java").click();
		Thread.sleep(3000);
		
		driver.quit();
		
	
	}

}
