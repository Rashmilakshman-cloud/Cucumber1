package p5;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class casestudy5 {
	

	
		@Given("User navigates to url")
		public void user_navigates_to_url() {
			System.out.println("User navigated to url");
		    
		}

		@And("enters {string} and {int}")
		public void enters_and(String userName, Integer password) {
			System.out.println("Username"+userName );
			System.out.println("Password"+password );
		}

		@When("user click on signup button")
		public void user_click_on_signup_button() {
			System.out.println("clicked on signup button");
		    
		}

		@Then("the welcome page is displayed")
		public void the_welcome_page_is_displayed() {
			System.out.println("welcome page is displayed");
		    
		}
		
		@Given("user enters user name")
		public void user_enters_user_name() {
		   System.out.println("user entered username");
		}

		@Given("user enters password")
		public void user_enters_password() {
		    System.out.println("user entered password");
		}

		@When("user clicks on login button")
		public void user_clicks_on_login_button() {
		    System.out.println("clicked on login button");
		}

		@Then("home page is displayed")
		public void home_page_is_displayed() {
		    System.out.println("Home page is displayed");
		}





	}


