package petStoreTestApi;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.PetResponse;
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
        JsonPath body = response.jsonPath();
        PetResponse hamster = body.getObject("$", PetResponse.class);

        Assert.assertEquals(hamster.getName(),"NutCracker");
        Assert.assertEquals(hamster.getStatus(),"available");
        Assert.assertEquals(hamster.getId(),1000);
        Assert.assertEquals(hamster.getCategory().getName(),"Hamsters");
        Assert.assertEquals(hamster.getCategory().getId(),25);

    }
}
