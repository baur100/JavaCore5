package apiKoel_my;

import enums_my.BrowserType_my;
import helper.TestDataGenerator;
import helpers_my.BrowserFabric_my;
import helpers_my.TestDataGenerator_my;
import helpers_my.TokenHelper_my;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.Playlist;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PlaylistRename {
    private String token;
    private String playlistId;

    @BeforeClass
    public void runFirst() {
        token = "Bearer " + TokenHelper_my.get();
    }
    @BeforeMethod
    public void sturtUp() throws NoSuchMethodException {
        Playlist createPlaylist = TestDataGenerator.createPlaylistRequest();
        Response response = given()
                .baseUri("https://koelapp.testpro.io/")
                .basePath("api/playlist")
                .header("Content-Type","application/json")
                .header("Authorization",token)
                .body(createPlaylist)
                .when()
                .post()
                .then()
                .statusCode(200)
                .extract()
                .response();
        JsonPath jsonPath = response.jsonPath();
        Playlist responsePlaylist = jsonPath.getObject("$",Playlist.class);
        Assert.assertEquals(createPlaylist.getName(),responsePlaylist.getName());
        playlistId=responsePlaylist.getId()+"";
    }
    @AfterMethod
    public void tearDown(){
                 given()
                .baseUri("https://koelapp.testpro.io/api/playlist/"+playlistId)
                .header("Authorization", token)
                .when()
                .delete();

    }
    @Test
    public void renamePlaylist(){
        String newName = TestDataGenerator_my.randomString(8);
        models_my.Playlist pl = new models_my.Playlist(newName);
        Response response = given()
                .baseUri("https://koelapp.testpro.io/")
                .basePath("api/playlist/"+playlistId)
                .header("Content-Type","application/json")
                .header("Authorization",token)
                .body(pl)
                .when()
                .put()
                .then()
                .statusCode(200)
                .extract()
                .response();
        JsonPath jsonPath = response.jsonPath();
        Playlist responsePlaylist = jsonPath.getObject("$",Playlist.class);
        Assert.assertEquals(newName, responsePlaylist.getName());
        Assert.assertEquals(playlistId, responsePlaylist.getId()+"");
    }
}
