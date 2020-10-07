package helper;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.Credentials;
import models.Token;

import static io.restassured.RestAssured.given;

public class TokenHelper {
    public static String get(){
        var credentials = new Credentials("koeluser06@testpro.io","te$t$tudent");
        var response = given()
                .baseUri("https://koelapp.testpro.io/")
                .basePath("api/me")
                .header("Content-Type","application/json")
                .body(credentials)
                .when()
                .post()
                .then()
                .statusCode(200)
                .extract()
                .response();
        var jsonPath = response.jsonPath();
        Token tokenResponse = jsonPath.getObject("$", Token.class);
//        String token = jsonPath.getString("token");
        return tokenResponse.getToken();
    }
}
