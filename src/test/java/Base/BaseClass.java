package Base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class BaseClass extends AbstractTestNGCucumberTests {
	public static ChromeDriver driver;
	public static WebDriverWait wait;
	public static ExtentReports extent;
		public String testName,testDescription,testAuthor,testCategory;
	@BeforeSuite
	public void startReport() {
ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/result.html");
	reporter.setAppendExisting(true);
	 extent = new ExtentReports();
	extent.attachReporter(reporter);
	
	}
	@BeforeClass
	public void assignTestDetails() {
	ExtentTest test = extent.createTest(testName,testDescription);
test.assignAuthor(testAuthor);
test.assignCategory(testCategory);

	}
	@AfterSuite
	public void stopReport() {
		extent.flush();
		
	}
	@BeforeMethod
	public void preCondition() {
		 driver =new ChromeDriver();
		driver.get("https://commercejs-demo-store.netlify.app/");
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	}
@AfterMethod
public void postCondition() {
	driver.quit();
}
}
