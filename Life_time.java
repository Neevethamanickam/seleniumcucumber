package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Life_time {


@Given("^i was studying (\\d+)th$")
public void i_was_studying_th(int arg1) throws Throwable {
    System.out.println("i was studying "+arg1);
    }

@When("^i  studied well$")
public void i_studied_well() throws Throwable {
	System.out.println("i  studied well");
}

@Then("^i got (\\d+)% in SSLC$")
public void i_got_in_SSLC(int arg1) throws Throwable {
	System.out.println("i got "+arg1+"% in SSLC$");
}

@When("^i did not studied well$")
public void i_did_not_studied_well() throws Throwable {
	System.out.println("i did not studied well");
}

@Then("^i got (\\d+)% in HSC$")
public void i_got_in_HSC(int arg1) throws Throwable {
	System.out.println("i got "+arg1+" % in HSC");
}

@Given("^i was joined CS department with deepi$")
public void i_was_joined_CS_department_with_deepi() throws Throwable {
	System.out.println("i was joined CS department with deepi");
}

@When("^we both did group study$")
public void we_both_did_group_study() throws Throwable {
	System.out.println("we both did group study");
}

@Then("^we both got graduated in (\\d+)$")
public void we_both_got_graduated_in(int arg1) throws Throwable {
	System.out.println("we both got graduated in "+arg1);
}

@Given("^i got oppertunity in virtusa$")
public void i_got_oppertunity_in_virtusa() throws Throwable {
	System.out.println("i got oppertunity in virtusa");
}

@When("^i joined the company$")
public void i_joined_the_company() throws Throwable {
	System.out.println("i joined the company");
}

@Then("^i bring the bacon to my home$")
public void i_bring_the_bacon_to_my_home() throws Throwable {
	System.out.println("i bring the bacon to my home");
}

@Then("^my family was so happy for me$")
public void my_family_was_so_happy_for_me() throws Throwable {
	System.out.println("my family was so happy for me");
}


}
