import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;

import org.omg.Messaging.SyncScopeHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.google.common.util.concurrent.Uninterruptibles;

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
	
	@Test(dataProvider ="gender")
	public void googleTest(String gender)
	{
		this.driver.get("https://vins-udemy.s3.amazonaws.com/java/html/java8-stream-table.html");		
	    /* this.driver.findElements(By.tagName("input"))
	    .stream()
	    .forEach(WebElement::click);
	    */
		this.driver.findElements(By.tagName("tr"))
		.stream()
		.skip(1)
		.map(tr-> tr.findElements(By.tagName("td")))
		.filter(tdList ->tdList.size()==4)//not empty tr
		.filter(tdList->tdList.get(1).getText().equalsIgnoreCase(gender))
		.map(tdList ->tdList.get(3)) ///give me the 4th cell
		.map(td ->  td.findElement(By.tagName("input")))
		.forEach(WebElement::click);
		Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);	
		
	}
	
	@DataProvider(name="gender")
	public Object[] testdata()
	{
		return new Object[]
				{
						"male",
						"female"
				};
				
	}
	
	@AfterTest
	public void quitDriver()
	{
		this.driver.quit();
	}
	
}
