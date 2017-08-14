package com.test.automation.uiAutomation.homePage;

import org.junit.AfterClass;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.test.automation.uiAutomation.testBase.TestBase;
import com.test.automation.uiAutomation.uiActions.HomePage;

public class TC001_VerifyLoginWithInvalidCredentials extends TestBase {


	HomePage homepage;
	 
	@BeforeTest
	public void setUp() {
		init();
	}

	@Test
	public void VerifyLoginWithInvalidCredentials() {
		homepage = new HomePage(driver);
		homepage.loginToApplication("test@gmail.com", "password");
		Assert.assertEquals(homepage.getInvalidLoginText(), "Authentication failed.");
	}

	@AfterClass
	public void endTest() {
		driver.quit();
	}

}
