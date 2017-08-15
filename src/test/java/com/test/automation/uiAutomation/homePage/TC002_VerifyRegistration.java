package com.test.automation.uiAutomation.homePage;

	import org.apache.log4j.Logger;
	import org.junit.AfterClass;
	import org.testng.Assert;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;
	import com.test.automation.uiAutomation.testBase.TestBase;
	import com.test.automation.uiAutomation.uiActions.HomePage;

	public class TC002_VerifyRegistration extends TestBase {

		public static final Logger log = Logger.getLogger(TC002_VerifyRegistration.class.getName());



		 
		@BeforeTest
		public void setUp() {
			init();
		}

		@Test
		public void VerifyRegistration() {
			log.info("-----Starting TC VerifyRegistration-----");


		@AfterClass
		public void endTest() {
			driver.quit();
		}

	}

}
