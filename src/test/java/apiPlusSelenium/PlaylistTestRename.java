package apiPlusSelenium;

import enums.BrowserType;
import helper.BrowserFabric;
import helper.TestDataGenerator;
import helper.TokenHelper;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.Playlist;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

import static io.restassured.RestAssured.given;

public class PlaylistTestRename {
    private WebDriver driver;
    private String playlistId;
    private String token;
    @BeforeClass
    public void runFirst(){
        token = "Bearer "+ TokenHelper.get();
    }
    @BeforeMethod
    public void startUp() throws NoSuchMethodException {
        driver = BrowserFabric.getDriver(BrowserType.CHROME);
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
    public void tearDown() throws InterruptedException {
        given()
                .baseUri("https://koelapp.testpro.io/")
                .basePath("api/playlist/"+playlistId)
                .header("Authorization",token)
                .when()
                .delete();
        Thread.sleep(5000);
        driver.quit();
    }
    @Test
    public void renamePlaylist(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.logIn("koeluser06@testpro.io","te$t$tudent");
        String newName = TestDataGenerator.randomString(8);

        mainPage.renamePlaylist(playlistId, newName);
        Assert.assertTrue(mainPage.isPlaylistExist(playlistId, newName));
    }
}
