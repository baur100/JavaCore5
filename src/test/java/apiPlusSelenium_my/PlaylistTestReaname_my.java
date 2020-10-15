package apiPlusSelenium_my;

import enums_my.BrowserType_my;
import helper.TestDataGenerator;
import helpers_my.BrowserFabric_my;
import helpers_my.TestDataGenerator_my;
import helpers_my.TokenHelper_my;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import koel_PageObjects_My.LoginPage_my;
import koel_PageObjects_My.MainPage_my;
import models.Playlist;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static io.restassured.RestAssured.given;

public class PlaylistTestReaname_my {
    private WebDriver driver;
    private String playlistId;
    private String token;
    private FluentWait<WebDriver> fluentWait;

    @BeforeClass
    public void runFirst() {
    token = "Bearer " + TokenHelper_my.get();
}
    @BeforeMethod
    public void sturtUp() throws NoSuchMethodException {
        driver = BrowserFabric_my.getDriver(BrowserType_my.CHROME);
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
       String token = "Bearer "+ TokenHelper_my.get();
        given()
                .baseUri("https://koelapp.testpro.io/api/playlist/"+playlistId)
                .header("Authorization", token)
                .when()
                .delete();
        driver.quit();
    }
    @Test

    public void renamePlaylistTest() throws InterruptedException {
        LoginPage_my loginPage = new LoginPage_my(driver);
        loginPage.open();
        MainPage_my mainPage = loginPage.logIn("koeluser06@testpro.io","te$t$tudent");
        String newName = TestDataGenerator_my.randomString(8);
        mainPage.renamePlaylist(playlistId, newName);
        Assert.assertTrue(mainPage.isPlaylistExist1(playlistId, newName));
    }

    }
