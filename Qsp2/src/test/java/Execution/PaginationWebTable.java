package Execution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaginationWebTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2700)");
		
		WebElement page3 = driver.findElement(By.xpath("//a[text()='3']"));
		page3.click();
		
		WebElement router = driver.findElement(By.xpath("//table[@id='productTable']//tr[td[text()='Router']]//input[@type='checkbox']"));
		router.click();
		
		WebElement price = driver.findElement(By.xpath("//tr[td[text()='Router']]/td[3]"));
		System.out.println("Price of the router: " + price.getText());
		driver.quit();
		
	}

}
