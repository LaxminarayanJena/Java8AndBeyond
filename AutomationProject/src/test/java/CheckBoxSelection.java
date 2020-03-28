import java.util.List;
import java.util.function.Predicate;

import org.omg.Messaging.SyncScopeHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import predicate.Rules;
import supplier.DriverFactory;

public class CheckBoxSelection {
	
	//A stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result.

	private WebDriver driver;
	@BeforeTest
	@Parameters("browser")
	public void setDriver(@Optional("chrome")String browser)
	{
		this.driver=DriverFactory.getDriver(browser);

}
	//do not allow blank links
	// do not allow links containing s
	//convert link text to uppercase
	//print on the console
	
	@Test
	public void googleTest()
	{
		this.driver.get("https://vins-udemy.s3.amazonaws.com/java/html/java8-stream-table.html");		
	    this.driver.findElements(By.tagName("input"))
	    .stream()
	    .forEach(WebElement::click);
	}
	
	@AfterTest
	public void quitDriver()
	{
		this.driver.quit();
	}
	
}
