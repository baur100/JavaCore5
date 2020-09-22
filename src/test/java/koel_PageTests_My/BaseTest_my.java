package koel_PageTests_My;

import enums_my.BrowserType_my;
import koel_Helpers_my.BrowserFabric_my;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest_my {
    protected WebDriver driver;
    protected String username;
    protected String password;
    int tt = 1;

    @Parameters ({"username", "password"})

    @BeforeMethod
    public void beforeEveryTest(String email, String password) throws NoSuchMethodException {
        this.username = email;
        this.password = password;

            driver = BrowserFabric_my.getDriver(BrowserType_my.CHROME);
        }

    @AfterMethod
    public void teatDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
