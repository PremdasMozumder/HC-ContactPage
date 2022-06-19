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

	@FindBy(how= How.NAME, using = "//input[@name='et_pb_contact_name_0']")
    public WebElement nameaLocator;
	@FindBy(how= How.XPATH, using = "//input[@id='et_pb_contact_company_0']")
    public WebElement companyLocator;
	@FindBy(how= How.ID, using = "//input[@id='et_pb_contact_email_0']")
    public WebElement emailLocator;
	@FindBy(how= How.ID, using = "//input[@id='et_pb_contact_phone_number_0']")
    public WebElement phonenumberLocator;
	@FindBy(how= How.XPATH, using = "//textarea[@name=\"et_pb_contact_message_0\"]")
    public WebElement messageLocator;
	@FindBy(how= How.XPATH, using = "//button[@type='submit']")
    public WebElement submitbuttonLocator;
	
	public void entername(String name) {
		nameaLocator.sendKeys(name);
	}

	public void entercompanyname(String company) {
		
		companyLocator.sendKeys(company);
	}

	public void enteremailaddress(String email) {
		emailLocator.sendKeys(email);
	}

	public void enterphonenumber(String phonenumber) {
		phonenumberLocator.sendKeys(phonenumber);
	}

	public void enterbriefmessage(String message) {
		messageLocator.sendKeys(message);
	}

	public void clickonsubmit() {
		submitbuttonLocator.click();
	}

}
