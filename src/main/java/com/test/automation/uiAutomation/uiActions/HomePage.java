package com.test.automation.uiAutomation.uiActions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public static final Logger log = Logger.getLogger(HomePage.class.getName());

	
	WebDriver driver;
	@FindBy(xpath=".//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	WebElement signIn;
	//test
	
	@FindBy(xpath=".//*[@id='email']")  
	WebElement loginEmailAddress;
	
	@FindBy(xpath=".//*[@id='passwd']")
	WebElement loginPassword;
	
	@FindBy(xpath=".//*[@id='SubmitLogin']")
	WebElement submitButton;
	
	@FindBy(xpath=".//*[@id='center_column']/div[1]/ol/li")
	WebElement authenticationFailed;
	
	//---register----
	
	@FindBy(xpath=".//*[@id='email_create']")
	WebElement email_create;
	
	@FindBy(xpath=".//*[@id='SubmitCreate']")
	WebElement SubmitCreate;
	
	@FindBy(xpath=".//*[@id='customer_firstname']")
	WebElement customer_firstname;
	
	@FindBy(xpath=".//*[@id='customer_lastname']]")
	WebElement customer_lastname;
	
	@FindBy(xpath=".//*[@id='email']")
	WebElement email;
	
	@FindBy(xpath=".//*[@id='passwd']")
	WebElement password;
	
	@FindBy(xpath=".//*[@id='firstname']")
	WebElement firstname;
	
	@FindBy(xpath=".//*[@id='address1']")
	WebElement address1;
	
	@FindBy(xpath=".//*[@id='city']")
	WebElement city;
	
	@FindBy(xpath=".//*[@id='id_state']")
	WebElement id_state;
	
	@FindBy(xpath=".//*[@id='postcode']")
	WebElement postcode;
	
	@FindBy(xpath=".//*[@id='id_country']")
	WebElement id_country;
	
	@FindBy(xpath=".//*[@id='phone_mobile']")
	WebElement phone_mobile;
	
	@FindBy(xpath=".//*[@id='submitAccount']")
	WebElement submitAccount;
	

	public HomePage (WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void loginToApplication(String emailAddress, String password) {
		signIn.click();
		log.info("Click on SignIn Object :"+ signIn.toString());
		loginEmailAddress.sendKeys(emailAddress);
		log.info("Entered email :"+ loginEmailAddress.toString());
		loginPassword.sendKeys(password);
		log.info("Entered Password :"+loginPassword.toString());
		submitButton.click();
		log.info("Clicked on Submit button"+submitButton.toString());
	}
	
	public String getInvalidLoginText() {
		log.info("Error message is :"+ authenticationFailed.getText());
		return authenticationFailed.getText();
	}
	
	
	public void registerUser(String email_create) {
		signIn.click();
		log.info("Click on SignIn Object :"+ signIn.toString());
		this.email_create.clear();
		this.email_create.sendKeys(email_create);
		
	}
	
	
	
	
}
