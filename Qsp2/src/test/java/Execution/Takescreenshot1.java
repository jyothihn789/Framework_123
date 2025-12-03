package Execution;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Takescreenshot1 {

	public static void main(String[] args) throws  IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");
		String parentWindow = driver.getWindowHandle();
		String child=null;
		driver.findElement(By.name("q")).sendKeys("Iphone");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class=\"oleBil\"])[1]")).click();
		driver.findElement(By.xpath("(//div[@class=\"KzDlHZ\"])[1]")).click();
		Set<String> allWindows = driver.getWindowHandles();
		for (String Win : allWindows) {
			if(!Win.equals(parentWindow)) {
				child=Win;
			}
		}
		driver.switchTo().window(child);
		
		
		
		
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src1=ts.getScreenshotAs(OutputType.FILE);
		File dest1=new File("./ScreenShots/SearchPage1.png");
		FileHandler.copy(src1, dest1);
		System.out.println("page launched sucessfully");
		
	}
}
