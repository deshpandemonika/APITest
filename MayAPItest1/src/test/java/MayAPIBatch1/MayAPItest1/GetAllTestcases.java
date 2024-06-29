package MayAPIBatch1.MayAPItest1;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class GetAllTestcases {
	public static void main(String[] args)
	{
		Response res=
		given().
		contentType(ContentType.JSON)
		.when()
		.get("https://dummy.restapiexample.com/api/v1/employee/1");
		
		System.out.println("Response stause code"+res.statusCode());
		System.out.println("Response data code"+res.asString());
		
	}


}
