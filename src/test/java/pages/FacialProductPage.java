package pages;

import org.openqa.selenium.By;

import Testng.BaseClass;
import io.cucumber.java.en.And;

public class FacialProductPage extends Base.BaseClass {
@And("Click Products uder FacialProduct")
	public void ClickFacialProduct(){
		
		try {
			driver.findElement(By.xpath("///p[text()='Facial Products'/following::p")).click();
		}catch (Exception e) {
			System.out.println(e);
		}
		// TODO Auto-generated method stub

}
@And("Click LipFantastic Link")
public void clicklipFantastic(){
	
	try {
		driver.findElement(By.xpath("//p[text()=;Lip Fantastic']")).click();
	}catch (Exception e) {
		System.out.println(e);
	}
}}
