package tests;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Predicate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import static tests.PaymentScreenActions.*;

import com.google.common.util.concurrent.Uninterruptibles;

import pages.PaymentScreenPage;
import pages.PriceTable;
import supplier.DriverFactory;

public class PaymentScreenTest {
	
	private WebDriver driver;
	private PaymentScreenPage paymentScreenPage;
	@BeforeTest
	@Parameters("browser")
	public void setDriver(@Optional("chrome")String browser)
	{
		this.driver=DriverFactory.getDriver(browser);
		this.paymentScreenPage = new PaymentScreenPage(driver);

}
	
	@Test(dataProvider="criteriaProvider")
	public void  paymentScreenTest(Consumer<PaymentScreenPage> consumer)
	{
		paymentScreenPage.goTo();
		consumer.accept(paymentScreenPage);
	}
	
	
	@DataProvider(name ="criteriaProvider")
	public Object[]  testdata()
	{
		return new Object[]
		{
			validCC.andThen(buy).andThen(sucessfulPurchase),
			freeCoupon.andThen(buy).andThen(buy).andThen(sucessfulPurchase),
			discountedCoupon.andThen(validCC).andThen(buy).andThen(sucessfulPurchase),
			invalidCC.andThen(buy).andThen(failedPurchase),
			invalidCC.andThen(discountedCoupon).andThen(buy).andThen(failedPurchase),
			buy.andThen(failedPurchase)
			
		};
	}

	
	@AfterTest
	public void quitDriver()
	{
		this.driver.quit();
	}
	
}
