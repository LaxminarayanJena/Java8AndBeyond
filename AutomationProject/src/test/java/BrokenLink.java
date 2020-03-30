import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import supplier.DriverFactory;
import util.LinkUtil;

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
		
		System.out.println("Before::"+LocalDateTime.now());
		
		this.driver.get("https://the-internet.herokuapp.com/broken_images");
		this.driver.findElements(By.xpath("//*[@src]"))
		.stream()
		.parallel()
		.map(e->e.getAttribute("src"))
		.filter(src->LinkUtil.getResponseCode(src)!=200)
		.forEach(src->{
			System.out.println(LinkUtil.getResponseCode(src)+ "::"+ src);
		});
		
		System.out.println("After::"+LocalDateTime.now());
	}
	
	@AfterTest
	public void quitDriver()
	{
		this.driver.quit();
	}
	
}
