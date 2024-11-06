package stepdefs;

import org.junit.Assert;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefs_Then {

	 Scenario scn;

	ScnContext cntxt;
	public StepDefs_Then(ScnContext cntxt) {
		this.cntxt = cntxt;
		scn = cntxt.s;
	}
	

	@Then("Result is {int}")
	public void result_is(Integer expected) {

		if (cntxt.result==expected) {
			Assert.assertTrue(true);
			scn.write("Result matched with expected");
		}else {
			scn.write("Result did not match with expected");
			Assert.assertTrue(false);
		}
	}

	
}
