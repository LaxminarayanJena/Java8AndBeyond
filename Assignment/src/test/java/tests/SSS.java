package tests;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.google.common.util.concurrent.Uninterruptibles;

import supplier.DriverFactory;

public class SSS {

	private WebDriver driver;
	private Actions actions;
	@BeforeTest
	@Parameters("browser")
	public void setDriver(@Optional("chrome")String browser)
	{
		this.driver=DriverFactory.getDriver(browser);
		this.actions= new Actions(driver);
		
}
	
	@Test()
	public void  dropDownTest() throws InterruptedException
	{
		this.driver.get("https://www.codeply.com/go/bp/6FC76YQ4Nh#");
		this.driver.manage().window().maximize();
		
	
		this.driver.switchTo().frame("myframe");
		WebElement ele=this.driver.findElement(By.linkText("Dropdown"));
		
		Actions action =new Actions(driver);
		action.moveToElement(ele).perform();
		
		
		WebElement ele2=this.driver.findElement(By.linkText("Dropdown Link 4"));
		action.moveToElement(ele2).perform();
		
		
		
		
		WebElement ele3=this.driver.findElement(By.linkText("Dropdown Submenu Link 4.1"));
		action.moveToElement(ele3).perform();
		Thread.sleep(3000);
	
	}
	
	
	@AfterTest
	public void quitDriver()
	{
		this.driver.quit();
	}
	
}