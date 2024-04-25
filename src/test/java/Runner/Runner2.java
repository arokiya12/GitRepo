package Runner;
import org.testng.annotations.BeforeTest;

	import Base.BaseClass;
	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;
	@CucumberOptions(
			features="src/test/java/Features/PurchaseMobile.feature",glue="steps/MobileStepDefinition",monochrome=true,publish=true )
	public class Runner2 extends BaseClass{

}
