import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.path.json.JsonPath;


import static org.hamcrest.Matchers.*;

import org.testng.Assert;

import Files.Payload;

import org.testng.*;


//import files.ReUsableMethods;
//import files.payload;


//import io.restassured.RestAssured;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		// Validate if Addplace API is working as expected
		//principle of rest assured are
		
		//1.given- all inputs given for API
		//2.when- submit the API here(using get post put etc)--contains resource and http methods
		//3.then-validate the response(by adding status code here) using assertions
		//4.use log after given to see what details were given in o/p and after then to see or log the o/p.
		
		//1st.step--set up base urI and add place
		//directly place the request body withing"" for body method
		
		RestAssured.baseURI= "https://rahulshettyacademy.com";
		
		//ADD(POST METHOD) place and get the ID
	String response=
	given().log().all().header("Content-Type", "application/json").queryParam("key", "qaclick123")
	.body(Payload.AddPlace()).
	when().post("maps/api/place/add/json").
	then().assertThat().statusCode(200).body("scope",equalTo("APP")).
	       header("Server", "Apache/2.4.18 (Ubuntu)").extract().response().asString();
	
	System.out.println(response);
	
	//here we use header and body method again for checking the response from results like server(very imp validation) or scope
		//user all assertions after assert method.
		
	/*2nd.step-----TO get the unique ID or place iD generated from the addplace post method result and update the add place with
	new address and check if it is updated or not--this covers end to end automation */
	
	/*extract response as string by using respinse method.... remove logall and use respinse to test it...modifying same code above*/
	
	/*response is in json format we need to extarct this json by parsing using JSON path --for json parsing*/
	
	
	
	JsonPath js= new JsonPath(response);
	String place_id=js.getString("place_id");
	
	System.out.println(place_id);
	
	
	//PUT METHOD-to update place with extracted place id from above respone: we use PUT to update:
	
	given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json").body(
			"{\r\n"
			+ "\"place_id\":\""+place_id+"\",\r\n"
			+ "\"address\":\"70 winter walk, Africa\",\r\n"
			+ "\"key\":\"qaclick123\"\r\n"
			+ "}").
	when().put("maps/api/place/update/json").
	then().assertThat().log().all().statusCode(200).body("msg",equalTo("Address successfully updated"));
	
	
	// GET place--to verify if the place is added or not
	String Update_Response=
	given().log().all().queryParam("key", "qaclick123").queryParam("place_id", place_id).
	when().get("maps/api/place/get/json").
	then().assertThat().statusCode(200).extract().response().asString();
	
	
	JsonPath js2=new JsonPath(Update_Response);
	String updated_Address=js2.getString("address");

	System.out.println(updated_Address);
	
	//expected output is the output we give and actual is what script is generated
	Assert.assertEquals("70 winter walk, Africa",updated_Address);
}
}

