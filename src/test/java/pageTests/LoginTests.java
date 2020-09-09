package pageTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class LoginTests {
    private WebDriver driver;

    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void loginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.logIn("koeluser06@testpro.io", "te$t$tudent");
        Assert.assertTrue(mainPage.isLogoutButton());
    }

    @Test
    public void wrongLoginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.logIn("koeluser06@testpro.io", "88888888");
        Assert.assertFalse(mainPage.isLogoutButton());
    }
    @Test
    public void login_createNewPlaylist() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.logIn("koeluser06@testpro.io", "te$t$tudent");
        HomePage homepage = new HomePage(driver);
        homepage.createNewPlaylist();
        Assert.assertTrue(homepage.isplaylistcreated("Denis"));
    }
}
