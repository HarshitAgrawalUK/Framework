package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	public WebDriver driver;
	
	//new comment from Harshit
	
	public LoginPage(WebDriver ldriver)
	{
	this.driver= ldriver;
	}
	
	@FindBy (name = "user-name") WebElement uname;
	@FindBy (name = "password") WebElement pass;
	@FindBy (xpath = "//input[@name='login-button']") WebElement LoginButton;
			
	
	public void loginToSwag(String username, String passwordForApp)
	{
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
		}
			uname.sendKeys(username);
			pass.sendKeys(passwordForApp);
		    LoginButton.click();
	}
	
	
}
