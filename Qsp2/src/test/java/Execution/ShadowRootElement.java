package Execution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowRootElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui/login?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[contains(text(),'Shadow Root Elements')]")).click();
		driver.findElement(By.xpath("(//section[contains(text(),'Shadow')])[2]")).click();
		Thread.sleep(2000);
		
		//shadow host --> Identify the host
		SearchContext shadow_host = driver.findElement(By.xpath("//form/div[1]")).getShadowRoot();	
		shadow_host.findElement(By.cssSelector("input[type='text']")).sendKeys("Shubhankari");
		SearchContext shadow_host_password = driver.findElement(By.xpath("//form/div[2]")).getShadowRoot();
		Thread.sleep(2000);
		shadow_host_password.findElement(By.cssSelector("input[type='text'")).sendKeys("Dash");
	}

}
