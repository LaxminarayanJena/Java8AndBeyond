package tests;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.google.common.util.concurrent.Uninterruptibles;

import supplier.DriverFactory;

public class HoverableDropDownTest {


	private WebDriver driver;
	private Actions actions;
	@BeforeTest
	@Parameters("browser")
	public void setDriver(@Optional("chrome")String browser)
	{
		this.driver=DriverFactory.getDriver(browser);
		this.actions= new Actions(driver);
		
}
	
	@Test(dataProvider="linkProvider")
	public void  dropDownTest(String path)
	{
		this.driver.get("https://www.codeply.com/go/bp/6FC76YQ4Nh#");
		this.driver.manage().window().maximize();
		Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
		this.driver.switchTo().frame("myframe");
		String[] split =  path.split("=>");
		
		Arrays.stream(split)
		.map(s->s.trim())
		.map(s->By.linkText(s))
		.map(by-> driver.findElement(by))
		.map(ele -> actions.moveToElement(ele))
		.forEach(a-> a.perform());
		
	}
	
	@DataProvider(name ="linkProvider")
	public Object[]  testdata()
	{
		return new Object[]
		{
			"Dropdown2 => Dropdown2 Link 4 ",
			"Dropdown => Dropdown Link 4 => Drowdown Submenu Link 4.1 ",
		};
	}
	
	@AfterTest
	public void quitDriver()
	{
		this.driver.quit();
	}
	
}