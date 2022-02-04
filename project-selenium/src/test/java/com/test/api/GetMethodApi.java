package com.test.api;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

import java.util.ArrayList;
import java.util.List;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class GetMethodApi {
	
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
}
