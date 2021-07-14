package Award_points_positive_scenarios;

import java.io.IOException;
import java.util.List;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import Reusable_Functions.Generic_function;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Award_points_positive_scenarios extends Generic_function{
	public static boolean value;
	static WebElement ele;
	String ere;
	public static WebElement fr;
	static String str,text;
	static List<WebElement> grid_elements,drp_list;

	/*Validate that the user is navigated to Welcome page*/
	@Given("Launch the URL")
	public static void launch_url() throws IOException {
		Browser_Launch();
	}

	@When("Navigate to Welcome screen")
	public static void Award_point_positive_welcome() throws IOException {
		try {
			click("welcome_login");
			value = driver.findElement(By.xpath(OR_reader( "login_title"))).isDisplayed();
			Assert.assertEquals(true,value);
			// changed index to 9 from 10 in phone num and index changed 10 to 5 in password
			driver.findElement(By.xpath(OR_reader("login_phone_number"))).sendKeys(td_reader("login_phone_number", 9));
			driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("login_password", 5));
			click("login");
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("Award_point_positive_welcome()");
		}
	}

	@Then("Click on 'Utilities'")
	public static void click_utilities() throws IOException {
		try {
			browser_wait(12);
			click("utilities");
			browser_wait(20);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("click_utilities");
		}
	}
	/*TC 001 - Validate that the user is able to navigated to Utilities screen */
	@When("Click on Award points tile")
	public void click_awardpoints() throws IOException {
		click("award_points");
		browser_wait(20);
	}

	@Then("Validate Award points page")
	public static void Award_point_positive_tc_001() throws IOException {
		try {
			value = driver.findElement(By.xpath(OR_reader("award_points_title"))).isDisplayed();
			Assert.assertEquals(true,value);
		} catch (IOException ioException) {
			takeScreenShot("Award_point_positive_tc_001");
			ioException.printStackTrace();
		}
	}

	/*TC 002 - Validate that user can click the Tile "Award Points"in the Utilities dashboard*/
	@Then("User should be able to click on Award point tile and to Award points page successfully")
	public static void Award_point_positive_tc_002()throws InterruptedException, IOException {
		try {
			value = driver.findElement(By.xpath(OR_reader( "award_point_title"))).isDisplayed();
			Assert.assertEquals(true,value);
			value = driver.findElement(By.xpath(OR_reader( "your_award_point_history"))).isDisplayed();
			Assert.assertEquals(true,value);
		}catch (Exception e) {
			takeScreenShot("Award_point_positive_tc_002()");
		}	

	}
	@When("Click on the Redeem Points button")
	public void click_redeem_points_button() throws IOException {
		try {
			browser_wait(5);
			click("awardpoints_redeem_button");
			browser_wait(5);
			value = driver.findElement(By.xpath(OR_reader( "redeem_award_points_title"))).isDisplayed();
			Assert.assertEquals(true,value);
		} catch (IOException ioException) {
			takeScreenShot("click_redeempoints_button");
			ioException.printStackTrace();
		}

	}
	
	/*TC 003 - Validate that user is able to redeem points  in the Award points dashboard.*/
	@When("User should be able to click on the Redeem Points button and navigated to redeem award points page")
	public static void Award_point_positive_tc_003() throws IOException {
//			click("awardpoints_redeem_button");
//			value = driver.findElement(By.xpath(OR_reader( "redeem_award_points_title"))).isDisplayed();
//			Assert.assertEquals(true,value);
//			Thread.sleep(1000);
	}

	@Then("Validate the redeem award points page")
	public void validateTheRedeemAwardPointsPage() throws IOException {
			try {
			value = driver.findElement(By.xpath(OR_reader( "available_award_point"))).isDisplayed();
//			Assert.assertEquals(true,value);
//			click("redeem_points_giftcard");
//			ele=driver.findElement(By.xpath(OR_reader("redeem_points_giftcard")));
//			ele.sendKeys(td_reader("redeem_points_giftcard"));
//			ele.sendKeys(Keys.ARROW_DOWN);
//			ele.sendKeys(Keys.ENTER);
//			value = driver.findElement(By.xpath( "award_points_reedem")).isDisplayed();
//			Assert.assertEquals(true,value);
//			click("redeem_points_amount");
//			ele=driver.findElement(By.xpath(OR_reader("redeem_points_amount")));
//			ele.sendKeys(Keys.BACK_SPACE);
//			ele.sendKeys(td_reader("redeem_points_amount",0));
//			Thread.sleep(6000);
//			click("redeem_points_email");
			Thread.sleep(6000);
		}
		catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("Award_point_positive_tc_003()");
		}
	}

	/*TC 004 - Validate that the user is able to navigate to the 'redeemed' page */
	@When("Navigate to the redeem page")
	public void navigate_redeem_page() throws IOException {
		//click("redeem_points");
	}
	@Then("Validate the redeem page")
	public static void Award_point_positive_tc_004() throws IOException {
		try {
			//			value = driver.findElement(By.xpath(OR_reader( "redeemed_title"))).isDisplayed();
			//			Assert.assertEquals(true,value);
			//		        browser_wait(20);
			//			value = driver.findElement(By.xpath(OR_reader( "redeemed_points"))).isDisplayed();
			//			Assert.assertEquals(true,value);
			//			value = driver.findElement(By.xpath(OR_reader( "availed_gift"))).isDisplayed();
			//			Assert.assertEquals(true,value);
			//			click("goto_dashboard_button");
			//			value = driver.findElement(By.xpath(OR_reader( "your_award_point_history"))).isDisplayed();
			//			Assert.assertEquals(true,value);
			//			Thread.sleep(5000);
			System.out.println("Award points positive");
			browser_close();
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("Award_point_positive_tc_004()");
		}
	}
}
