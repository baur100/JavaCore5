package pageTests;

import helper.TestDataGenerator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;


public class PlaylistTest {
    private WebDriver driver;

    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();

    }
    @AfterMethod
    public void teatDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
    @Test
    public void createPlaylistTest(){
        String name = TestDataGenerator.randomString(8);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.logIn("koeluser06@testpro.io","te$t$tudent");
        String playlistId = mainPage.createPlaylist(name);
        Assert.assertTrue(mainPage.isPlaylistExist(playlistId));
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
    }
}
