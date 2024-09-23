package testNgBasic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utils.dataUtils;

public class LearnDataProviders{

	@Test(dataProvider = "login", dataProviderClass = dataUtils.class)
	
	public void login(String email, String pass){
		
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/");
		
		driver.findElementByLinkText("Log in").click();

		driver.findElementByName("email")
		.sendKeys(email);
		
		driver.findElementByName("password")
		.sendKeys(pass);
		
		driver.findElementByXPath("//button[.='LOGIN']").click();
		String title = driver.getTitle();
		System.out.println("Title is" + title);
		driver.quit();
		
	}
}
