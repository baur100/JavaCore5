package apiKoel_my;

import helpers_my.TestDataGenerator_my;
import helpers_my.TokenHelper_my;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models_my.PlaylistKoel;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PlaylistManagement_my {
    private int playlistId;
    private String token;

    @BeforeClass
    public void beforeAll() {
        token = TokenHelper_my.get();
    }

//    @AfterMethod
//    public void tearDown() {
//        Response response = given()
//                .baseUri("https://koelapp.testpro.io/api/playlist" + playlistId)
//                .header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOjM3LCJpc3MiOiJodHRwczovL2tvZWxhcHAudGVzdHByby5pby9hcGkvbWUiLCJpYXQiOjE2MDIxMDg3ODcsImV4cCI6MTYwMjcxMzU4NywibmJmIjoxNjAyMTA4Nzg3LCJqdGkiOiI3UUM1ZUh4ZllaYkV4RkpDIn0.FGUeAHrxJmaXhS2wj1g2lDQsV-yZOLA3r-sCgupwTzM")
//                .when()
//                .delete();
//    }

//    @Test
//    public void createPlaylist_PlaylistCreated() {
//        var createPlaylist = TestDataGenerator_my.createPlaylistRequest();
//        System.out.println(createPlaylist.getName());
//        Response response = given()
//                .baseUri("https://koelapp.testpro.io/")
//                .basePath("api/playlist")
//                .header("Content-Type", "application/json")
//                .header("Authorization", "Bearer "+ token)
//                .body(createPlaylist)
//                .when()
//                .post()
//                .then()
//                .statusCode(200)
//                .extract()
//                .response();
//
//        JsonPath jsonPath = response.jsonPath();
//        PlaylistKoel responsePlaylist = jsonPath.getObject("$", PlaylistKoel.class);
//        Assert.assertEquals(createPlaylist.getName(), responsePlaylist.getName());
//        playlistId = responsePlaylist.getId();
//        System.out.println(playlistId);
//    }

    @Test
    public void renamePlaylist_PlaylistRenamed() {
        var createPlaylist = TestDataGenerator_my.createPlaylistRequest();
        var renamePlaylist = TestDataGenerator_my.renamePlaylistRequest();

                 given()
                .baseUri("https://koelapp.testpro.io/")
                .basePath("api/playlist")
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer "+token)
                .body(createPlaylist)
                .when()
                .post()
                .then()
                .statusCode(200);

        Response response = given()
                .baseUri("https://koelapp.testpro.io/")
                .basePath("api/playlist/"+playlistId)
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer "+token)
                .body(renamePlaylist)
                .when()
                .put()
                .then()
                .statusCode(200)
                .extract()
                .response();

        JsonPath jsonPath = response.jsonPath();
        PlaylistKoel responsePlaylist = jsonPath.getObject("$", PlaylistKoel.class);
//        Assert.assertEquals(createPlaylist.getName(), responsePlaylist.getName());
        playlistId = responsePlaylist.getId();
        System.out.println(playlistId);
    }
}
