package Execution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes_byname {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Shubhankari%20Dash/OneDrive/Desktop/iframe.html");
		Thread.sleep(2000);
		driver.switchTo().frame("frame1");
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		driver.findElement(By.linkText("Google")).click();
	}

}
