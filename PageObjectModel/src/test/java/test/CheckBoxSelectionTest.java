package test;

import java.util.concurrent.TimeUnit;

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

import pages.TableDemoPage;
import supplier.DriverFactory;

public class CheckBoxSelectionTest {
	
	private WebDriver driver;
	private TableDemoPage tableDemoPage;
	
	@BeforeTest
	@Parameters("browser")
	public void setDriver(@Optional("chrome")String browser)
	{
		this.driver=DriverFactory.getDriver(browser);
		this.tableDemoPage= new TableDemoPage(driver);
	}
	
	@Test(dataProvider ="gender")
	public void tableRowTest(String gender)
	{
		tableDemoPage.gotTo();
		tableDemoPage.selectRows(gender);
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
