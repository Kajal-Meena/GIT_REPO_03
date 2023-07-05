package Common_API_Method;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class Patch_API_Method {
	
	public static int ResponseStatusCode(String BaseURI,String Resource,String RequestBody) {
		
		RestAssured.baseURI = BaseURI;
		
		int statusCode = given().header("content-type","application/json")
				.body(RequestBody).when().patch(Resource).then().extract()
				.statusCode();
		return statusCode ;
	}
		
	public static String ResponseBody(String BaseURI,String Resource,String RequestBody) {
			
		RestAssured.baseURI = BaseURI;
			
		String Responsebody = given().header("content-type","application/json")
				.body(RequestBody).when().patch(Resource).then().extract()
				.response().asPrettyString();
		return Responsebody;
		

	}

}