package com.learnautomation.testcases;



import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.LoginPage;
import com.learnautomation.utility.ExcelDataProvider;
import com.learnautomation.utility.Helper;

public class LoginTestSwag extends BaseClass {

	@Test
	public void loginApp() {

		
		
		logger = report.createTest("Login to SauceDemo");

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		logger.info("App started");
		loginPage.loginToSwag(excel.getStringData("login", 0, 0), excel.getStringData("login", 0, 1));
		logger.pass("Test Success");
		
		
		
		
	}

}
