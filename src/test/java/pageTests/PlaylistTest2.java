package pageTests;

import helper.TestDataGenerator;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;


public class PlaylistTest2 extends BaseTest{

    @Test
    public void createPlaylistTestx(){
        String name = TestDataGenerator.randomString(8);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.logIn("kamilmaratovic@gmail.com","te$t$tudent");
        String playlistId = mainPage.createPlaylist(name);
        Assert.assertTrue(mainPage.isPlaylistExist(playlistId, name));
    }
    @Test
    public void renamePlaylistTestx(){
        String name = TestDataGenerator.randomString(8);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.logIn("kamilmaratovic@gmail.com","te$t$tudent");
        String playlistId = mainPage.createPlaylist(name);

        String newName = TestDataGenerator.randomString(8);
        mainPage.renamePlaylist(playlistId, newName);

        Assert.assertTrue(mainPage.isPlaylistExist(playlistId, newName));
    }
    @Test
    public void createPlaylistTest1x(){
        String name = TestDataGenerator.randomString(8);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.logIn("kamilmaratovic@gmail.com","te$t$tudent");
        String playlistId = mainPage.createPlaylist(name);
        Assert.assertTrue(mainPage.isPlaylistExist(playlistId, name));
    }
    @Test
    public void renamePlaylistTest2x(){
        String name = TestDataGenerator.randomString(8);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.logIn("kamilmaratovic@gmail.com","te$t$tudent");
        String playlistId = mainPage.createPlaylist(name);

        String newName = TestDataGenerator.randomString(8);
        mainPage.renamePlaylist(playlistId, newName);

        Assert.assertTrue(mainPage.isPlaylistExist(playlistId, newName));
    }
}
