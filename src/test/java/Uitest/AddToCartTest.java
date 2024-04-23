package Uitest;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.ProductPage;

public class AddToCartTest extends Baseclass {
	
	@Test
	public void productOneTest() throws InterruptedException {
		
		String productName="Sauce Labs Backpack";
		
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("standard_user","secret_sauce");
		
		ProductPage product = new ProductPage(driver);
		
		product.AddTOCart(productName);
		Thread.sleep(5000);
	}	

}
