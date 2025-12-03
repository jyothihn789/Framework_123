package Execution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Goibibo {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		String monthandyear ="February 2026";
		int date=25;
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath("//span[@class=\"logSprite icClose\"]")).click();
		driver.findElement(By.xpath("//span[text()=\"Departure\"]")).click();
		
		
		for(;;) {
			try {
				driver.findElement(By.xpath("//div[text()='"+monthandyear+"']/ancestor::div[@class=\"DayPicker-Month\"]/descendant::p[text()='"+date+"']")).click();
			} catch (Exception e) {
				driver.findElement(By.xpath("//span[@class=\"DayPicker-NavButton DayPicker-NavButton--next\"]")).click();
			}
		}
	}

}
