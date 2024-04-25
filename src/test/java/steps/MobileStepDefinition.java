package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 public class MobileStepDefinition{
public  ChromeDriver driver;
public WebDriverWait wait;
@Given("Launch the browser")
public void Launch_the_browser() {
	driver =new ChromeDriver();
}
@And("Load the url")
public void Load_the_url(){
	
	driver.get("https://demoblaze.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
}
		@When("Click on the first resulting mobile phone")
		public void Click_on_the_first_resulting_mobile_phone() {
			driver.findElement(By.xpath("//a[@class='herfch']")).click();
		    
		}

		@And("Click on Add to cart")
		public void click_on_Add_to_cart() {
			driver.findElement(By.linkText("Add to cart")).click();
		}

		@And("Accepting the alert")
		public void Accepting_the_alert1() throws InterruptedException{
			wait.until(ExpectedConditions.alertIsPresent());
			driver.switchTo().alert().accept();
			
			//driver.findElement(By.xpath("//p[text()='Hair Beauty Bath']")).click();
		   
		}

		@And("Click on the cart link")
		public void click_on_the_cart_link() {
			 driver.findElement(By.xpath("//a[@id='cartur']")).click();
			//wait.until(ExpectedConditions.visibilityOf(Addtocart));
			//Addtocart.click();
		}

		@And("Click Place Order")
		public void Click_Place_order() {
			 driver.findElement(By.xpath("//button[@type='button'")).click();
		   
		}

		@And("Enter the name as(.*)$")
		public void enterName(String name) {
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(name);
		   
		}
		@And("Enter the CreditcardNumber as(.*)$")
		public void Enter_CreditcardNumber(String ccno) {
		driver.findElement(By.xpath("//input[@id='card']")).sendKeys(ccno);
		   
		}

		@When("Click on the purchase button")
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
