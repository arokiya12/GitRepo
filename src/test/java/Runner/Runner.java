package Runner;

import org.testng.annotations.BeforeTest;

import Base.BaseClass;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features="src/test/java/Features/PurchaseBeautiproducts.feature",glue="pages",monochrome=true,publish=true )
public class Runner extends BaseClass{

	@BeforeTest
	public void setValues() {
		// TODO Auto-generated method stub
		
		testName="HairBeautyproduct";
		testDescription="Verify order id of HairBeautyProducts";
		testAuthor="Arokiya";
		testCategory="regression";

	}
	

	}


