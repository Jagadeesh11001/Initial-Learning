package testNgBasic;

import org.testng.annotations.Test;

public class LearnAttribute2 {

	//2)dependsOn attribute
	
	@Test()
	public void signUp() {
		System.out.println("Sign Up");
	}
	
	@Test(dependsOnMethods = "signUp")
	public void logIn() {
		System.out.println("Log In");
	}
	
	@Test(dependsOnMethods = "logIn")
	public void searchProduct() {
		System.out.println("Search Product");
	}
	
	@Test(dependsOnMethods = "searchProduct")
	public void addToCart() {
		System.out.println("Add To Cart");
		throw new RuntimeException();
	}
	
	@Test(dependsOnMethods = "addToCart")
	public void signOut() {
		System.out.println("Sign Out");
	}
}
