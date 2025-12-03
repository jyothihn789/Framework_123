package Execution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
//		Actions act=new Actions(driver);
//		act.scrollByAmount(0, 1500).perform();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1500)");
		
		WebElement upload = driver.findElement(By.id("singleFileInput"));
		upload.sendKeys("‪C:\\Users\\Shubhankari Dash\\OneDrive\\Desktop\\XPath.docx");
		
		
	}
}

