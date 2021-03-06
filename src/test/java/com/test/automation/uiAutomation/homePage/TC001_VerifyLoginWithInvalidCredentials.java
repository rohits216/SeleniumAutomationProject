package com.test.automation.uiAutomation.homePage;

import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.test.automation.uiAutomation.testBase.TestBase;
import com.test.automation.uiAutomation.uiActions.HomePage;

public class TC001_VerifyLoginWithInvalidCredentials extends TestBase {

	public static final Logger log = Logger.getLogger(TC001_VerifyLoginWithInvalidCredentials.class.getName());


	HomePage homepage;
	 
	@BeforeTest
	public void setUp() {
		init();
	}

	@Test
	public void VerifyLoginWithInvalidCredentials() {
		log.info("-----Starting TC VerifyLoginWithInvalidCredentials-----");
		homepage = new HomePage(driver);
		homepage.loginToApplication("test@gmail.com", "password");
		Assert.assertEquals(homepage.getInvalidLoginText(), "Authentication failed.");
		log.info("-----Finished TC VerifyLoginWithInvalidCredentials------");
	}

	@AfterClass
	public void endTest() {
		driver.quit();
	}

}
