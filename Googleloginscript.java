package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Googleloginscript {
	
WebDriver driver;

	
	@Given("^user is entering google\\.co\\.in$")
	public void user_is_entering_google_co_in() throws Throwable {
		 driver = new ChromeDriver();
		 driver.get("https://www.google.co.in/?gws_rd=ssl");
		 }

	@When("^types the searchterm as \"([^\"]*)\"$")
	public void user_clicks_the_search_box(String searchterm) throws Throwable {
	   driver.findElement(By.name("q")).sendKeys(searchterm);
	   //driver.findElement(By.xpath("//input(@value='Google Search')")).click();
	   driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	}
	
	@When("^user clicks the search box$")
	public void types_the_searchterm_as() throws Throwable {
		 driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		 }

	@Then("^the user should see the search results for Agniprasath$")
	public void the_user_should_see_the_search_results_for_Agniprasath() throws Throwable {
	    boolean Status = driver.findElement(By.partialLinkText("agni")).isDisplayed();
	    if(Status)
	    {
	    	System.out.println("Results Displayed");
	    }
	}

}
