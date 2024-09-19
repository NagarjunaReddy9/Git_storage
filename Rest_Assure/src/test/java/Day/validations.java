package Day;

import org.testng.Assert;

import groovy.transform.EqualsAndHashCode;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ResponseBody;

public class validations {
	public static void main(String[] args) {
		JsonPath js=new JsonPath(Payload.locations());
	
		int count=js.getInt("tpaId.size()");
		System.out.println(count);
	
 
		
	    //String firstHeaderName = js.get("tpaHeaders[0].headerName");
	  //  System.out.println(js);

	}

}
