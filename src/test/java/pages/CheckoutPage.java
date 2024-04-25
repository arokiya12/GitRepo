package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Testng.BaseClass;
import io.cucumber.java.en.When;

public class CheckoutPage extends Base.BaseClass {

	@When("Select the Shipping Method")
	public void select_the_shipping_method() {
		try {
		 WebElement dropdown = driver.findElement(By.name("fulfillment[shipping_method]"));
		 Select sel = new Select(dropdown);
		 sel.selectByVisibleText("Worldwide - $5.00 USD");
	}
	catch (Exception e) {
		e.printStackTrace();
	   
	}}

	@When("Click Make payment button")
	public void click_make_payment_button() throws InterruptedException {
		try {
		 driver.findElement(By.xpath("//button[text()='Make payment']")).click();
		 Thread.sleep(3000);

	}catch (Exception e) {
 e.printStackTrace();
}
}}