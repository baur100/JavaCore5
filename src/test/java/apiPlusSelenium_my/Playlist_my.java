package apiPlusSelenium_my;

import enums_my.BrowserType_my;
import helpers_my.BrowserFabric_my;
import helpers_my.TestDataGenerator_my;
import helpers_my.TokenHelper_my;
import koel_PageObjects_My.LoginPage_my;
import koel_PageObjects_My.MainPage_my;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Playlist_my {
    private WebDriver driver;
    private String playlistId;

    @BeforeMethod
    public void sturtUp() throws NoSuchMethodException {
        driver = BrowserFabric_my.getDriver(BrowserType_my.CHROME);
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

    public void createPlaylist() {
        String name = TestDataGenerator_my.randomString(8);
        LoginPage_my loginPage = new LoginPage_my(driver);
        loginPage.open();
        MainPage_my mainPage = loginPage.logIn("koeluser06@testpro.io","te$t$tudent");
        playlistId = mainPage.createPlaylist(name);
        Assert.assertTrue(mainPage.isPlaylistExist1(playlistId, name));

    }
}
