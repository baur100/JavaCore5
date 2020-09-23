package pageTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class LoginTest extends BaseTest {
    @Test
    public void loginTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.logIn(username,password);
        Assert.assertTrue(mainPage.isLogoutButton());
    }
    @Test(enabled=false)
    // TODO Update test later
    public void wrongLoginTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.logIn(username,"88888888");
        Assert.assertFalse(mainPage.isLogoutButton());
    }
    @Test
    public void loginTest1(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.logIn(username,password);
        Assert.assertTrue(mainPage.isLogoutButton());
    }
    @Test
    public void wrongLoginTest1(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.logIn(username,"88888888");
        Assert.assertFalse(mainPage.isLogoutButton());
    }
    @Test
    public void loginTest2(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.logIn(username,password);
        Assert.assertTrue(mainPage.isLogoutButton());
    }
    @Test
    public void wrongLoginTest2(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.logIn(username,"88888888");
        Assert.assertFalse(mainPage.isLogoutButton());
    }
}
