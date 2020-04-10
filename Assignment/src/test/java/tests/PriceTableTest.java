package tests;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.google.common.util.concurrent.Uninterruptibles;

import pages.PriceTable;
import supplier.DriverFactory;

public class PriceTableTest {
	
	private WebDriver driver;
	@BeforeTest
	@Parameters("browser")
	public void setDriver(@Optional("chrome")String browser)
	{
		this.driver=DriverFactory.getDriver(browser);

}
	
	@Test
	public void  minPriceTest()
	{
		PriceTable p= new PriceTable(driver);
		p.selectMinPriceRow();
		String status =p.getStatus();
		Assert.assertEquals("PASS", status);
		Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
	}
	
	@AfterTest
	public void quitDriver()
	{
		this.driver.quit();
	}
	
}
