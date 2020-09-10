package koel_PageTests_My;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import koel_PageObjects_My.LoginPage;
import koel_PageObjects_My.MainPage;
import koel_PageObjects_My.PlaylistNameField;
import koel_PageObjects_My.PlusButton;


public class CreatePlaylistTest {
    private WebDriver driver;


    @BeforeMethod
    public void beforeEveryTest() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();

    }
    @AfterMethod
    public void teatDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    @Test

    public void createPlaylistTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.logIn("koeluser06@testpro.io","te$t$tudent");
        PlusButton plusButton = new PlusButton(driver);
        plusButton.clickOn();
        PlaylistNameField playlistNameField = new PlaylistNameField(driver);
        playlistNameField.createPlaylist("BestSong");
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='playlistWrapper']/h1/span")).isDisplayed());


    }
}
