package stepdefs;

import org.junit.Assert;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefs_When {

	 Scenario scn;
	ScnContext cntxt;
	
	public StepDefs_When(ScnContext cntxt) {
		this.cntxt = cntxt;
		scn = cntxt.s;
	}

	@When("I add these numbers")
	public void i_add_these_numbers() {
		cntxt.result = cntxt.num1 + cntxt.num2;
		scn.write("Numbers added. Result: " + cntxt.result);
		
	}


	
}
