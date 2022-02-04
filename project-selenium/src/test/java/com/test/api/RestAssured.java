package com.test.api;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.basePath;
import org.testng.annotations.Test;

import com.test.pojo.Datum;
import com.test.pojo.Support;
import com.test.pojo.Users;

//import com.test.pojo.Datum;
//import com.test.pojo.Support;
//import com.test.pojo.User;
//import com.test.pojo.Users;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;



@Test
public class RestAssured {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
		public void jsonSchemaValidation() {
			baseURI = "https://reqres.in/";
			basePath = "api";
			
			
			 given().when().get("/users?page=2").then().assertThat()
			 .body(matchesJsonSchemaInClasspath("com/test/schema/schema.json"));
			 
		}
		public void testPostRequest() {
			Header h1=new Header("Content-Type", "application/json");
			Header h2=new Header("Accept-Language", "en-US");
			List<Header> h=new ArrayList<Header>();
			h.add(h1);
			h.add(h2);
			Headers headers=new Headers(h);
			Response res = given().header(h1)
					.body("{\r\n"
							+ "    \"name\": \"Sohrab\",\r\n"
							+ "    \"job\": \"SQA\"\r\n"
							+ "}")
					.when().post("/users").
					then().statusCode(201).extract().response();
			res.body().prettyPrint();
		
		}
		public void testDelete() {
			given().auth().digest("test", "test").when().delete("/users/2").then().statusCode(204);
			given().when().delete("/users/2").then().statusCode(204);
		}
		public void testResonseFromJsonPath1() {
			Response response = given().queryParam("page", "2").
					when().get("/users/");
					
			System.out.println("response: \n" + response.asString());
			
		
	}
		public void testResonseFromJsonPath() {
			Response response = given().queryParam("page", "2").when().get("/users/");
			System.out.println("response: \n" + response.asString());
			
			JsonPath js = new JsonPath(response.asString());
			
			System.out.println(js.getString("page"));
			
			int size = js.getInt("data.size()");
			
			System.out.println("Array Size..... " + size);
			
			String firstName = js.getString("data[1].first_name");
			System.out.println("First name is " + firstName);
			/*
			 * response.then().statusCode(200).body("total_pages", equalTo(2));
			 * response.then().header("server", "cloudflare");
			 */
		}
		public void testResponseFromPOJO() {
			Response response = given().queryParam("page", "2").when().get("/users/");
			System.out.println("response: \n" + response.asString());
			
			Users users = response.getBody().as(Users.class);
			System.out.println("Page::\n" + users.getPerPage());
			
			Support support = users.getSupport();
			System.out.println("Support Text::\n" + support.getText());
			
			System.out.println("Support URL::\n" + support.getUrl());
			
			List<Datum> data = users.getData();
			System.out.println("Data Size::" + data.size());
			for (int i = 0; i < data.size(); i++) {
				System.out.println("Iteration ::"+(i+1));
//				if ((data.get(i).getId()) == 9) {
					System.out.println(data.get(i).getEmail());
					System.out.println(data.get(i).getFirstName());
					System.out.println(data.get(i).getLastName());
				//	data.get(i).setLastName("Testing");
					//break;
				//}
			}
		}
		public void postFromPOJO() {
			//User user = new User();
			//user.setName("Sohrab_15thSep");
			//user.setJob("QA");
		//	Response res = given().header("Content-Type", "application/json").body(user).when().post("/users").then()
		//			.statusCode(201).extract().response();
		//	res.body().prettyPrint();
		}
		public void testFileUpload() {
			Response response = given().multiPart("file", new File("")).post("/upload");
		}
	}

