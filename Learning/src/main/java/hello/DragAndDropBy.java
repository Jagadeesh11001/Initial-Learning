package hello;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropBy {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		driver.switchTo().frame(0);
		
		WebElement element = driver.findElementById("draggable");
		Actions builder = new Actions(driver);
		int x = element.getLocation().getX();
		int y = element.getLocation().getY();

		builder.dragAndDropBy(element, +90, +90 ).perform();
		
		
	}

}
