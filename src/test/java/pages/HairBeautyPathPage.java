package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Testng.BaseClass;
import io.cucumber.java.en.When;

public class HairBeautyPathPage extends Base.BaseClass {
	//public static WebDriverWait wait;

	@When("Click Addto Cart button")
	public void click_addto_cart_button() {
		WebElement Addtocart = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		wait.until(ExpectedConditions.visibilityOf(Addtocart));
		Addtocart.click();
	}

	@When("Click on the cart button")
	public void click_on_the_cart_button() {
		try {
			driver.findElement(By.xpath("//div[@class='cart-animation']")).click();
	   
	}
		catch(StaleElementReferenceException e) {
		}
		}
	@When("Click Checkout Button")
	
	public void click_checkout_button() {
		try {
			
		driver.findElement(By.linkText("Checkout")).click();
	   
	}
catch(StaleElementReferenceException e) {
	WebElement element = driver.findElement(By.linkText("Checkout"));
	driver.executeScript("arumentz[0].click();", element);
	element.click();
	
}
		catch (JavascriptException e) {
			WebElement element = driver.findElement(By.linkText("Checkout"));
			wait.until(ExpectedConditions.stalenessOf(element));
		//	wait.driver.executeScript("arumentz[0].click();", element);
			element.click();
	}
		catch(Exception e) {
			System.out.println(e);
		}

}}
