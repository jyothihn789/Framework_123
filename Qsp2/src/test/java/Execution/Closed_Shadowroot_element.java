package Execution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Closed_Shadowroot_element {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui/login?scenario=1");
		Thread.sleep(2000);
		
		//login attached text	
		driver.findElement(By.xpath("//h1[text()='Login']")).click();
		Actions action = new Actions(driver);
		action.sendKeys(Keys.TAB).perform();
		Thread.sleep(2000);
		action.sendKeys("Shubhankari").perform();
		action.sendKeys(Keys.TAB).perform();
		Thread.sleep(2000);
		action.sendKeys("Dash").perform();
	}

}
