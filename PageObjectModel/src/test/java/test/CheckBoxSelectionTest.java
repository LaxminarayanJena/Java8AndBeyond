package test;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;

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
	
	@Test(dataProvider ="criteriaProvider")
	public void tableRowTest(Predicate<List<WebElement>> searchCriteria)
	{
		tableDemoPage.gotTo();
		//tableDemoPage.selectRows(gender);
		tableDemoPage.selectRows(searchCriteria);
		Uninterruptibles.sleepUninterruptibly(1, TimeUnit.SECONDS);	
		
	}
	
	
	@DataProvider(name="criteriaProvider")
	public Object[] testdata()
	{
		Predicate<List<WebElement>> allMale=(l) ->l.get(1).getText().equalsIgnoreCase("male");
		Predicate<List<WebElement>> allFemale=(l) ->l.get(1).getText().equalsIgnoreCase("female");
		Predicate<List<WebElement>> allGender=allMale.or(allFemale);
		return new Object[]
				{
						allMale,
						allFemale,
						allGender
				};
				
	}
	
	@AfterTest
	public void quitDriver()
	{
		this.driver.quit();
	}
	
	
	

}
