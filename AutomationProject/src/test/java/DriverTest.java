import java.util.List;
import java.util.function.Predicate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import supplier.DriverFactory;

public class DriverTest {
	
	private WebDriver driver;
	@BeforeTest
	@Parameters("browser")
	public void setDriver(@Optional("chrome")String browser)
	{
		this.driver=DriverFactory.getDriver(browser);

}
	
	@Test
	public void googleTest()
	{
		this.driver.get("http://google.com/");
		//this.driver.findElements(By.tagName("a")).forEach(e -> System.out.println(e.getText()));
		
		List<WebElement> elements =this.driver.findElements(By.tagName("a"));
		Predicate<WebElement> isBlank=(e)->e.getText().trim().length()==0;
		
		System.out.println("Before::"+elements.size());
		elements.removeIf(isBlank);
		System.out.println("After::"+elements.size());
		elements.forEach(e -> System.out.println(e.getText()));
	}
	
	@AfterTest
	public void quitDriver()
	{
		this.driver.quit();
	}
	
}
