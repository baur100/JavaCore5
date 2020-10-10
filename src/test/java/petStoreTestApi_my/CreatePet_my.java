package petStoreTestApi_my;

import helpers_my.TestDataGenerator_my;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models_my.PetRequest_my;
import models_my.PetResponse_my;
import org.openqa.selenium.json.Json;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class CreatePet_my {
    private long petId;
    @AfterMethod
    public void tearDown(){
        Response response = given()
                .baseUri("https://petstore.swagger.io/v2/pet/"+petId)
                .when()
                .delete();
    }
    @Test
    public void createPet(){
        PetRequest_my petRequest = TestDataGenerator_my.postRandomPet();
        Response response = given()
                .baseUri("https://petstore.swagger.io/v2/pet")
                .header("Content-Type", "application/json")
                .body(petRequest)
                .when()
                .post()
                .then()
                .statusCode(200)
                .extract()
                .response();
        JsonPath jsonPath = response.jsonPath();
        PetResponse_my petResponse = jsonPath.getObject("$", PetResponse_my.class);
        System.out.println(petResponse.getId());
        petId = petResponse.getId();
        Assert.assertEquals(petRequest.getStatus(),petResponse.getStatus());
        Assert.assertEquals(petRequest.getName(),petResponse.getName());
        Assert.assertEquals(petRequest.getCategory().getCategory_id(),petResponse.getCategory().getCategory_id());


        String nameResponse = jsonPath.getObject("name", String.class);
        System.out.println(nameResponse);
        String nameResponse1 = jsonPath.getString("name");
        System.out.println(nameResponse1);
    }
}
