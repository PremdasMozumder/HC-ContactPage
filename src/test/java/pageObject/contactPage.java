package pageObject;

import base.setup;
import org.apache.commons.lang.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import stepDefinitions.Hook;


public class contactPage extends setup{


	public contactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
        setup.driver = driver;
	}

	public void verifyHomepageTitle() {
		String act = driver.getTitle();
		String exp = "Confirm"; // comes from BA
        Assert.assertEquals(exp, act);
	}

	@FindBy(how=How.XPATH, using = "//button[@aria-label='Close']")
	public WebElement allcookies;
	@FindBy(how= How.NAME, using = "et_pb_contact_name_0")
	public WebElement nameLocator;
	@FindBy(how= How.XPATH, using = "//input[@id='et_pb_contact_company_0']")
	public WebElement companyLocator;
	@FindBy(how= How.ID, using = "et_pb_contact_email_0")
	public WebElement emailLocator;
	@FindBy(how= How.ID, using = "et_pb_contact_phone_number_0")
	public WebElement phonenumberLocator;
	@FindBy(how= How.XPATH, using = "//textarea[@name='et_pb_contact_message_0']")
	public WebElement messageLocator;
	@FindBy(how= How.XPATH, using = "//button[@type='submit']")
	public WebElement submitbuttonLocator;
	
	public void acceptCookies() {
		allcookies.click();
	}

	public void entername() {
		nameLocator.sendKeys("qainterview");
	}

	public void entercompanyname() {

		companyLocator.sendKeys("realcme");
	}

	public void enteremailaddress() {
		emailLocator.sendKeys("winie@tryninja.io");
	}

	public void enterphonenumber() {
		phonenumberLocator.sendKeys("9999999999");
	}

	public void enterbriefmessage() {
		messageLocator.sendKeys("This is an assignment for the QA position. Please ignore.");
	}

	public void clickonsubmit() {
		submitbuttonLocator.click();	
	}

}
