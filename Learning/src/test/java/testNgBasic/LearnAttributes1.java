package testNgBasic;

import org.testng.annotations.Test;

public class LearnAttributes1 {

	//1)priority attribute
	
	@Test(priority = 1)
	public void signUp() {
		System.out.println("Sign Up");
	}
	
	@Test(priority = 2)
	public void logIn() {
		System.out.println("Log In");
	}
	
	@Test(priority = 3)
	public void searchProduct() {
		System.out.println("Search Product");
	}
	
	@Test(priority = 4)
	public void addToCart() {
		System.out.println("Add To Cart");
	}
	
	@Test(priority = 5)
	public void signOut() {
		System.out.println("Sign Out");
	}
}

