package koel_PageTests_My;


import helpers_my.TestDataGenerator_my;
import org.testng.Assert;
import org.testng.annotations.Test;
import koel_PageObjects_My.LoginPage_my;
import koel_PageObjects_My.MainPage_my;


public class PlaylistTest_my extends BaseTest_my {

    @Test

    public void createPlaylistTest1() {
        String name = TestDataGenerator_my.randomString(8);
        LoginPage_my loginPage = new LoginPage_my(driver);
        loginPage.open();
        MainPage_my mainPage = loginPage.logIn(username,password);
        String playlistId = mainPage.createPlaylist(name);
        Assert.assertTrue(mainPage.isPlaylistExist(playlistId, playlistId));

    }

    @Test

    public void renamePlaylistTest1() {
        String name = TestDataGenerator_my.randomString(8);
        LoginPage_my loginPage = new LoginPage_my(driver);
        loginPage.open();
        MainPage_my mainPage = loginPage.logIn(username,password);
        String playlistId = mainPage.createPlaylist(name);
        String newName = TestDataGenerator_my.randomString(8);
        mainPage.renamePlaylist(playlistId, newName);
        Assert.assertTrue(mainPage.isPlaylistExist1(playlistId, newName));

    }

    @Test

    public void createPlaylistTest2() {
        String name = TestDataGenerator_my.randomString(8);
        LoginPage_my loginPage = new LoginPage_my(driver);
        loginPage.open();
        MainPage_my mainPage = loginPage.logIn(username,password);
        String playlistId = mainPage.createPlaylist(name);
        Assert.assertTrue(mainPage.isPlaylistExist(playlistId, playlistId));

    }

    @Test

    public void renamePlaylistTest2() {
        String name = TestDataGenerator_my.randomString(8);
        LoginPage_my loginPage = new LoginPage_my(driver);
        loginPage.open();
        MainPage_my mainPage = loginPage.logIn(username,password);
        String playlistId = mainPage.createPlaylist(name);
        String newName = TestDataGenerator_my.randomString(8);
        mainPage.renamePlaylist(playlistId, newName);
        Assert.assertTrue(mainPage.isPlaylistExist1(playlistId, newName));

    }
}
