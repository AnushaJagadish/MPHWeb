package Homepage_positive_scenarios;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import Reusable_Functions.Generic_function;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Homepage_positive_scenarios extends Generic_function {
	public static boolean value;
	WebElement ele;
	String ere;
	@Given("launch the URL")
	public static void browser_is_open() {
		try {
			Browser_Launch();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/*Validate that the user is navigated to Welcome page*/
	@When("Click on 'Welcome Login' button")
	public static void home_positive_tc_001() throws IOException {
		click("welcome_login");
	}
	@Then("Verify the Welcome page")
	public void verifyTheWelcomePage() throws IOException {
		try {
			value = driver.findElement(By.xpath(OR_reader( "login_title"))).isDisplayed();
			Assert.assertEquals(true,value);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("home_positive_tc_001");
		}
	}
	/*Validate that the user is able to Login with valid credentials*/
	@When("enters valid phonenumber and password")
	public static void enter_login_details() throws InterruptedException, IOException {
		try {
			driver.findElement(By.xpath(OR_reader( "login_phone_number"))).sendKeys(td_reader("login_phone_number",7));
			driver.findElement(By.xpath(OR_reader( "login_password"))).sendKeys(td_reader("login_password",8));

			browser_wait(1000);
		} catch (IOException e) {
			e.printStackTrace();
			takeScreenShot("enter_login_details");
		}
	}

	@Then("click on 'login' button")
	public static void home_positive_tc_002() throws InterruptedException, IOException {
		click("login");
		browser_wait(1000);

	}

	/*Validate that the user is navigated to  the Home page and User should be able to click on all the grid tiles */
	@When("clicks on all the grid tiles")
	public static void home_positive_tc_003() throws IOException, InterruptedException {
		try {
			grid_tiles(OR_reader("grid_path"));
			browser_wait(7000);
			value=driver.findElement(By.xpath(OR_reader("bills_title"))).isDisplayed();
			Assert.assertEquals(true,value);
		}catch(Exception e) {
			e.printStackTrace();
			takeScreenShot("home_positive_tc_003");
		}
	}
	/*TC_004 -Validate that the user is navigated to the Second Opinion page on clicking 'Request for second opinion' button*/
	@When("clicks on the 'Request for second opinion' button")
	public void home_positive_tc_004() throws InterruptedException, Exception {
		try {
			browser_back();
			//request_second_opinion_button
			click("request_second_opinion_button");
			browser_wait(9000);
			/*driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/div/div[1]/div[2]/label/span[1]/span/input")).click();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/div/div[1]/div[3]/button")).click();*/
			//click("create_new_case");
		}catch(Exception e) {
			e.printStackTrace();
			takeScreenShot("home_positive_tc_004");
		}


	}

	@Then("navigated to the Second opinion page")
	public void navigate_sec_opinion() throws Exception {

		try {
			browser_wait(2000);
			value1=driver.findElement(By.xpath(OR_reader( "request_second_opinion_title"))).isDisplayed();
			Assert.assertEquals(true,value1);
			browser_wait(1500);
			browser_back();
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("home_positive_tc_004");
		}

	}

	/*TC_005-Validate that the user is navigated to the  Refer a friend page on clicking 'Refer a friend' button*/
	@When("clicks on 'Refer a friend' button")
	public static void home_positive_tc_005() throws InterruptedException, IOException {
		try {
			click("refer_a_friend_button");
			browser_wait(1500);
		}catch(Exception e) {
			e.printStackTrace();
			takeScreenShot("home_positive_tc_005");
		}				
	}
	@Then("navigated to the Refer a friend page")
	public void navigated_to_the_refer_a_friend_page() throws Exception {

		try {
			value1=driver.findElement(By.xpath(OR_reader("refer_a_friend_title"))).isDisplayed();
			Assert.assertEquals(true,value1);
			browser_wait(1000);
			browser_back();
			System.out.println("home positive");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("home_positive_tc_005");
		}
		browser_close();
	}

}
