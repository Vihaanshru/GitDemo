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
public class JiraTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Working code E2E
		
		/*Steps to Automate in JIRA APP: By Rahul shetty
		 * 1.Login to JIRA to create Session Using Login API
		 * 2.Add a comment to existing issue using Add Comment API
		 * 3.Add an attachment to existing issue using Add attachments API
		 * 4.Get issue details and verify if added attachment and comments exists using GetIssue API.
		 * Very Imp: Parsing nested complex Json.and getting any field value and 
		 * limiting Json response through query parameter(if you have 48 fields you can cut short to 1 field)
		 */

		RestAssured.baseURI= "http://localhost:8080";
		
		//This step is for creating session:
		//The session ID generated here is used in subsequent steps for authentication.
		//use Session Filter Object to store the Session ID-Very Imp Int ques.
		//Use this filter method before when in the session creation step
		//Adding relaxedHttpsvalidation to bypass any http methods you have.should be given after given method.
		
		
		SessionFilter session = new SessionFilter();
		
		String response=given().relaxedHTTPSValidation().header("Content-Type","application/json").body("{\r\n"
				+ "    \"username\": \"shrutiim07\",\r\n"
				+ "        \"password\": \"Vihaan2020!\"\r\n"
				+ "    }\r\n"
				+ "}").
				log().all().filter(session).
		when().post("/rest/auth/1/session").
		then().log().all().extract().response().asString();
		
		//Add comments:
		//Once Session is created use session ID to add comments
		//use filter method here also to pass the session from above
		//Session is nothing but --saying that ur logged in and passing your login cred
		//Add it before When method
		String expectedmessage="Hi How are you?";
		String AddCommentsresponseID=given().pathParam("key", "10001").log().all().header("Content-Type","application/json").body("{\r\n"
				+ "    \"body\": \""+expectedmessage+"\",\r\n"
				+ "    \"visibility\": {\r\n"
				+ "        \"type\": \"role\",\r\n"
				+ "        \"value\": \"Administrators\"\r\n"
				+ "    }\r\n"
				+ "}").log().all().filter(session).
		when().post("/rest/api/2/issue/{key}/comment").
		then().log().all().assertThat().statusCode(201).extract().response().asString();
		
		JsonPath js1=new JsonPath(AddCommentsresponseID);
		String commentID=js1.getString("id");
		
		
		//Add Attachemnt--USE MULTIPART METHOD-key point and header as multipart
		//syntax=curl -D- -u admin:admin -X POST -H "X-Atlassian-Token: no-check" -F "file=@myfile.txt" http://myhost/rest/api/2/issue/TEST-123/attachments
		//H stands for header- 
		//admin:admin is user name and password 
		//F is the file attaching 
		given().header("X-Atlassian-Token","no-check").filter(session).pathParam("key", "10001").
		header("Content-Type","multipart/form-data").multiPart("file",new File("Jira")).
		when().post("/rest/api/2/issue/{key}/attachments").
		then().log().all().assertThat().statusCode(200); 
		
		
		//Getting response using path and query param using queryPparam method
		/* As per definition--path parameter identifes particular issue with ID where as 
		 * query parameter gives or sorts the results from the existing issue.*/
		 
		String getResponse=given().pathParam("key", "10001").queryParam("fields", "comment").
				log().all().header("Content-Type","application/json").filter(session).
		when().get("/rest/api/2/issue/{key}").
		then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		System.out.println(getResponse);
		
		JsonPath js=new JsonPath(getResponse);
		int commentscount=js.getInt("fields.comment.comments.size()");
		
		
		for(int i=0;i<commentscount;i++)
		{
			
			//if you are not sure what return method it 
			//gives use get method and convert to string so you can store as string like below.
			String exCommentID=js.get("fields.comment.comments["+i+"].id").toString();
			if(exCommentID.equalsIgnoreCase(commentID))
				
			{
			String message=	js.get("fields.comment.comments["+i+"].body").toString();
				System.out.println(message);
				Assert.assertEquals(message, expectedmessage);
			}
			
			
		}
		
		
		}
		
	}


