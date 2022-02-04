package deepti.selenium.project_selenium;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;

import org.junit.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import junit.framework.Assert;
import static org.junit.Assert.*;
//import static org.hamcrest.equalto;

public class testApi {

	@BeforeClass
	public void setup() {
		
		RestAssured.baseURI = "https://petstore.swagger.io";
		
	}	
		@Test
		public void testAPI() {
		}
		
   	     Response response1 = given().header("accept", "application/xml").
   		 when().get("v2/pet/findByStatus?status=pending");
   	 
   	     
   	    
   	     ValidatableResponse response = given().when().get("v2/pet/findByStatus?status=pending").then().statusCode(200);
   	        
	   // Response response = given().when().get("/v2/pet/findByStatus?status=pending");//.then().statusCode(200).then().contentType("application/json");
		
		
		//System.out.println(response.asPrettyString());
		
		//Assert.assertEquals(200,response1.statusCode());
   	    
   	     
   	   

}

