package stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHRM {
WebDriver driver;
	@Given("^you are on the login page https://opensource-demo\\.orangehrmlive\\.com/$")
	public void you_are_on_the_login_page_https_opensource_demo_orangehrmlive_com() throws Throwable {
		 driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^you enter the below credentials$")
	public void you_enter_the_below_credentials(DataTable datatable) throws Throwable {
	   List<String> credentials = datatable.asList(String.class);
	   String Username = credentials.get(0);
	   String Password = credentials.get(1);
	   driver.findElement(By.id("txtUsername")).sendKeys(Username);
	   driver.findElement(By.id("txtPassword")).sendKeys(Password);
	}

	@When("^Click the login button$")
	public void click_the_login_button() throws Throwable {
	    driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^User should see home page$")
	public void user_should_see_home_page() throws Throwable {
	    System.out.println("Login page displayed");
	}

}
