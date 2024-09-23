package hello;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		driver.manage().window().maximize();
		
		WebElement fruits = driver.findElementByCssSelector("#fruits");
		Select myFruit = new Select(fruits);
		myFruit.selectByVisibleText("Apple");
		
		WebElement country = driver.findElementById("country");
		Select myCountry = new Select(country);
		myCountry.selectByValue("India");
		WebElement selectedCountry = myCountry.getFirstSelectedOption();
		System.out.println(selectedCountry.getText());
		
		WebElement superHeros = driver.findElementById("superheros");
		Select myHeros = new Select(superHeros);
		myHeros.selectByIndex(1);
		myHeros.selectByValue("dd");
		myHeros.selectByIndex(4);
		
	}

	

}
