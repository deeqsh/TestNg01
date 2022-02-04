package deepti.selenium.project_selenium;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class testbookstore {

	@Test
	public void test() {
		RestAssured.baseURI = "https://www.demoqa.com" ;
   	//Response response = given().Account/v1/User/{UUID
   	//	 when().get("-H "accept:application/json");
   //	System.out.println(response.asString());
   	
		Response response = given().when().get("Account/v1/User/{UUID");
		
		
		response.then().statusCode(200);
		response.then().contentType("application/json");
		System.out.println(response.asString());
		Assert.assertEquals(401,response.statusCode());
		
		
		

	}

}
