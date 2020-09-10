package koel_PageTests_My;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import koel_PageObjects_My.LoginPage;
import koel_PageObjects_My.MainPage;


public class LoginTest {
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

    public void loginTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.logIn("koeluser06@testpro.io","te$t$tudent");
        Assert.assertTrue(mainPage.plusButton());
    }

}
