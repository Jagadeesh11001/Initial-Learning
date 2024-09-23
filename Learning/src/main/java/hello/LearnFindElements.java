package hello;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFindElements {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElementByName("q").sendKeys("cricket", Keys.ENTER);
		List<WebElement> crickets = driver.findElementsByXPath("//*[contains(text(),'cricket') or contains(text(),'Cricket')]");
		System.out.println(crickets.size());	
	}
	
	public static void main1(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://letcode.in/edit");
		
		List<WebElement> labels = driver.findElementsByTagName("label");
		
		WebElement element =labels.get(labels.size()-1);
		System.out.println(element.getText());
		
		int size = labels.size();
		if(size == 6) {
			System.out.println("test case passed");
		}else System.out.println("failed");
		
		
		for (WebElement myLabels : labels) {
			String texts = myLabels.getText();
			System.out.println(texts);
		}
		
		driver.quit();
		

		
	}

}
