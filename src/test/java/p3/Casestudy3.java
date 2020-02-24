package p3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Casestudy3 {
	WebDriver driver;
	@Given("user enters the TestMeApp and logs in")
	public void user_enters_the_TestMeApp_and_logs_in() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	    System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");

		 driver = new ChromeDriver();

		driver.get("https://10.232.237.143/TestMeApp/");

		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		driver.findElement(By.linkText("SignIn")).click();
		driver.findElement(By.name("userName")).sendKeys("Lalitha");
		  driver.findElement(By.name("password")).sendKeys("Password123");
		  driver.findElement(By.name("Login")).click();
	}

	@When("user seraches a product in searh engine")
	public void user_seraches_a_product_in_searh_engine() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//div[@class='autocomplete']/input")).sendKeys("HeadPhone");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}

	@Then("user purchases the product")
	public void user_purchases_the_product() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		driver.findElement(By.linkText("Add to cart")).click();
		  System.out.println("Product added to cart successfully"); 
	}


	

}
