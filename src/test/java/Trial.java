
import static io.restassured.RestAssured.*;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.Matchers.*;
public class Trial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//I hit http://localhost:3030/products/9132294
		
		//ApI respopns code will be 200
		
		//Then i get Json response with body with the product 
		
		String baseUri = "http://localhost:3030";
		given().baseUri(baseUri).
		when().get("/products/9132294").
		then().assertThat().statusCode(200).
		and().body("id", equalTo(9132294));
		
		//Another way of Doing it
		RequestSpecification _REQ_SPEC = given().baseUri(baseUri);
		Response _RESP = _REQ_SPEC.when().get("/products/9132294").thenReturn();
		//ValidatableResponse _VALIDATABLE_RESP = _RESP.then();
		//_VALIDATABLE_RESP.assertThat().body("id", equalTo(9132294));
		int id = _RESP.jsonPath().getInt("id");
	
		
	}

}
