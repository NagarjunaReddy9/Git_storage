package Rest_Demo;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;

import org.testng.annotations.Test;



public class Traffic {
	r
	public static void main(String[] args) {
		
		@Test(priority = 1)
		
		  void getusers() {
			given()
			 
			 .when()
			 .get("https://reqres.in/api/users?page=2")
			 
			 .then()
			 .statusCode(200)
			 .body("page",equals(2))
			 .log().all();
			
		}
	}

}
