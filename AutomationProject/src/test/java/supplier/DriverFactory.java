package supplier;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	
	private static final Supplier<WebDriver> chromeSuplier=()->
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe");
		return new ChromeDriver();
	};

	private static final Supplier<WebDriver> firefoxSuplier=()->
	{
		System.setProperty("webdriver.gecko.driver","");
		return new FirefoxDriver();
	};
	
	private static final Map<String,Supplier<WebDriver>> MAP= new HashMap<>();
	
	static
	{
		MAP.put("chrome",chromeSuplier );
		MAP.put("firefox", firefoxSuplier);
	}
	
	public static WebDriver getDriver(String browser)
	{
		return MAP.get(browser).get();
		
	}
	
}
