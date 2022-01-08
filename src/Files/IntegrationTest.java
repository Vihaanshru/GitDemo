package Files;
import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;

import static io.restassured.RestAssured.*;
import io.restassured.path.json.JsonPath;


import static org.hamcrest.Matchers.*;

import java.io.File;

import org.testng.Assert;

import Files.Payload;

import org.testng.*;


public class IntegrationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Integration of Query and path params */
		
		RestAssured.baseURI= "http://localhost:8080";
		SessionFilter session = new SessionFilter();
		String response=given().header("Content-Type","application/json").body("{\r\n"
				+ "    \"username\": \"shrutiim07\",\r\n"
				+ "        \"password\": \"Vihaan2020!\"\r\n"
				+ "    }\r\n"
				+ "}").
				log().all().filter(session).
		when().post("/rest/auth/1/session").
		then().log().all().extract().response().asString();
		
		
		//Getting response using path and query param using queryPparam method
		/* As per definition--path parameter identifes particular issue with ID where as 
		 * query parameter gives or sorts the results from the existing issue.*/
		 
		String getResponse=given().pathParam("key", "10001").queryParam("fields", "comment").
				log().all().header("Content-Type","application/json").filter(session).
		when().get("/rest/api/2/issue/{key}").
		then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		System.out.println(getResponse);
		
	}

}
