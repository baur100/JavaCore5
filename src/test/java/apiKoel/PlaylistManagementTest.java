package apiKoel;
import helper.Data;
import helper.TestDataGenerator;
import helper.TokenHelper;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.Playlist;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PlaylistManagementTest {
    private int playlistId;
    private String token;
    @BeforeClass
    public void beforeAll(){
        token = "Bearer "+TokenHelper.get();
    }
    @AfterMethod
    public void tearDown(){
        Response response = given()
                .baseUri("https://koelapp.testpro.io/")
                .basePath("api/playlist/"+playlistId)
                .header("Authorization",token)
                .when()
                .delete();
    }
    @Test
    public void createPlaylist_PlaylistCreated(){
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
        playlistId=responsePlaylist.getId();
    }
    @Test
    public void purge_AllPlaylists(){
        var data = Data.get();
        var playlists = data.getPlaylists();
        for (Playlist pl : playlists){
            System.out.println("api/playlist/"+pl.getId());
            given()
                    .baseUri("https://koelapp.testpro.io/")
                    .basePath("api/playlist/"+pl.getId())
                    .header("Authorization",token)
                    .when()
                    .delete()
                    .then()
                    .statusCode(200)
                    .extract()
                    .response();
        }
    }
}
