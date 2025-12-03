package Execution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		//click on search button without entering text in search text field
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		//Handle the alert
		driver.switchTo().alert().accept();
		System.out.println("alert was handled sucessfully");
		
		driver.findElement(By.id("small-searchterms")).sendKeys("alert was handled");
		
	}

}
