package helpers_my;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models_my.CredentialsKoel;
import models_my.TokenKoel;

import static io.restassured.RestAssured.given;

public class TokenHelper_my {
    public static String get(){
        var credentials = new CredentialsKoel("koeluser06@testpro.io", "te$t$tudent");
        Response response = given()
                .baseUri("https://koelapp.testpro.io/")
                .basePath("api/me")
                .header("Content-Type", "application/json")
                .header("Authorization","Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOjM3LCJpc3MiOiJodHRwczovL2tvZWxhcHAudGVzdHByby5pby9hcGkvbWUiLCJpYXQiOjE2MDIxMDg3ODcsImV4cCI6MTYwMjcxMzU4NywibmJmIjoxNjAyMTA4Nzg3LCJqdGkiOiI3UUM1ZUh4ZllaYkV4RkpDIn0.FGUeAHrxJmaXhS2wj1g2lDQsV-yZOLA3r-sCgupwTzM")
                .body(credentials)
                .when()
                .post()
                .then()
                .statusCode(200)
                .extract()
                .response();
        JsonPath jsonPath = response.jsonPath();
        TokenKoel tokenResponse = jsonPath.getObject("$", TokenKoel.class);
//        String token = jsonPath.getString("token");
        return tokenResponse.getToken();
    }
}
