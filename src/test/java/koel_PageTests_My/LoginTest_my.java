package koel_PageTests_My;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import koel_PageObjects_My.LoginPage_my;
import koel_PageObjects_My.MainPage_my;


public class LoginTest_my extends BaseTest_my {

    @Test

    public void loginTest1() {
        LoginPage_my loginPage = new LoginPage_my(driver);
        loginPage.open();
        MainPage_my mainPage = loginPage.logIn(username,password);
        Assert.assertTrue(mainPage.plusButton());
    }

    @Test (enabled = false)
    //TODO later

    public void negativeLoginTest1() {
        LoginPage_my loginPage = new LoginPage_my(driver);
        loginPage.open();
        MainPage_my mainPage = loginPage.logIn("koeluser06@testpro.io","te$t$tuden");
        Assert.assertFalse(mainPage.plusButton());
    }

    @Test

    public void loginTest2() {
        LoginPage_my loginPage = new LoginPage_my(driver);
        loginPage.open();
        MainPage_my mainPage = loginPage.logIn(username,password);
        Assert.assertTrue(mainPage.plusButton());
    }

    @Test

    public void negativeLoginTest2() {
        LoginPage_my loginPage = new LoginPage_my(driver);
        loginPage.open();
        MainPage_my mainPage = loginPage.logIn("koeluser06@testpro.io","te$t$tuden");
        Assert.assertFalse(mainPage.plusButton());
    }
    @Test

    public void loginTest3() {
        LoginPage_my loginPage = new LoginPage_my(driver);
        loginPage.open();
        MainPage_my mainPage = loginPage.logIn(username,password);
        Assert.assertTrue(mainPage.plusButton());
    }

    @Test

    public void negativeLoginTest3() {
        LoginPage_my loginPage = new LoginPage_my(driver);
        loginPage.open();
        MainPage_my mainPage = loginPage.logIn("koeluser06@testpro.io","te$t$tuden");
        Assert.assertFalse(mainPage.plusButton());
    }

    @Test

    public void loginTest4() {
        LoginPage_my loginPage = new LoginPage_my(driver);
        loginPage.open();
        MainPage_my mainPage = loginPage.logIn(username,password);
        Assert.assertTrue(mainPage.plusButton());
    }

    @Test

    public void negativeLoginTest4() {
        LoginPage_my loginPage = new LoginPage_my(driver);
        loginPage.open();
        MainPage_my mainPage = loginPage.logIn("koeluser06@testpro.io","te$t$tuden");
        Assert.assertFalse(mainPage.plusButton());
    }

}
