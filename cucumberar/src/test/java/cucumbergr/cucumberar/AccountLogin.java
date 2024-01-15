package cucumbergr.cucumberar;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountLogin {
	@Given("login page is displayed")
	public void login_page_is_displayed() {
	}

	@When("username entered is {string}")
	public void username_entered_is(String username) {
		System.out.println("username is "+username);
	}

	@When("password entered is {string}")
	public void password_entered_is(String password) {
		System.out.println("password is "+password);
	}

	@Then("home page should be displayed")
	public void home_page_should_be_displayed() {
	}

}
