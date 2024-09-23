package hello;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHanding {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://letcode.in/windows");
		
		//to get first tab id
		String 	windowHandle = driver.getWindowHandle();
		System.out.println("frist tab" +windowHandle);
		
		//2nd tab id
		driver.findElementById("home").click();
		Set<String> windowHandles =	driver.getWindowHandles();
		System.out.println(windowHandles);
		
		List<String> list = new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(1));
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(list.get(0));
		driver.close();
		
		
	}

}
