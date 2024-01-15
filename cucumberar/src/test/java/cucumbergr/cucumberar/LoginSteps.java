package cucumbergr.cucumberar;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("facebook homepage is opened")
	public void facebook_homepage_is_opened() {

	}

	@When("credentials are entered")
	public void credentials_are_entered() {

	}

	@Then("login into account should be successful")
	public void login_into_account_should_be_successful() {

	}

	@Then("profile should be visible")
	public void profile_should_be_visible() {

	}
	// second scenario

	@Given("facebook login is opened")
	public void facebook_login_is_opened() {
		System.out.println("facebook login page is opened");
	}

	@When("username {string} are entered")
	public void username_are_entered(String string) {
		System.out.println("username entered is" + string);
	}

	@When("password {string} are entered")
	public void password_are_entered(String string) {
		System.out.println("password entered is" + string);
	}

	@Then("login into account should be not successful")
	public void login_into_account_should_be_not_successful() {
		System.out.println("login not successful");
	}

	@Then("login profile should be visible")
	public void login_profile_should_be_visible() {
		System.out.println("login profile visible");
	}

}
