package koel_PageTests_My;

import enums.BrowserType;
import enums_my.BrowserType_my;
import koel_Helpers_my.BrowserFabric_my;
import koel_Helpers_my.GetScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest_my {
    protected WebDriver driver;
    protected String username;
    protected String password;
    int tt = 0;

    @Parameters ({"username", "password", "browser"})

    @BeforeMethod
    public void beforeEveryTest(String email, String password, String browser) throws NoSuchMethodException {
        this.username = email;
        this.password = password;
//        BrowserType_my browserType_my;
//        if (browser.equals("Chrome")){
//            browserType_my=BrowserType_my.CHROME;
//        } else {
//            browserType_my=BrowserType_my.FIREFOX;
//        }
        BrowserType_my browserType_my = browser.equals("Chrome") ? BrowserType_my.CHROME : BrowserType_my.FIREFOX;

            driver = BrowserFabric_my.getDriver(browserType_my);
        }

    @AfterMethod
    public void tearDown(ITestResult iTestResult) throws InterruptedException {
        if(iTestResult.getStatus()==iTestResult.FAILURE){
            GetScreenshot.capture(driver, iTestResult.getName());
        }
        Thread.sleep(5000);
        driver.quit();
    }
}
