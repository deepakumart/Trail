package com.stepdefination_crossbrowser;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.Library.Library;
import com.pageobjectmodel.Singletone_crossbrowser;
import com.runner_crossbrowser.Runner_crossbrowser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Stepdefination_crossbrowser extends Library {
	public static WebDriver driver = Runner_crossbrowser.driver;
	public static Singletone_crossbrowser Bd = new Singletone_crossbrowser(driver);
	
	@Given("User should launch the {string}")
	public void user_should_launch_the(String string) {
		driver=Library.getBrowser(string);
	}
	
	@Given("User should launch the Amazon website")
	public void user_should_launch_the_amazon_website() {

		implicit();
		driver.get("https://www.amazon.in/");
		maximize();

	}

	@Given("User should click the signIn Link")
	public void user_should_click_the_sign_in_link() {
		 Singletone_crossbrowser Bd = new Singletone_crossbrowser(driver);
		ClickOnElement(Bd.login().getUserName());

	}

	@Given("User should enter invalid username {string}")
	public void user_should_enter_invalid_username(String string) {
		 Singletone_crossbrowser Bd = new Singletone_crossbrowser(driver);
		inputvalue(Bd.login().getValidemail(), string);

	}

	@Then("User should verify the Username credentials")
	public void user_should_verify_the_Username_credentials() throws IOException {
		 Singletone_crossbrowser Bd = new Singletone_crossbrowser(driver);
		ClickOnElement(Bd.login().getContinue1());
		ass(Bd.login().getvalidationusername(),"Incorrect phone number");
			}
	
	@Given("User should enter valid username {string} and Invalid password {string}")
	public void user_should_enter_valid_username_and_Invalid_password(String username, String string2) {
		Singletone_crossbrowser Bd = new Singletone_crossbrowser(driver);
		inputvalue(Bd.login().getValidemail(), username);
		ClickOnElement(Bd.login().getContinue1());
		inputvalue(Bd.login().getValidpswd(), string2);

	}

	@Then("User should verify the password credentials")
	public void user_should_verify_the_password_credentials() {
		Singletone_crossbrowser Bd = new Singletone_crossbrowser(driver);
		ClickOnElement(Bd.login().getLogin());
		ass(Bd.login().getValidationPassword(), "Your password is incorrect");
	}

	@Given("User should enter valid username {string} and password {string}")
	public void user_should_enter_valid_username_and_password(String string, String string2) throws IOException {
		 Singletone_crossbrowser Bd = new Singletone_crossbrowser(driver);
		inputvalue(Bd.login().getValidemail(), string);
		ClickOnElement(Bd.login().getContinue1());
		inputvalue(Bd.login().getValidpswd(), string2);

	}

	@Then("User should verify the homePage")
	public void user_should_verify_the_homePage() {
		Singletone_crossbrowser Bd = new Singletone_crossbrowser(driver);
		ClickOnElement(Bd.login().getLogin());
		ass(Bd.login().getvalidationHome(), "Hello, deepak");
		
	
	}
	
	@Given("user launch the Amazon website")
	public void user_launch_the_amazon_website() {
		
			implicit();
			driver.get("https://www.amazon.in/");
			maximize();
	}
	@When("User Enter the UserName {string} in input field")
	public void user_enter_the_user_name_in_input_field(String string) {
		Singletone_crossbrowser Bd = new Singletone_crossbrowser(driver);
		inputvalue(Bd.login().getValidemail(), string);
	}
	@When("User click on the sign in button and its navigate to password page")
	public void user_click_on_the_sign_in_button_and_its_navigate_to_password_page() {
		 Singletone_crossbrowser Bd = new Singletone_crossbrowser(driver);
		ClickOnElement(Bd.login().getContinue1());
	}
	@When("User Enter the password {string} in input field")
	public void user_enter_the_password_in_input_field(String string) {
		 Singletone_crossbrowser Bd = new Singletone_crossbrowser(driver);
		inputvalue(Bd.login().getValidpswd(), string);
	}
	@Then("User click on the login button and its navigate to my account page")
	public void user_click_on_the_login_button_and_its_navigate_to_my_account_page() {
		 Singletone_crossbrowser Bd = new Singletone_crossbrowser(driver);
		ClickOnElement(Bd.login().getLogin());
	}


	@Given("user click on the categories drop down and user select on the book option")
	public void user_click_on_the_categories_drop_down_and_user_select_on_the_book_option() throws InterruptedException {
		
		 Singletone_crossbrowser Bd = new Singletone_crossbrowser(driver);
		 dropdown(Bd.search().getDropdown(), "10", "byindex");
	}
	@Given("user enter the {string} on search box")
	public void user_enter_the_on_search_box(String string) {
		Singletone_crossbrowser Bd = new Singletone_crossbrowser(driver);
		inputvalue(Bd.search().getSend(),string);
	    
	}
	@Given("user click the search button")
	public void user_click_the_search_button() {
		 Singletone_crossbrowser Bd = new Singletone_crossbrowser(driver);
	     ClickOnElement(Bd.search().getSearch());
	}
	@Given("user select  the ikigai book")
	public void user_select_the_ikigai_book() {
		Singletone_crossbrowser Bd = new Singletone_crossbrowser(driver);
		ClickOnElement(Bd.search().getSelect());
	}
	@Then("user click on  add to cart button and It Navigate to add to cart page")
	public void user_click_on_add_to_cart_button_and_it_navigate_to_add_to_cart_page() {
		 Singletone_crossbrowser Bd = new Singletone_crossbrowser(driver);
			windowhandle();
			ClickOnElement(Bd.search().getAddtocart());
	}
	@Then("User click on log out buttons")
	public void user_click_on_log_out_buttons() {
		 Singletone_crossbrowser Bd = new Singletone_crossbrowser(driver);
			ClickOnElement(Bd.login().getLogout());
			javascript(Bd.login().getSignout());
	}
	@When("user enters the {string} on search box")
	public void user_enters_the_on_search_box(String string) {
		Singletone_crossbrowser Bd = new Singletone_crossbrowser(driver);
		inputvalue(Bd.Unavailability().getSend1(), string);
	}
	@When("user click on search button")
	public void user_click_on_search_button() {
		 Singletone_crossbrowser Bd = new Singletone_crossbrowser(driver);
		ClickOnElement(Bd.search().getSearch());
	}

	@Then("user verify the book name")
	public void user_verify_the_book_and_get_unavailability_message() {
		 Singletone_crossbrowser Bd = new Singletone_crossbrowser(driver);
         assertnotequal(Bd.Unavailability().getGet1(),"ikigai");

	}


}
