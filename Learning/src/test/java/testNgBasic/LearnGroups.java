package testNgBasic;

import org.testng.annotations.Test;

public class LearnGroups {

	@Test(groups = "Smoke")
	public void signUp() {
		System.out.println("Sign Up");
	}
	
	@Test(groups = "Sanity")
	public void logIn() {
		System.out.println("Log In");
	}
	
	@Test(groups = "Regression")
	public void searchProduct() {
		System.out.println("Search Product");
	}
	
	@Test(groups = "Smoke")
	public void addToCart() {
		System.out.println("Add To Cart");
	}
	
	@Test(groups = "Regression")
	public void signOut() {
		System.out.println("Sign Out");
	}
}
