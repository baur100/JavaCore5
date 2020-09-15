package pageTests;

import helper.TestDataGenerator;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;


public class PlaylistTest extends BaseTest{

    @Test
    public void createPlaylistTest(){
        String name = TestDataGenerator.randomString(8);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.logIn("koeluser06@testpro.io","te$t$tudent");
        String playlistId = mainPage.createPlaylist(name);
        Assert.assertTrue(mainPage.isPlaylistExist(playlistId, name));
    }
    @Test
    public void renamePlaylistTest(){
        String name = TestDataGenerator.randomString(8);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.logIn("koeluser06@testpro.io","te$t$tudent");
        String playlistId = mainPage.createPlaylist(name);

        String newName = TestDataGenerator.randomString(8);
        mainPage.renamePlaylist(playlistId, newName);

        Assert.assertTrue(mainPage.isPlaylistExist(playlistId, newName));

    }
}
