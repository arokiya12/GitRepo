package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TC_001Commerce  extends BaseclassMethods{

	@Test
	public void printorderId() throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver.findElement(By.linkText("Shop now")).click();
		driver.findElement(By.xpath("(//p[text()='Products']/following::p)[2]")).click();
		driver.findElement(By.xpath("//p[text()='Hair Beauty Bath']")).click();
		WebElement Addtocart = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		wait.until(ExpectedConditions.visibilityOf(Addtocart));
		Addtocart.click();
		 driver.findElement(By.xpath("//div[@class='cart-animation']")).click();
		 driver.findElement(By.linkText("Checkout")).click();
		 WebElement dropdown = driver.findElement(By.name("fulfillment[shipping_method]"));
		 Select sel = new Select(dropdown);
		 sel.selectByVisibleText("Worldwide - $5.00 USD");
		 driver.findElement(By.xpath("//button[text()='Make payment']")).click();
		 Thread.sleep(3000);
		 WebElement ordernumber = driver.findElement(By.xpath("//p[@class='font-color-light mb-2']"));
		 String text = ordernumber.getText();
		String[] split =  text.split(":");
		System.out.println("order number is:"+split[split.length-1]);
		 
	}



	}


