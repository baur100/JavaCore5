package helper;

import models.Token;

import static io.restassured.RestAssured.given;

public class Data {
    public static models.Data get(){
        String token = TokenHelper.get();
        var response = given()
                .baseUri("https://koelapp.testpro.io/")
                .basePath("api/data")
                .header("Authorization","Bearer "+token)
                .when()
                .get()
                .then()
                .statusCode(200)
                .extract()
                .response();
        var jsonPath = response.jsonPath();
        return jsonPath.getObject("$", models.Data.class);
    }
}
