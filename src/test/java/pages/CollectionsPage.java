package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Testng.BaseClass;
import io.cucumber.java.en.When;

public class CollectionsPage extends Base.BaseClass {

		@When("Click Products under Hairproducts")
		public void click_products_under_hairproducts() {
			try {
			WebElement hairproducts = driver.findElement(By.xpath("(//p[text()='Products']/following::p)[2]"));
		 wait.until(ExpectedConditions.visibilityOf(hairproducts)).click();
			
			} catch(Exception e) {
			System.out.println(e);
		}}

		@When("Click Hair BeautyPath Link")
		public void click_hair_beauty_path_link() {
			try {
				
		WebElement beauty= 	driver.findElement(By.xpath("//p[text()='Hair Beauty Bath']"));
			driver.executeScript("argumnets[0].click();", beauty);
		   
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
