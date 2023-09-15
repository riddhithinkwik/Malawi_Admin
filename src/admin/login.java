package admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;


@Test
public class login {

	static WebDriver driver;

@Test
	public void openAdminportal() {

		System.setProperty("webdriver.chrome.driver", "/Users/krunal/Desktop/chromedriver-mac-x64/chromedriver");
		System.out.println("Open Browser");
		driver = new ChromeDriver();
		
		driver.get("http://192.168.1.32:5173/login");
		driver.manage().window().maximize();

	}

@AfterTest
public void loginpage() {
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys("admin@mei.org.mw");
	
	WebElement password = driver.findElement(By.id("password"));
	password.sendKeys("1234567890");
	
	WebElement loginbtn  = driver.findElement(By.id(":r2:"));
	loginbtn.click();
	
	
}

}