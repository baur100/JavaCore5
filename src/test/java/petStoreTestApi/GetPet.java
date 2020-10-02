package petStoreTestApi;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetPet {
    @Test
    public void getPetById_PetReturned() {
        Response response = given()
                .baseUri("https://petstore.swagger.io/v2")
                .basePath("/pet/1000")
                .when()
                .get()
                .then()
                .statusCode(200)
                .extract()
                .response();
        String body = response.asString();
        Assert.assertTrue(body.contains("NutCracker"));
    }
}
