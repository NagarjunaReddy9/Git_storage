package Day;

import org.testng.annotations.Test;

import jdk.internal.net.http.common.Log;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;


public class Rest_HTTP_Request_1 {
	//different type of http requests
	
	
	int id;
	
	@Test(priority = 1)
	
	  void getusers() {
		given()
		 
		 .when()
		 .get("https://reqres.in/api/users?page=2")
		 
		 .then()
		 .statusCode(200)
		 .body("page",equalTo(2))
		 .log().all();
		
	}
	  
	@Test(priority = 2)
	void CreateUser() {
		
		HashMap hm=new HashMap();
		hm.put("name","pavan");
		hm.put("job", "trainer");
		
		
		id=given()
		.contentType("application/json")
         .body(hm)	
         
		.when()
		.post("https://reqres.in/api/users")
		 .jsonPath().getInt("id");
		
		
		/*.then()
		 .statusCode(201)
		 .log().all();
		 	*/
	}
	@Test(priority = 3,dependsOnMethods = {"CreateUser"})
	
void updateUser() {
		
		HashMap hm=new HashMap();
		hm.put("name","naga");
		hm.put("job", "testing");
		
		
	given()
		.contentType("application/json")
         .body(hm)	
         
		.when()
		.put("https://reqres.in/api/users/"+id)
		 
		
		
		.then()
		 .statusCode(200)
		 .log().all();
		 	
	}
	@Test(priority = 4)
	void deleteuser() {
		given()
		
		.when()
		.delete("https://reqres.in/api/users/"+id)
		
		.then()
		.statusCode(204)
		.log().all();
		
	}

}
