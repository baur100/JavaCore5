package petStoreTestApi;

import helper.TestDataGenerator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.Category;
import models.PetRequest;
import models.PetResponse;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class CreatePet {
    private long petId;
    @AfterMethod
    public void tearDown(){
        given().baseUri("https://petstore.swagger.io/v2/pet/"+petId).when().delete();
    }
    @Test
    public void createPet(){
        PetRequest petRequest = TestDataGenerator.getPet();
        Response response = given()
                .baseUri("https://petstore.swagger.io/v2")
                .basePath("/pet")
                .header("Content-Type","application/json")
                .body(petRequest)
                .when()
                .post()
                .then()
                .statusCode(200)
                .extract()
                .response();
        JsonPath jsonPath = response.jsonPath();
        PetResponse petResponse = jsonPath.getObject("$",PetResponse.class);
//        petRequest.setName("Wrong");
//        System.out.println(petResponse.getId());
        petId=petResponse.getId();
        Assert.assertEquals(petRequest.getStatus(),petResponse.getStatus());
        Assert.assertEquals(petRequest.getName(),petResponse.getName());
        Assert.assertEquals(petRequest.getCategory().getName(),petResponse.getCategory().getName());


//        Category categoryResponse = jsonPath.getObject("category",Category.class);
//        System.out.println(categoryResponse.getName());
        String petStatusResponse = jsonPath.getString("status");
        System.out.println(petStatusResponse);

        long id = jsonPath.getLong("id");
        System.out.println(id);
    }
}
