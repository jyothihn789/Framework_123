package Execution;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Working_With_ScreenShots_WebElement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		WebElement searchtxt=driver.findElement(By.id("small-searchterms"));
		File srcfile=searchtxt.getScreenshotAs(OutputType.FILE);
		File destFile=new File("./ScreenShots/SearchField.png");
		FileHandler.copy(srcfile, destFile);
		System.out.println("Screenshot on the webelement searchtxt field was sucessfull");
		
		WebElement searchbtn = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
		File src=searchbtn.getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreenShots/Searchbtn.png");
		FileHandler.copy(src, dest);
		driver.close();
	}

}
