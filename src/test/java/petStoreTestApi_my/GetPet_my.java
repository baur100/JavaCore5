package petStoreTestApi_my;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models_my.PetResponse_my;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class GetPet_my {
    @Test
    public void getPetById_PetReturned(){
        //Var 1
        Response response = given()
                .baseUri("https://petstore.swagger.io/v2")
                .basePath("/pet/1111")
                .when()
                .get()
                .then()
                .statusCode(200)
                .extract()
                .response();
        JsonPath body = response.jsonPath();
//        System.out.println(body.prettify());

        PetResponse_my mouse = body.getObject("$", PetResponse_my.class);
        Assert.assertEquals(mouse.getName(), "Mickey");
        Assert.assertEquals(mouse.getStatus(), "available");
        Assert.assertEquals(mouse.getId(), 1111);
        Assert.assertEquals(mouse.getCategory().getCategory_name(), "Mouse");
        Assert.assertEquals(mouse.getCategory().getCategory_id(), 26);

//String body = response.asString();
//        Assert.assertTrue(body.contains("Mickey"));

//        System.out.println(response.asString());
        //Var 2
//                given()
//                .baseUri("https://petstore.swagger.io/v2")
//                .basePath("/pet/1001")
//                .when()
//                .get()
//                .then()
//                .statusCode(200);
    }
}
