package simple;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PracticeConfigData {

	Properties pro;
	WebDriver driver;

	public PracticeConfigData() throws IOException {

		File src = new File("./Config/Config.properties");

		FileInputStream fis = new FileInputStream(src);

		pro = new Properties();

		pro.load(fis);

	}

	public String getBrowser() {
		return pro.getProperty("Browser");
	}

	public String getAppUrl() {
		return pro.getProperty("qaUrl");
	}

	public String getKeyValue(String value) {

		return pro.getProperty(value);

	}

	@Test
	public void login() throws IOException {
		//PracticeConfigData config = new PracticeConfigData();

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(getAppUrl());
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@name='login-button']")).click();
		driver.quit();

	}

}
