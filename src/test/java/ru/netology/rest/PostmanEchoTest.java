package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

class PostmanEchoTest {

    @Test
    void shouldReturnSendData() {
        given()
                .baseUri("https://postman-echo.com")
                .body("Hello")
                .when().log().all()
                .post("/post")
                .then().log().all()
                .statusCode(200)
                .body("data", org.hamcrest.Matchers.equalTo("Hello"));

    }
}
