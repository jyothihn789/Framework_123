package Execution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auttosuggestions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://demowebshop.tricentis.com/");
		
		//driver.findElement(By.id("small-searchterms")).sendKeys("compu");
		//Thread.sleep(2000);
		
		//driver.findElement(By.xpath("(//a[contains(text(),'Build your own computer')])[2]")).click();
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("puma");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[contains(text(),'puma')])[3]")).click();

	}

}
