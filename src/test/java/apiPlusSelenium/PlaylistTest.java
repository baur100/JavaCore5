package apiPlusSelenium;

import enums.BrowserType;
import helper.BrowserFabric;
import helper.TestDataGenerator;
import helper.TokenHelper;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

import static io.restassured.RestAssured.given;

public class PlaylistTest {
    private WebDriver driver;
    private String playlistId;
    @BeforeMethod
    public void startUp() throws NoSuchMethodException {
        driver = BrowserFabric.getDriver(BrowserType.CHROME);
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {

        String token = "Bearer "+ TokenHelper.get();
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
    public void createPlaylist(){
        String name = TestDataGenerator.randomString(8);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.logIn("koeluser06@testpro.io","te$t$tudent");
        playlistId = mainPage.createPlaylist(name);
        Assert.assertTrue(mainPage.isPlaylistExist(playlistId, name));
    }
}
