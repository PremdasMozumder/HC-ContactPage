package stepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.util.Strings;

import base.setup;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hook extends setup{

	public static String url;
	public static String name;
	public static String company;
	public static String email;
	public static String phonenumber;
	public static String message;
	public static String driverType = System.getProperty("browser");
	public static String envData = System.getProperty("env");

	 @Before
	    public void startTest(){
	        if (Strings.isNullOrEmpty(driverType)){
	            driverType = "ch";
	        }
	        if (Strings.isNullOrEmpty(envData)){
	            envData = "qa";
	        }
	        driver = setupBrowser(driverType);
	        switch (envData){
	            case "qa":
	                url = "https://www.healthcourse.com/contact/";
	                name = "qainterview";
	                company = "realcme";
	                email = "winie@tryninja.io";
	                phonenumber = "9999999999";
	                message = "This is an assignment for the QA position. Please ignore.";
	                break;
	            
	        }
	        driver.get(url);
	    }

	    @After
	    public void endTest(Scenario scenario){
	        try {
	            if (scenario.isFailed()){
	                final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	                // embed it in the report.
	                scenario.attach(screenshot, "image/png", scenario.getName());
	            }
	        } finally {
	            driver.quit();
	        }
	    }}
