package hello;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Explicit wait
//		driver.get("https://letcode.in/waits");
//		driver.findElementByXPath("//button[@id='accept']").click();
//		Alert until = wait.until(ExpectedConditions.alertIsPresent());
//		System.out.println(until.getText());
//		Thread.sleep(3000);
//		until.accept();
//		driver.switchTo().alert().accept();
		
		//Invisibility
//		driver.get("https://letcode.in/signin");
//		driver.findElementByName("email").sendKeys("Jagadeesh76980@gmail.com");
//		driver.findElementByName("password").sendKeys("Jagan@Code");
//		driver.findElementByXPath("(//button[@class='button is-primary'])[1]").click();
//		WebElement toast =	driver.findElementByXPath("//div[@id='toast-container']");
//		wait.until(ExpectedConditions.visibilityOf(toast));
//		System.out.println(toast.getText());
//		wait.until(ExpectedConditions.invisibilityOf(toast));
//		driver.findElementByLinkText("Sign out").click();
		
		//wait for title change
		driver.get("https://www.flipkart.com/");
		WebElement hover =	driver.findElementByXPath("//span[.='Electronics']");
		Actions builder = new Actions(driver);
		builder.moveToElement(hover).perform();
		WebElement headphones = driver.findElementByLinkText("Bluetooth Headphones");
		headphones.click();
		wait.until(ExpectedConditions.titleContains("Headphones"));
		System.out.println(driver.getTitle());
		
		driver.quit();
	}


}
