package hello;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextAndGetAttribute {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/edit");
		driver.manage().window().maximize();
		
		//get text
		WebElement header = driver.findElementByTagName("h1");
		String text = header.getText();
		System.out.println(text);
		
		String text2 = driver.findElementByLinkText("Sign up").getText();
		System.out.println("Link:" +text2);
		
		String text3 = driver.findElementByClassName("card-content").getText();
		System.out.println("Link:" +text3);
		
		//get attribute
		
		String text4 = driver.findElementById("join").getAttribute("value");
		System.out.println(text4);
		
		
		
		
		driver.quit();
		
	
		
		
		
		
	}
}
