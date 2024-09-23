package hello;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenShot {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		File firstSrc = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/img1.png");
		FileHandler.copy(firstSrc, dest);
		
		WebElement element = driver.findElementById("home");
		File eleSrc = element.getScreenshotAs(OutputType.FILE);
		File eleDest = new File("./snaps/img2.png");
		FileHandler.copy(eleSrc, eleDest);
		
		WebElement info = driver.findElementByClassName("card-content");
		File infoSrc = info.getScreenshotAs(OutputType.FILE);
		File infoDest = new File("./snaps/img3.png");
		FileHandler.copy(infoSrc, infoDest);
		
		driver.quit();
		
	}

}
