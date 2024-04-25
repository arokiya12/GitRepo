package steps;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
public ChromeDriver driver;
public WebDriverWait wait;
	

	@When("When click on shopnow button")
	public void when_click_on_shopnow_button() {
		driver.findElement(By.linkText("Shop now")).click();
	    
	}

	@When("Click Products under Hairproducts")
	public void click_products_under_hairproducts() {
		driver.findElement(By.xpath("(//p[text()='Products']/following::p)[2]")).click();
	}

	@When("Click Hair BeautyPath Link")
	public void click_hair_beauty_path_link() {
		driver.findElement(By.xpath("//p[text()='Hair Beauty Bath']")).click();
	   
	}

	@When("Click Addto Cart button")
	public void click_addto_cart_button() {
		WebElement Addtocart = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		wait.until(ExpectedConditions.visibilityOf(Addtocart));
		Addtocart.click();
	}

	@When("Click on the cart button")
	public void click_on_the_cart_button() {
		 driver.findElement(By.xpath("//div[@class='cart-animation']")).click();
	   
	}

	@When("Click Checkout Button")
	public void click_checkout_button() {
		driver.findElement(By.linkText("Checkout")).click();
	   
	}

	@When("Select the Shipping Method")
	public void select_the_shipping_method() {
		 WebElement dropdown = driver.findElement(By.name("fulfillment[shipping_method]"));
		 Select sel = new Select(dropdown);
		 sel.selectByVisibleText("Worldwide - $5.00 USD");
	   
	}

	@When("Click Make payment button")
	public void click_make_payment_button() throws InterruptedException {
		 driver.findElement(By.xpath("//button[text()='Make payment']")).click();
		 Thread.sleep(3000);
	    
	}

	@Then("Verify orderid and printorderid")
	public void verify_orderid_and_printorderid() {
		 WebElement ordernumber = driver.findElement(By.xpath("//p[@class='font-color-light mb-2']"));
		 String text = ordernumber.getText();
		String[] split =  text.split(":");
		System.out.println("order number is:"+split[split.length-1]);
	}}