package koel_PageTests_My;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import koel_PageObjects_My.LoginPage_my;
import koel_PageObjects_My.MainPage_my;


public class LoginTest_my {
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

    public void loginTest() {
        LoginPage_my loginPage = new LoginPage_my(driver);
        loginPage.open();
        MainPage_my mainPage = loginPage.logIn("koeluser06@testpro.io","te$t$tudent");
        Assert.assertTrue(mainPage.plusButton());
    }

}
