package Execution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ksrtc {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://ksrtc.in/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 300);"); // Scrolls 500px down

		driver.findElement(By.xpath("//label[contains(text(),'Departure')]")).click();
		driver.findElement(By.xpath(
				"//span[text()='November']/ancestor::div[@class=\"ui-datepicker-group ui-datepicker-group-first\"]/descendant::a[text()='27']"))
				.click();

	}

}
