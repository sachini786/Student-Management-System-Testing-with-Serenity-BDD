package com.example.Student;

import net.serenitybdd.rest.SerenityRest;
import org.junit.BeforeClass;
import io.restassured.RestAssured;

public class BaseAPITest {

    @BeforeClass
    public static void setup() {
        RestAssured.baseURI = "http://localhost:8080/api";
        RestAssured.basePath = "/projects";
    }
}
