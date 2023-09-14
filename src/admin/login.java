package admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


@Test
public class login {

	static WebDriver driver;

@BeforeTest
	public void openAdminportal() {

		System.setProperty("webdriver.chrome.driver", "/Users/krunal/Downloads/chromedriver_mac64_new/chromedriver");

		driver = new ChromeDriver();

		driver.get("https://www.mei.org.mw/contact_us.html");
		driver.manage().window().maximize();

	}
}