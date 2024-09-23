package testNgBasic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LearnParameters {
	RemoteWebDriver driver;
	@Parameters({"email", "password", "browser"})
	@Test
	void login(String emailid, String pass, String browser) {
		
		switch (browser) {
		case "Chrome":
			driver = new ChromeDriver();
			break;
		case "FireFox":
			driver = new FirefoxDriver();
			break;
		default:
			System.err.println("browser is not defined");
			break;
		}
		System.out.println(emailid + " " + pass);
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/");
		
		driver.findElementByLinkText("Log in").click();

		driver.findElementByName("email")
		.sendKeys(emailid);
		
		driver.findElementByName("password")
		.sendKeys(pass);
		
		driver.findElementByXPath("//button[.='LOGIN']").click();
		String title = driver.getTitle();
		System.out.println("Title is" + title);
		driver.quit();
		
	}
}
