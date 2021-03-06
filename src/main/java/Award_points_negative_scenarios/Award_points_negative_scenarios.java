package Award_points_negative_scenarios;

import java.io.IOException;
import java.util.List;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import Reusable_Functions.Generic_function;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Award_points_negative_scenarios extends Generic_function{
	public static boolean value;
	static WebElement ele;
	String ere;
	public static WebElement fr;
	static String str,text;
	static List<WebElement> grid_elements,drp_list;


	/*Validate that the user is navigated to Welcome page*/
	@Given("Launch the URL")
	public void launchTheURL() throws IOException {
		Browser_Launch();
	}

	@When("Navigate to Welcome screen and validate the welcome page")
	public void navigate_Welcome_Page() throws IOException {
		try {
			click("welcome_login");
			value = driver.findElement(By.xpath(OR_reader("login_title"))).isDisplayed();
			Assert.assertEquals(true,value);
		}catch (Exception e) {
			takeScreenShot("navigate_Welcome_Page");
			e.printStackTrace();
		}
	}


	@When("Click on Utilities tab")
		public static void click_utilities() throws IOException{
		try {
			driver.findElement(By.xpath(OR_reader( "login_phone_number"))).sendKeys(td_reader("login_phone_number",11));
			driver.findElement(By.xpath(OR_reader( "login_password"))).sendKeys(td_reader("login_password",11));
			click("login");
			browser_wait(1000);
			click("utilities");
			browser_wait(1000);
		} catch (Exception e) {
			takeScreenShot("click_on_utilities_tab");
			e.printStackTrace();
		}
		}

	@And("Click on Award Points")
	public void click_award_points() throws IOException {
		try {
			click("award_points");
			//browser_refresh();
			browser_wait(9000);
		} catch (Exception e) {
			takeScreenShot("click_award_points");
				e.printStackTrace();
			}
		}

// TC 001 - Verify the validation message on entering amount more than the available amount in "Redeem Award Points" page
	@When("Click on 'redeem' points")
	public void click_redeem_points() throws IOException {
		try {
			value = driver.findElement(By.xpath(OR_reader( "awardpoints_redeem_button"))).isEnabled();
			Assert.assertEquals(true,value);
			browser_explicit_wait("awardpoints_redeem_button");
			Actions builder=new Actions(driver);
			builder.moveToElement(driver.findElement(By.xpath(OR_reader("awardpoints_redeem_button"))));
			builder.click(driver.findElement(By.xpath(OR_reader("awardpoints_redeem_button"))));
			Action action= builder.build();
			action.perform();
		} catch (IOException ioException) {
			takeScreenShot("click_redeem_points_button");
			ioException.printStackTrace();
		}
	}
	@Then("Enter the amount more than available amount")
	public void greater_amount() throws IOException, InterruptedException {
			browser_wait(7000);
			click("redeem_points_giftcard");
			ele = driver.findElement(By.xpath(OR_reader("redeem_points_giftcard")));
			ele.sendKeys(td_reader("redeem_points_giftcard"));
			ele.sendKeys(Keys.ARROW_DOWN);
			ele.sendKeys(Keys.ENTER);
	}

	@And("Validate the message on award points page")
	public void Award_point_negative_tc_001() throws IOException {
		try{
			value = driver.findElement(By.xpath(OR_reader( "award_points_reedem"))).isDisplayed();
			Assert.assertEquals(true,value);
		click("redeem_points_amount");
		ele=driver.findElement(By.xpath(OR_reader("redeem_points_amount")));
		ele.sendKeys(Keys.BACK_SPACE);
		ele.sendKeys(td_reader("redeem_points_amount",1));
		click("redeem_points_email");
		str= driver.findElement(By.xpath(OR_reader("redeem_points_amount_valid_msg"))).getText();
		Assert.assertEquals(str,td_reader("amount_exceed_valid_msg"));
		browser_wait(1500);
	}catch (Exception e) {
		e.printStackTrace();
		takeScreenShot("Award_point_negative_tc_001");
	}
}


//TC 002 - Validate the validation message on entering amount less than the available amount in "Redeem Award Points" page
	@When("Enter the amount less than the available amount")
	public void lesser_Amount() throws IOException {
		//browser_refresh();
		browser_wait(1000);
		click("redeem_points_giftcard");
		ele=driver.findElement(By.xpath(OR_reader("redeem_points_giftcard")));
		ele.sendKeys(td_reader("redeem_points_giftcard"));
		browser_wait(3000);
		ele.sendKeys(Keys.ARROW_DOWN); browser_wait(2000);
		ele.sendKeys(Keys.ENTER);
	}

	@Then("Validate the message on award points page on less amount")
	public void Award_point_negative_tc_002() throws IOException {
		try {
			value = driver.findElement(By.xpath(OR_reader( "award_points_reedem"))).isDisplayed();
			Assert.assertEquals(true,value);
			browser_explicit_wait("redeem_points_amount");
			click("redeem_points_amount");
			ele=driver.findElement(By.xpath(OR_reader("redeem_points_amount")));
			ele.sendKeys(Keys.BACK_SPACE);
			ele.sendKeys(td_reader("redeem_points_amount",2));
			click("redeem_points_email");
			str= driver.findElement(By.xpath(OR_reader("redeem_points_amount_valid_msg"))).getText();
			Assert.assertEquals(str,td_reader("redeem_points_amount_valid_msg"));
			browser_wait(1000);
		}
		catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("Award_point_negative_tc_002)");
		}
	}


	/*TC 003 -  Validate that user is not able to click on the 'Redeem' button on leaving the field 'Select a gift card' blank" */
	@When("Click the Redeem button on leaving the field Select a gift card blank")
	public void redeemButton_giftcardblank() throws IOException {
		try{
		//browser_refresh();
		click("redeem_points_giftcard");}
		catch (Exception e) {
			takeScreenShot("redeemButton_giftcardblank");
			e.printStackTrace();
		}
	}
	@Then("Validate the error message displayed")
	public static void Award_point_negative_tc_003() throws IOException, InterruptedException {
		try {
			value=driver.findElement(By.xpath(OR_reader( "redeem_points"))).isEnabled();
			Assert.assertEquals(value,false);
			browser_wait(1000);
		}catch(Exception e) {
			e.printStackTrace();
			takeScreenShot("Award_point_negative_tc_003");
		}
	}


	/*TC 004 -  Validate that user is not able to click on the 'Redeem' button on leaving the field 'Enter Amount' blank on "Redeem Award Points" page */
	@When("Click on the Redeem button on leaving the field Enter Amount blank")
	public static void blank_amount_redeem_button() throws IOException{
			//browser_refresh();
			click("redeem_points_giftcard");
			ele=driver.findElement(By.xpath(OR_reader("redeem_points_giftcard")));
			ele.sendKeys(td_reader("redeem_points_giftcard"));
			ele.sendKeys(Keys.ARROW_DOWN);
			ele.sendKeys(Keys.ENTER);
	}

	@Then("Validate the message displayed")
	public void Award_point_negative_tc_004() throws IOException {
		try{
			browser_wait(2000);
		value = driver.findElement(By.xpath(OR_reader( "award_points_reedem"))).isDisplayed();
		Assert.assertEquals(true,value);
		ele=driver.findElement(By.xpath(OR_reader("redeem_points_amount")));
		ele.sendKeys(Keys.BACK_SPACE);
		click("redeem_points_email");
		browser_wait(5000);
		str= driver.findElement(By.xpath(OR_reader("redeem_points_amount_valid_msg"))).getText();
		Assert.assertEquals(str,td_reader("redeem_points_amount_valid_msg"));
		browser_wait(1000);
		System.out.println("Award points negative");
		}
		catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("Award_point_negative_tc_004");
		}
		browser_close();
	}
}
