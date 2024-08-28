package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class LoginTest {
	
	public WebDriver driver;


	@Test
	public void login_test() throws InterruptedException{

		driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");

		driver.findElement(By.id("user-name")).sendKeys("standard_user");

		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();

		Thread.sleep(1000);
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
