package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



import Base.BaseClass;
import io.cucumber.java.en.Then;

public class OrderPage extends BaseClass {


	@Then("Verify orderid and printorderid")
	public void verify_orderid_and_printorderid() {
		 WebElement ordernumber = driver.findElement(By.xpath("//p[@class='font-color-light mb-2']"));
		 String text = ordernumber.getText();
		String[] split =  text.split(":");
		System.out.println("order number is:"+split[split.length-1]);

	} ////catch(Exception e) {
		
	//	e.printStackTrace();
		
	

}
