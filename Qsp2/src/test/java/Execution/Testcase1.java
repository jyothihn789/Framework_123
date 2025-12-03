package Execution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testcase1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//1. Launch browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//2. Navigate to url 'http://automationexercise.com'
		driver.get("https://automationexercise.com/");
		//4. Click on 'Signup / Login' button
		driver.findElement(By.xpath("//a[@href=\"/login\"]")).click();
		Thread.sleep(2000);
		//6. Enter name and email address
		driver.findElement(By.name("name")).sendKeys("Shubhankari");
		
		driver.findElement(By.xpath("(//input[@type=\"email\"])[2]")).sendKeys("shubha127@gmail.com");
		//7. Click 'Signup' button
		driver.findElement(By.xpath("//button[@data-qa=\"signup-button\"]")).click();
		Thread.sleep(2000);
		//9. Fill details: Title, Name, Email, Password, Date of birth
		driver.findElement(By.xpath("(//input[@type=\"radio\"])[2]")).click();
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("shubha@786");
		WebElement dropdown = driver.findElement(By.id("days"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("23");
		WebElement dropdown1 = driver.findElement(By.id("months"));
		Select select1 = new Select(dropdown1);
		select1.selectByVisibleText("October");
		Thread.sleep(2000);
		WebElement dropdown2 = driver.findElement(By.id("years"));
		Select select2 = new Select(dropdown2);
		select2.selectByVisibleText("1999");
		driver.findElement(By.xpath("//option[contains(text(),'1999')]")).click();
		//10. Select checkbox 'Sign up for our newsletter!'
		driver.findElement(By.id("newsletter")).click();
		//11. Select checkbox 'Receive special offers from our partners!'
		driver.findElement(By.id("optin")).click();
		driver.findElement(By.id("first_name")).sendKeys("Shubhankari");
		driver.findElement(By.id("last_name")).sendKeys("Dash");
		driver.findElement(By.id("company")).sendKeys("Infosys");
		driver.findElement(By.id("address1")).sendKeys("Bellandur,Infosys,Banglore");
		driver.findElement(By.id("address2")).sendKeys("Banglore,India");
		driver.findElement(By.xpath("//option[contains(text(),'India')]")).click();
		driver.findElement(By.id("state")).sendKeys("Karnataka");
		driver.findElement(By.id("city")).sendKeys("Banglore");
		driver.findElement(By.id("zipcode")).sendKeys("560037");
		driver.findElement(By.id("mobile_number")).sendKeys("7610961234");	
		driver.findElement(By.xpath("//button[contains(text(),'Create Account')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),' Delete Account')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();
		driver.quit();
	}

}
