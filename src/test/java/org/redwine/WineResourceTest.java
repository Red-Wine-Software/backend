package org.redwine;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class WineResourceTest {

    @Test
    public void testWelcomeEndpoint() {
        given()
          .when().get("/redwine/backend")
          .then()
             .statusCode(200)
             .body(is("Welcome to Red Wine"));
    }

}