package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//UndefinedStepException - if steps are not present..

public class NetBankingSteps {
	@Given("Admin user is on netbanking login page")
	public void user_is_on_netbanking_admin_login_page() {
		System.out.println("Netbanking login page");
	}
	
	@Given("Credit card user is on netbanking login page")
	public void user_is_on_netbanking_creditCard_login_page() {
		System.out.println("Netbanking login page");
	}

	@When("user logins to the application with username as {string} and password as {string}")
	public void user_logins_to_the_application(String username, String password) {
		System.out.println("user logged in");
		System.out.println("User name is :- "+username+" and password is :- "+password);
	}
	
	@When("^user logins to the application with username as (.+) and password as (.+) using datas$")
	public void user_logins_to_the_application_data_driven(String username, String password) {
		System.out.println("user logged in");
		System.out.println("User name is :- "+username+" and password is :- "+password);
	}
	
	@When("^user logins to the application with username as (.+) and password as (.+) using regex$")
	public void user_logins_to_the_application_data_driven_regex(String username, String password) {
		System.out.println("user logged in");
		System.out.println("User name is :- "+username+" and password is :- "+password);
	}

	@Then("Home Page is displayed")
	public void home_page_is_displayed() {
		System.out.println("homepage shown");
	}

	@Then("Cards are displayed")
	public void cards_are_displayed() {
		System.out.println("cards shown");
	}

}
