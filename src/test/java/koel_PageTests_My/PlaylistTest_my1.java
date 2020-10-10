package koel_PageTests_My;


import helpers_my.TestDataGenerator_my;
import koel_PageObjects_My.LoginPage_my;
import koel_PageObjects_My.MainPage_my;
import listeners_my.RetryAnalyzer_my;
import org.testng.Assert;
import org.testng.annotations.Test;


public class PlaylistTest_my1 extends BaseTest_my {

    @Test

    public void createPlaylistTest11() {
        String name = TestDataGenerator_my.randomString(8);
        LoginPage_my loginPage = new LoginPage_my(driver);
        loginPage.open();
        MainPage_my mainPage = loginPage.logIn(username,password);
        String playlistId = mainPage.createPlaylist(name);
        Assert.assertTrue(mainPage.isPlaylistExist(playlistId));

    }

    @Test (retryAnalyzer = RetryAnalyzer_my.class)

    public void renamePlaylistTest11() {
        String name = TestDataGenerator_my.randomString(8);
        LoginPage_my loginPage = new LoginPage_my(driver);
        loginPage.open();
        MainPage_my mainPage = loginPage.logIn(username,password);
        String playlistId = mainPage.createPlaylist(name);
        String newName = TestDataGenerator_my.randomString(8);
        mainPage.renamePlaylist(playlistId, newName);
        boolean xx = false;
        if(tt==2){
            xx = true;
        }
        tt++;
        Assert.assertTrue(xx);


    }

    @Test

    public void createPlaylistTest22() {
        String name = TestDataGenerator_my.randomString(8);
        LoginPage_my loginPage = new LoginPage_my(driver);
        loginPage.open();
        MainPage_my mainPage = loginPage.logIn(username,password);
        String playlistId = mainPage.createPlaylist(name);
        Assert.assertTrue(mainPage.isPlaylistExist(playlistId));

    }

    @Test

    public void renamePlaylistTest22() {
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
