package PageTests;

import PageObgects.LoginPage;
import PageObgects.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
    private WebDriver driver;

    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void teatDown() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
    @Test
    public void loginTest(){
        LoginPage loginPage=new LoginPage(driver);
        loginPage.open();
        MainPage mainPage= loginPage.logIn("koeluser05@testpro.io","te$t$tudent");
        Assert.assertTrue(mainPage.isLogOutButton());
    }

}
