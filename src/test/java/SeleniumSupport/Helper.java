package SeleniumSupport;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Helper extends Locators {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor jsx;

	public Helper(WebDriver d) {
		driver = d;
		wait = new WebDriverWait(driver, 10);
		jsx = (JavascriptExecutor) driver;
	}

	public void GetURL() {
		driver.get(url);
	}

	public void Click_JavaScriptAlerts() {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(JavaScriptAlerts))).click();
			System.out.println("Java Script Alert is verified and clicked");
		} catch (Exception e) {
			Assert.fail(e.toString());
		}
	}

	public void Click_JSConfirm() {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(JSConfirm))).click();
			System.out.println("JS Confirm is verified and clicked");
		} catch (Exception e) {
			Assert.fail(e.toString());
		}
	}

	public void Click_OK() {
		try {
			driver.switchTo().alert().accept();
			System.out.println("OK Button is verified and clicked");
		}catch (Exception e) {
			Assert.fail(e.toString());
		}
	}

	public void Check_Result(String ExpectedText) {
		String ActualText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Result))).getText();
		Assert.assertEquals(ActualText, ExpectedText);
		System.out.println("Result text is Validated");
	}
}
