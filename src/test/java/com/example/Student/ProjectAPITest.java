package com.example.Student;

import org.junit.Test;
import org.junit.runner.RunWith;
import static io.restassured.RestAssured.given;
import net.serenitybdd.junit.runners.SerenityRunner;
import io.restassured.response.Response;

@RunWith(SerenityRunner.class)
public class ProjectAPITest extends BaseAPITest {

    @Test
    public void getProjectByIdValid() {
        int projectId = 1;

        // Send the request and extract the response
        Response response = given()
                .pathParam("project_id", projectId)
                .when()
                .get("/{project_id}")
                .then()
                .statusCode(200)
                .extract().response(); // Extract the complete response

        // Print the response body
        String responseBody = response.getBody().asString();
        System.out.println("Response Body: " + responseBody);

    }
}
