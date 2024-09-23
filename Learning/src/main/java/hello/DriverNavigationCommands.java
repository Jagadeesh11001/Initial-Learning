package hello;

import org.openqa.selenium.chrome.ChromeDriver;

public class DriverNavigationCommands {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		String url = driver.getCurrentUrl();
		System.out.println("Button Page URL" + url);
		Thread.sleep(3000);
		driver.findElementById("home").click();
		String homeUrl = driver.getCurrentUrl();
		System.out.println("Home Page URL" + homeUrl);
		Thread.sleep(3000);
		driver.navigate().back();
		driver.navigate().forward();		
		System.out.println("returns to button page" + driver.getCurrentUrl());

		driver.navigate().refresh();
		driver.navigate().to("https://letcode.in/playwright");
		
		driver.quit();
		
	}

}
