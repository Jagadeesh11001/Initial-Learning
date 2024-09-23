package testNgBasic;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class LearnAttributes3 {

	//5)alwaysRun
	//6)enable
	//7)description
	
	@Test(enabled = false)
	public void signUp() {
		System.out.println("Sign Up");
	}
	
	@Test(description = "logIn fucntion")
	public void logIn() {
		System.out.println("Log In");
		throw new NoSuchElementException();
	}
	
	@Test(dependsOnMethods = "testNgBasic.LearnAttributes3.logIn", alwaysRun = true)
	public void searchProduct() {
		System.out.println("Search Product");
	}
			
}
