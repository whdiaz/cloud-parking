package one.digitalinnovation.parking.controller;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.rsocket.server.LocalRSocketServerPort;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ParkingControllerIT {

    @LocalServerPort
    private int randomPort;

    @BeforeEach
    public void setUpTest(){
        RestAssured.port = randomPort;
    }


    @Test
    void whenFinAllCheckResult() {
        RestAssured.given()
                .when()
                .get("/parking")
                .then()
                .extract().response().body().prettyPrint();
    }

    @Test
    void create() {
    }
}