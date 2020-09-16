package pageTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class LoginTest2 extends BaseTest {
    @Test
    public void loginTestx(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.logIn("kamilmaratovic@gmail.com","te$t$tudent");
        Assert.assertTrue(mainPage.isLogoutButton());
    }
    @Test
    public void wrongLoginTestx(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.logIn("koeluser06@testpro.io","88888888");
        Assert.assertFalse(mainPage.isLogoutButton());
    }
    @Test
    public void loginTest1x(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.logIn("kamilmaratovic@gmail.com","te$t$tudent");
        Assert.assertTrue(mainPage.isLogoutButton());
    }
    @Test
    public void wrongLoginTest1x(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.logIn("koeluser06@testpro.io","88888888");
        Assert.assertFalse(mainPage.isLogoutButton());
    }
    @Test
    public void loginTest2x(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.logIn("kamilmaratovic@gmail.com","te$t$tudent");
        Assert.assertTrue(mainPage.isLogoutButton());
    }
    @Test
    public void wrongLoginTest2x(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.logIn("koeluser06@testpro.io","88888888");
        Assert.assertFalse(mainPage.isLogoutButton());
    }
}
