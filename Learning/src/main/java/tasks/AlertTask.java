package tasks;

import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTask {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		
		
		
	}

}
