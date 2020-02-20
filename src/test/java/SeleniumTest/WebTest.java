package SeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import SeleniumSupport.Helper;

public class WebTest {
	WebDriver driver;
	
	@BeforeTest
	public void InitializeBrowser() {
		driver = new ChromeDriver();
		new Helper(driver).GetURL();
	}
	
	@Test
	public void Test1() {
		Helper helper = new Helper(driver);
		
		helper.Click_JavaScriptAlerts();
		helper.Click_JSConfirm();
		helper.Click_OK();
		helper.Check_Result("You clicked: Ok");
	}
	
	@AfterTest
	public void TerminateBrowser() {
		driver.quit();
	}
	
}
