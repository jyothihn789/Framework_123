package Execution;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		TakesScreenshot ts =(TakesScreenshot)driver;
		File srcfile=ts.getScreenshotAs(OutputType.FILE);
		File destfile=new File("./ScreenShots/Homepage.png");
		FileHandler.copy(srcfile, destfile);
		System.out.println("Homepage launched sucessfully");
		driver.findElement(By.id("small-searchterms")).sendKeys("mobile");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreenShots/SearchPage.png");
		FileHandler.copy(src, dest);
		driver.close();

	}

}
