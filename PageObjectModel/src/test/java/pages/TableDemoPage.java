package pages;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.google.common.util.concurrent.Uninterruptibles;

public class TableDemoPage {
	
	private final WebDriver driver;
	
	public TableDemoPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void gotTo()
	{
		this.driver.get("https://vins-udemy.s3.amazonaws.com/java/html/java8-stream-table.html");
	}

	
	public void selectRows(Predicate<List<WebElement>> predicate)
	{
		this.driver.findElements(By.tagName("tr"))
		.stream()
		.skip(1)
		.map(tr-> tr.findElements(By.tagName("td")))
		.filter(tdList ->tdList.size()==4)//not empty tr
		//.filter(tdList->tdList.get(1).getText().equalsIgnoreCase(gender))
		.filter(predicate)
		.map(tdList ->tdList.get(3)) ///give me the 4th cell  td containing checkbox
		.map(td ->  td.findElement(By.tagName("input")))
		.forEach(WebElement::click);
		Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);	
	}
	

}
