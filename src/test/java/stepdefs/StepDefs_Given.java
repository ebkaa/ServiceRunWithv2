package stepdefs;

import org.junit.Assert;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefs_Given {

	 ScnContext cntxt;
	 Scenario scn;
	
	public StepDefs_Given(ScnContext cntxt) {
		this.cntxt = cntxt;
	}

	@Before
	public void BeforeHook(Scenario s) {
		cntxt.s = s;
		scn = s;
	}
	
	@After
	public void AfterHook(Scenario s) {
		cntxt.s.write("Scn is completed with status as: " + scn.isFailed());
	}
	
	@Given("I have two numbers {int} and {int}")
	public void i_have_two_numbers_and(Integer int1, Integer int2) {
		cntxt.num1 = int1;
		cntxt.num2 = int2;
		
		scn.write("Numbers to be added as : Num1: " + cntxt.num1 + " 2nd number: " + cntxt.num2);
		
	}




	
}
