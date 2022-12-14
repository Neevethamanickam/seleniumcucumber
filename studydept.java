package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class studydept {
	
	@Given("^the student finished high school$")
	public void the_student_finished_high_school() throws Throwable {
	    System.out.println("the student finished high school");
	}

	@Given("^the student finished higher secondary$")
	public void the_student_finished_higher_secondary() throws Throwable {
	    System.out.println("the student finished higher secondary");
	}



	@Given("^the student applied for medical course$")
	public void the_student_applied_for_medical_course() throws Throwable {
	    System.out.println("the student applied for medical course");
	}

	@When("^the student cleared the entrance exam$")
	public void the_student_cleared_the_entrance_exam() throws Throwable {
		System.out.println("the student cleared the entrance exam");
	}

	@Then("^the student is eligible for joining any medical institude$")
	public void the_student_is_eligible_for_joining_any_medical_institude() throws Throwable {
		System.out.println("the student is eligible for joining any medical institude");
	}

	@Given("^the student applied for the engineering course$")
	public void the_student_applied_for_the_engineering_course() throws Throwable {
		System.out.println("the student applied for the engineering course");
	}

	@When("^the student has a sayable cut off$")
	public void the_student_has_a_sayable_cut_off() throws Throwable {
		System.out.println("the student has a sayable cut off");
	}

	@Then("^the student is eligible for joining any engineering institude$")
	public void the_student_is_eligible_for_joining_any_engineering_institude() throws Throwable {
		System.out.println("the student is eligible for joining any engineering institude");
	}

}
