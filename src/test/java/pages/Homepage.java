package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.When;

public class Homepage  extends Base.BaseClass{

	@When("When click on shopnow button")
	public void when_click_on_shopnow_button() {
	
	try{
		WebElement shopnow = driver.findElement(By.xpath("(//a[text()='Shop now'])[1]"));
		
		driver.executeScript("arguments[0].click();",shopnow);
	    
		
	}
	catch(Exception e) {
		System.out.println(e);
	}

}
}