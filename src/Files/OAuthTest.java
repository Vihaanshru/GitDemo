package Files;
import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;

import static io.restassured.RestAssured.*;
import io.restassured.path.json.JsonPath;


import static org.hamcrest.Matchers.*;

import java.io.File;

import org.testng.Assert;

import Files.Payload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.*;

public class OAuthTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//WORKING CODE
		
		//Step 1: Getting the authorization code by hitting Authorization server.(this step needs to be donein browser 
		//by using Selenium-open browser and perform)
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vihaan");
		
	//	WebDriver driver=new ChromeDriver();
	//	driver.get("https://accounts.google.com/o/oauth2/v2/auth/oauthchooseaccount?scope=https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email&auth_url=https%3A%2F%2Faccounts.google.com%2Fo%2Foauth2%2Fv2%2Fauth&client_id=692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com&response_type=code&redirect_uri=https%3A%2F%2Frahulshettyacademy.com%2FgetCourse.php&flowName=GeneralOAuthFlow");
//		driver.findElement(By.id("name")).sendKeys("");
//		driver.findElement(By.id("next")).click();
//		driver.findElement(By.id("pwd")).sendKeys("");
	  //   Thread.sleep(20000);
	     
	   //  String url=driver.getCurrentUrl();
		
	     String url="https://rahulshettyacademy.com/getCourse.php?code=4%2F0AX4XfWgOh6naTm34jMqxHMfdnBgU5_u5W3YWo4eQRYnB5F4LxlaWRMu08v6NdTSfSAnAaw&scope=email+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email+openid&authuser=0&prompt=consent#";
	     /*
	      * https://rahulshettyacademy.com/getCourse.php?code=4%2F0AX4XfWhEEZNpm1cqhYFH480RvQOAcayOfY054qaqAKjKoHy5-q4S4ueOcQ3shUpTrVEp0w&scope=email+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email+openid&authuser=0&prompt=consent#
	      * */
		//Use split in java to split entire string in 2 index using delimeter'='...this isvery imp
	     
	    String partialcode= url.split("code=")[1];
	   String code= partialcode.split("&scope")[0];
	   
	   System.out.println(code);
	     
	
		
		
		
		//Step 2:Use the code from above step and Hitting the resource server to get access token.
	   //For Client credentials --when application requests for own data--example--(application and application)
	   //Example--Book FLight and offers of the hotel--> 
	   //Rahulshetty academy integrates with twitter for his account so he can show these tweets in rahulshettyacademy
	   //For client credentials--you dont need step 1.starts with step2
		String accessTOkenResponse=given().urlEncodingEnabled(false).
		queryParams("code",code).
		queryParams("client_id","692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com").
		queryParams("client_secret","erZOWM9g3UtwNRj340YYaK_W").
		//queryParams("scope","https://www.googleapis.com/auth/userinfo.email").
		queryParams("redirect_uri","https://rahulshettyacademy.com/getCourse.php").
		queryParams("grant_type","authorization_code").
		
		when().log().all().post("https://www.googleapis.com/oauth2/v4/token").asString();
		
		//System.out.println(accessTOkenResponse);
		
		JsonPath js=new JsonPath(accessTOkenResponse);
		String access_token=js.getString("access_token");
		
		//Step 1:Using the access token from above and go back to client(Application ) for performing our first actuall get request(getting course detiails)
		//Going bottom-up approach- this is the last step before OAuth mechanism implementation:
		String response=given().queryParam("access_token", access_token).
		when().log().all().get("https://rahulshettyacademy.com/getCourse.php").asString();

		System.out.println(response);
}
}