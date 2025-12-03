package Execution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_WebElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Shubhankari%20Dash/OneDrive/Desktop/iframe.html");
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.id("FR1")));
		driver.findElement(By.id("newsletter-email")).sendKeys("aaa@test.com");
		driver.findElement(By.id("newsletter-subscribe-button")).click();
		
		
	}

}
