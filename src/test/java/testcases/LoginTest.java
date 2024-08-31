package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

	public  WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");

		ChromeOptions ops = new ChromeOptions();

		ops.addArguments("--headless");
		ops.addArguments("--no-sandbox");
		ops.addArguments("--disable-dev-shm-usage");

		driver = new ChromeDriver(ops);

	}


	@Test
	public void login_test() throws InterruptedException{


		driver.get("https://www.saucedemo.com/");

		driver.findElement(By.id("user-name")).sendKeys("standard_user");

		driver.findElement(By.id("password")).sendKeys("secret_sauce");

		driver.findElement(By.id("login-button")).click();

		Thread.sleep(1000);

	}

	@AfterMethod
	public void tearDown() {
		if(driver !=null) {
			driver.quit();
		}
		
	}

}
