package koel_PageTests_My;

import koel_PageObjects_My.LoginPage_my;
import koel_PageObjects_My.MainPage_my;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest_my1 extends BaseTest_my {

    @Test

    public void loginTest11() {
        LoginPage_my loginPage = new LoginPage_my(driver);
        loginPage.open();
        MainPage_my mainPage = loginPage.logIn(username,password);
        Assert.assertTrue(mainPage.plusButton());
    }

    @Test

    public void negativeLoginTest11() {
        LoginPage_my loginPage = new LoginPage_my(driver);
        loginPage.open();
        MainPage_my mainPage = loginPage.logIn("koeluser06@testpro.io","te$t$tuden");
        Assert.assertFalse(mainPage.plusButton());
    }

    @Test

    public void loginTest22() {
        LoginPage_my loginPage = new LoginPage_my(driver);
        loginPage.open();
        MainPage_my mainPage = loginPage.logIn(username,password+"1");
        Assert.assertTrue(mainPage.plusButton());
    }

    @Test

    public void negativeLoginTest22() {
        LoginPage_my loginPage = new LoginPage_my(driver);
        loginPage.open();
        MainPage_my mainPage = loginPage.logIn("koeluser06@testpro.io","te$t$tuden");
        Assert.assertFalse(mainPage.plusButton());
    }
    @Test

    public void loginTest33() {
        LoginPage_my loginPage = new LoginPage_my(driver);
        loginPage.open();
        MainPage_my mainPage = loginPage.logIn(username,password);
        Assert.assertTrue(mainPage.plusButton());
    }

    @Test

    public void negativeLoginTest33() {
        LoginPage_my loginPage = new LoginPage_my(driver);
        loginPage.open();
        MainPage_my mainPage = loginPage.logIn("koeluser06@testpro.io","te$t$tuden");
        Assert.assertFalse(mainPage.plusButton());
    }

    @Test
    
    public void loginTest44() {
        LoginPage_my loginPage = new LoginPage_my(driver);
        loginPage.open();
        MainPage_my mainPage = loginPage.logIn(username,password);
        Assert.assertTrue(mainPage.plusButton());
    }

    @Test

    public void negativeLoginTest44() {
        LoginPage_my loginPage = new LoginPage_my(driver);
        loginPage.open();
        MainPage_my mainPage = loginPage.logIn("koeluser06@testpro.io","te$t$tuden");
        Assert.assertFalse(mainPage.plusButton());
    }

}
