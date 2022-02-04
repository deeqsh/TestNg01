package deepti.selenium.project_selenium;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

//import org.junit.Test;

/**
 * Unit test for simple App.
 */

public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    
    
    public void testAPI (){
    
    	RestAssured.baseURI = "https://petstore.swagger.io";
    	 //Response response = given().
    		//	 when().get("v2/pet/findByStatus?status=pending");
    	// System.out.println(response.asString());
    	
		Response response = given().when().get("/v2/pet/findByStatus?status=pending");
		
		response.then().statusCode(200);
		response.then().contentType("application/json");
		System.out.println(response.asString());
		Assert.assertEquals(200,response.statusCode());

    }
    }

