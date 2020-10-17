package hybrid;

import enums.BrowserType;
import helper.BrowserFabric;
import helper.DbAdapter;
import helper.TestDataGenerator;
import helper.TokenHelper;
import models.Playlist;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

import static io.restassured.RestAssured.given;

public class PlaylistSeleniumApiDbTest {
    WebDriver driver;
    String playlistId;
    String token;
    @BeforeMethod
    public void startUp() throws NoSuchMethodException {
        driver = BrowserFabric.getDriver(BrowserType.CHROME);
        token = TokenHelper.get();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        given()
                .baseUri("https://koelapp.testpro.io/")
                .basePath("api/playlist/"+playlistId)
                .header("Authorization","Bearer "+token)
                .when()
                .delete()
        .then().statusCode(200);
        ;
        Thread.sleep(5000);
        driver.quit();
    }
    @Test
    public void createPlaylist_playlistCreatedInDb(){
        String name = TestDataGenerator.randomString(8);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.logIn("koeluser06@testpro.io","te$t$tudent");
        playlistId = mainPage.createPlaylist(name);

        Playlist playlistFromDb = DbAdapter.getPlaylistById(Integer.parseInt(playlistId));
        Assert.assertEquals(playlistFromDb.getName(),name);
    }
}
