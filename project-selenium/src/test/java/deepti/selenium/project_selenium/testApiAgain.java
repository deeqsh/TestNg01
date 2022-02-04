package deepti.selenium.project_selenium;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class testApiAgain {

	@Test
	public void test() {
		RestAssured.baseURI = "https://petstore.swagger.io";
	   	 //Response response = given().
	   		//	 when().get("v2/pet/findByStatus?status=pending");
	   	// System.out.println(response.asString());
	   	
			Response response = given().when().get("/v2/pet/findByStatus?status=pending");
			
			response.then().statusCode(200);
			response.then().contentType("application/json");
			System.out.println(response.asString());
			AssertJUnit.assertEquals(200,response.statusCode());
	}

}
