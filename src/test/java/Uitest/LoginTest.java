package Uitest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Pages.LoginPage;

public class LoginTest extends Baseclass{
	@Test
	public void LoginFailiureTest() throws InterruptedException {
		
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("standard_user","secret_sauce1");
		
		WebElement errorMessage = driver.findElement(By.xpath("//h3[@data-test='error']"));
		
		System.out.println("The error message is " + errorMessage.getText());
		
		String actMsg = errorMessage.getText();
		String expMsg = "Epic sadface: Username and password do not match any user in this service";
		AssertJUnit.assertEquals(actMsg,expMsg);
		Thread.sleep(5000);
	
		
	}
	
	@Test
	public void LoginSuccessTest() throws InterruptedException {
		
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("standard_user","secret_sauce");
		WebElement afterLogin = driver.findElement(By.className("product_label"));
		System.out.println("The error message is " +afterLogin .getText());
		Thread.sleep(5000);
		
	}	

}



