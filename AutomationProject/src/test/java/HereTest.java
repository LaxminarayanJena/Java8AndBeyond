import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import util.LinkUtil;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import javax.script.*;
public class HereTest {

	public static void main(String[] args) throws ScriptException {
		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();				
	        driver.get("https://developer.here.com/documentation");		
	        driver.manage().window().maximize();				
	        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	        for(WebElement link:allLinks){
	        System.out.println(link.getText() + " - " + link.getAttribute("href"));
	        
	        
	        
	       
	      
	        driver.quit();
	}

}
}
