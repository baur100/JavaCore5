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
        MainPage mainPage = loginPage.logIn(username,password);
        Assert.assertTrue(mainPage.isLogoutButton());
    }
    @Test
    public void wrongLoginTestx(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.logIn(username,"88888888");
        Assert.assertFalse(mainPage.isLogoutButton());
    }
    @Test
    public void loginTest1x(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.logIn(username,password+"1");
        Assert.assertTrue(mainPage.isLogoutButton());
    }
    @Test
    public void wrongLoginTest1x(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.logIn(username,"88888888");
        Assert.assertFalse(mainPage.isLogoutButton());
    }
    @Test
    public void loginTest2x(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.logIn(username,password);
        Assert.assertTrue(mainPage.isLogoutButton());
    }
    @Test
    public void wrongLoginTest2x(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.logIn(username,"88888888");
        Assert.assertFalse(mainPage.isLogoutButton());
    }
}
