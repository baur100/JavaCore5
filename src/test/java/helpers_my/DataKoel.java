package helpers_my;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.Data;
import models_my.DataKoelResponse;
import models_my.TokenKoel;

import static io.restassured.RestAssured.given;

public class DataKoel {
    public static DataKoelResponse get(){
        String token = TokenHelper_my.get();
        var response = given()
                .baseUri("https://koelapp.testpro.io/")
                .basePath("api/data")
                .header("Authorization", "Bearer "+token)
                .when()
                .get()
                .then()
                .statusCode(200)
                .extract()
                .response();
        JsonPath jsonPath = response.jsonPath();
        return jsonPath.getObject("$", DataKoelResponse.class);
    }
}
