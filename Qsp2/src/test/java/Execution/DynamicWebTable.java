package Execution;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2200)");
		
		List<WebElement> allrows = driver.findElements(By.xpath("//table[@id=\"taskTable\"]/tbody/tr"));
		
		
		for(WebElement row : allrows) {
			String rows = row.getText();
			if(rows.contains("Firefox"))
			{
				System.out.println(rows);
			}
		}
		driver.quit();
	}

}
