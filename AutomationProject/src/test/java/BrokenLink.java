import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import supplier.DriverFactory;

public class BrokenLink {
	

	private WebDriver driver;
	@BeforeTest
	@Parameters("browser")
	public void setDriver(@Optional("chrome")String browser)
	{
		this.driver=DriverFactory.getDriver(browser);

}
	@Test
	public void BrokenLinkTest()
	{
		this.driver.get("https://the-internet.herokuapp.com/broken_images");		
	}
	
	@AfterTest
	public void quitDriver()
	{
		this.driver.quit();
	}
	
}
