package stepdefinition;

import cucumber.api.java.en.Given;

public class Study_RegularExpressions {
	
	@Given("^I have (\\d+) laptop$")
	public void i_have_laptop(int arg1) throws Throwable {
	    System.out.println("laptop : "+arg1);
	}

	@Given("^I have a (\\d+\\.\\d+) CGPA$")
	public void i_have_a_CGPA(Float CGPA) throws Throwable {
		System.out.println("CGPA : " +CGPA);
	}

	@Given("^\"(.*?)\" is elder to \"([^\"]*)\" and \"([^\"]*)\"$")
	public void is_elder_to_and(String arg1, String arg2, String arg3) throws Throwable {
		System.out.println(arg1+" elder then "+arg2+" and "+arg3); 
	}



}
