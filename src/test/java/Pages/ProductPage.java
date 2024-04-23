package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	WebDriver driver;
	
	//@FindBy(xpath="//div[text()='Sauce Labs Backpack']/following::button[1]")
	//WebElement addToCart;

	public ProductPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	public void AddTOCart(String productName) {
		
	WebElement addToCart= driver.findElement(By.xpath("//div[text()='"+productName+"']/following::button[1]"));
		
	addToCart.click();	
	}
}