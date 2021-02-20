package RestAssuredProject.RestAssuredProject;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test01_Get {

	@Test
	void test_01(){
		
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.contentType());
		System.out.println(response.getTime());
		
		int statuscode = response.getStatusCode();
		Assert.assertEquals(statuscode, 200);
	}
}
