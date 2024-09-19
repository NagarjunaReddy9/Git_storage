package Day;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class Data_parametarization {
    @Test
   
    public void dataadd() {
      
        RestAssured.baseURI = "http://192.168.5.67:9999";
       
        String res = given()
            .header("Content-Type", "application/json").header("Authorization","Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZG1pbkBvamFzLWl0LmNvbSIsImlhdCI6MTcxNDQ3ODk0NX0.gdoNofIoTuJXsrjWLNvRo3rK3526WVTpgH2mxmiZGnE")
            .body(Payload.addpost())
        .when()
            .post("/tpa/createTpa")
        .then()
            .assertThat().statusCode(201)
            .extract().response().asString();
         System.out.println(res);
         
         
        JsonPath js = new JsonPath(res);
        String id  = js.getString("tpaId");
        System.out.println(id);
    
    }
    
}
