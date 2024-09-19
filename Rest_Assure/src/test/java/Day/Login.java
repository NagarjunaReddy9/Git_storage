package Day;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class Login {

    public static void main(String[] args) {
//access token
    	
        RestAssured.baseURI = "http://192.168.5.67:9999";

        String Response = given().log().all().header("Content-Type", "application/json")
        .body(Payload.userbody()).when()
        .post("/user/authenticate")
        .then().assertThat().statusCode(200).extract().response().asString();
        JsonPath js = new JsonPath(Response);
        String token = js.getString("accessToken");
        System.out.println(token);
        
        //create TPA
        String CreateRecord = given().log().all().header("Content-Type", "application/json")
         .header("Authorization", "Bearer " + token) 
         .body(Payload.createtpabody())
         .when().post("/tpa/createTpa")
         .then().assertThat().statusCode(201).extract().response().asString();
        System.out.println(CreateRecord);
        JsonPath js1 = new JsonPath(CreateRecord);
        String id  = js1.getString("tpaId");
        System.out.println(id);
        
      
     // Update TPA record

        String UpdatedRecord = given().log().all().header("Content-Type", "application/json")
            .header("Authorization", "Bearer " + token)
            .body(Payload.updatebody())
            .when().put("/tpa/updateTpa/{tpaId}",id) 
            .then().assertThat().statusCode(200).extract().response().asString();
            System.out.println(UpdatedRecord);        

       
        //Get all TPA
        
       String Getalltpa= given().log().all().header("Content-Type", "application/json")
          .header("Authorization", "Bearer " + token)
          .when().get("/tpa/getAllTpa")
          .then().assertThat().statusCode(200).extract().response().asString();
           System.out.println(Getalltpa);
           
           
        // Delete TPA record
           
           String deletedRecord = given().log().all().header("Content-Type", "application/json")
               .header("Authorization", "Bearer " + token)
               .when().delete("/tpa/deleteTpa/"+id) 
               .then().assertThat().statusCode(200).extract().response().asString();
           System.out.println(deletedRecord);

             
    }

}
