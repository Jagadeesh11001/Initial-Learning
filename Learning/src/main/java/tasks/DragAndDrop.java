package tasks;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropable");
		
		WebElement source = driver.findElementById("draggable");
		WebElement target = driver.findElementById("droppable");
		
		Actions builder = new Actions(driver);
		builder.dragAndDrop(source, target).perform();
		
		driver.quit();
		
		
		
	
	}

}
