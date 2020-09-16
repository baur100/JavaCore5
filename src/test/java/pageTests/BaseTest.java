package pageTests;

import enums.BrowserType;
import helper.BrowserFabric;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void startUp() throws NoSuchMethodException {
        driver = BrowserFabric.getDriver(BrowserType.CHROME);
    }
    @AfterMethod
    public void teatDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}