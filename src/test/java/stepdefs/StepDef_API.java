package stepdefs;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class StepDef_API {
	String baseUri = "http://localhost:3030";
	RequestSpecification _REQ_SPEC;
	Response _RESP;
	ValidatableResponse _VALIDATABLE_RESP;
	//_VALIDATABLE_RESP.assertThat().body("id", equalTo(9132294));

	Scenario scn;
	@Before
	public void BeforeHook(Scenario s) {
		this.scn = s;
	}
	
	@Given("I have API")
	public void i_have_API() {
		_REQ_SPEC = given().baseUri(baseUri);
		
	}

	@When("I Hit API with product id as {int}")
	public void i_Hit_API_with_product_id_as(Integer int1) {
		_RESP = _REQ_SPEC.when().get("/products/" + int1);
		scn.write("Response returned as: " + _RESP.asString());
	}

	@Then("status code comes as {int}")
	public void status_code_comes_as(Integer int1) {
		_VALIDATABLE_RESP = _RESP.then();
		_VALIDATABLE_RESP.statusCode(int1);
	}

	@Then("json body contain product id as {int}")
	public void json_body_contain_product_id_as(Integer int1) {
		_VALIDATABLE_RESP.body("id", equalTo(int1));
	}

}
