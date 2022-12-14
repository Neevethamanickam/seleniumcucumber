package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Thanos_hook {

	@Given("^thanos has the infinity stones$")
	public void thanos_has_the_infinity_stones() throws Throwable {
	    System.out.println("thanos has the infinity stones");
	}

	@When("^thanos snapping his fingers$")
	public void thanos_snapping_his_fingers() throws Throwable {
		System.out.println("thanos snapping his fingers");  
	}

	@Then("^half of the living beings died on the earth$")
	public void half_of_the_living_beings_died_on_the_earth() throws Throwable {
		System.out.println("half of the living beings died on the earth");
	}


}
