package Signup_positive_scenarios;

import java.io.IOException;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Reusable_Functions.Generic_function;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Signup_positive_scenarios extends Generic_function {
	public static boolean value1,value2;
	WebElement otp;

	@Given("Launch the URL and click on signup")
	public static void signup_positive_tc_001() throws IOException  {
		try {
			Browser_Launch();
			click("welcome_signup");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("signup_positive_tc_001");
		}
	}
	/*TC_001 Verify that the browser is launched.Clicks on the Signup button and navigates to Signup page*/
	@Then("Navigated to signup page")
	public static void navigate_signup_page() throws IOException  {
		try {
			value1=driver.findElement(By.xpath(OR_reader("signup_title"))).isDisplayed();
			Assert.assertEquals(true,value1);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("navigate_signup_page");
		}
	}

	/*TC_002 Verify clicking on login link will navigate to login page*/
	@When("Clicks on the 'Login' link")
	public static void signup_positive_tc_002() throws IOException{
		try{
			click("login_link");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("signup_positive_tc_002");
		}
	}

	@Then("Navigates to the login page")
	public static void navigate_to_login() throws IOException{
		try{
			value1=driver.findElement(By.xpath(OR_reader("login_phone_number"))).isDisplayed();
			Assert.assertEquals(true,value1);
			//browser_refresh();
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("navigate_to_login");
		}
	}

	/*TC_003 Verify that the data entered in both Password and Confirm password fields are masked*/
	@When("Enter details in the 'Password' and 'Confirmed Password' field should be masked")
	public static void signup_positive_tc_003() throws IOException{
		try {
			driver.navigate().back();
			click("welcome_signup");
			driver.findElement(By.xpath(OR_reader("signup_password"))).sendKeys(td_reader("signup_password",1));
			driver.findElement(By.xpath(OR_reader( "signup_confirm_password"))).sendKeys(td_reader("signup_confirm_password",2));
			value1=driver.findElement(By.xpath(OR_reader( "signup_password"))).isDisplayed();
			value2=driver.findElement(By.xpath(OR_reader("signup_confirm_password"))).isDisplayed();
			Assert.assertEquals(true,value1);
			Assert.assertEquals(true,value2);
			browser_refresh();
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("signup_positive_tc_002");
		}
	}

	/* TC_004 Verify that the password should be displayed on an eye click for Password fields*/
	@When("Clicks on the Eye")
	public static void signup_positive_tc_004() throws IOException  {
		try {
			driver.findElement(By.xpath(OR_reader("signup_password"))).sendKeys(td_reader("signup_password",1));
			click("show_password");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("signup_positive_tc_003");
		}
	}

	@Then("Original value should be displayed in the password fields")
	public static void display_value() throws IOException  {
		try {
			browser_wait(1000);
			value1=driver.findElement(By.xpath(OR_reader( "show_password"))).isDisplayed();
			Assert.assertEquals(true,value1);
			browser_refresh();  
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("display_value");
		}
	}

	/* TC_005 Verify that the Confirm password field by comparing data entered in the Password field*/ 
	@When("Enter same values of 'Password' in the 'Confirmed Password' field")
	public void signup_positive_tc_005() throws IOException {
		try {
			driver.findElement(By.xpath(OR_reader("signup_password"))).sendKeys(td_reader("signup_password",1));
			driver.findElement(By.xpath(OR_reader( "signup_confirm_password"))).sendKeys(td_reader("signup_confirm_password",2));  
			value1=driver.findElement(By.xpath(OR_reader( "signup_password"))).isDisplayed();
			value2=driver.findElement(By.xpath(OR_reader("signup_confirm_password"))).isDisplayed();
			Assert.assertEquals(true,value1);
			Assert.assertEquals(true,value2);
			browser_refresh();
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("signup_positive_tc_004");
		}
	}

	/* TC_006 Verify click on Sign Up with valid credentials*/ 
	@When("Enters valid credentials")
	public void signup_positive_tc_006() throws Exception {
		try {
			driver.findElement(By.xpath(OR_reader( "signup_first_name"))).sendKeys(td_reader("signup_first_name",2));
			driver.findElement(By.xpath(OR_reader( "signup_last_name"))).sendKeys(td_reader("signup_last_name",2));
			driver.findElement(By.xpath(OR_reader("signup_email_id"))).sendKeys(td_reader("signup_email_id",2));
			driver.findElement(By.xpath(OR_reader("signup_phone_number"))).sendKeys(td_reader("signup_phone_number",3));
			driver.findElement(By.xpath(OR_reader("signup_password"))).sendKeys(td_reader("signup_password",1));
			driver.findElement(By.xpath(OR_reader( "signup_confirm_password"))).sendKeys(td_reader("signup_confirm_password",2));
			click("signup_terms_and_conditions");
			click("signup");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("signup_positive_tc_005");
		}
		browser_wait(1000);
	}
	@Then("Verify navigation to OTP page")
	public void verify_OTP_page() throws IOException {
		try {
			value1 = driver.findElement(By.xpath(OR_reader("otp"))).isDisplayed();
			Assert.assertEquals(true, value1);
		}
		catch (Exception e){
			takeScreenShot("verify_OTP_page");
		}
	}

	/*TC_007 Verify user should be navigated to the otp Login page*/
	@When("Enters otp")
	public void signup_positive_tc_007() throws IOException, InterruptedException {
		try {
			//driver.findElement(By.xpath(OR_reader( "otp"))).sendKeys(td_reader("otp"));	
		}catch(Exception e) {
			e.printStackTrace();
			takeScreenShot("signup_positive_tc_006");
		}  
	}

	@Then("Clicks on 'verify' button")
	public void click_verify() throws IOException, InterruptedException {
		try {
			//click("verify");
			System.out.println("signup positive");
		}catch(Exception e) {
			e.printStackTrace();
			takeScreenShot("click_verify");
		}
		browser_close();
	}
}
