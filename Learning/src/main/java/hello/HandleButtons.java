package hello;

import java.awt.Rectangle;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleButtons {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		
		//finding location
		WebElement ele = driver.findElementById("position");
		Point point = ele.getLocation();
		int x = point.getX();
		int y = point.getY();
		
		System.out.println("x=>"+x+"y=>" +y);
		
		//color of the button
		WebElement btnColor = driver.findElementById("color");
		String backColor = btnColor.getCssValue("background-color");
		System.out.println(backColor);
		
		//height & width of the element 
		org.openqa.selenium.Rectangle rect = driver.findElementById("property").getRect();
		System.out.println(rect.getHeight());
		System.out.println(rect.getWidth());
		
		
		Dimension dime = rect.getDimension();
		System.out.println(dime);
		System.out.println(dime.getHeight());
		System.out.println(dime.width);
		
		boolean disabled = driver.findElementById("isDisabled").isDisplayed();
		System.out.println(disabled);
		
		driver.quit(); 
		
	
	}

}
