package hello;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://letcode.in/table");

		WebElement table = driver.findElementByXPath("//table[@id='simpletable']");
		List<WebElement> headers = table.findElements(By.tagName("th"));
		for (WebElement header : headers) {
			String text = header.getText();
			System.out.println(text);
		}
		
		List<WebElement> allRows =	table.findElements(By.cssSelector("table#simpletable>tbody>tr"));
		int size = allRows.size();
		System.out.println(size);
		
		/*
		 * for (WebElement rows : allRows) { List<WebElement> columns =
		 * rows.findElements(By.tagName("td")); WebElement text = columns.get(0);
		 * System.out.println(text.getText()); }
		 */
		
		
		driver.quit();
		
		
	
	}

}
