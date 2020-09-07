package SimpleTest;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class KoelApp {
    private WebDriver driver;
    private WebDriverWait wait;
    private FluentWait<WebDriver> fluentWait;

    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
//        fluentWait=new FluentWait<WebDriver>(driver)
//                .ignoring(StaleElementReferenceException.class)
//                .ignoring(NoSuchElementException.class)
//                .pollingEvery(Duration.ofMillis(100))
//                .withTimeout(Duration.ofSeconds(10));

        driver.get("https://koelapp.testpro.io");
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
    public void loginKoel() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@type='email']")));
        WebElement email = driver.findElement(By.xpath("//*[@type='email']"));
        WebElement password = driver.findElement(By.xpath("//*[@type='password']"));
        WebElement loginButton = driver.findElement(By.tagName("button"));

        email.sendKeys("koeluser05@testpro.io");
        password.sendKeys("te$t$tudent");
        loginButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".logout")));
        //   fluentWait.until(x->x.findElement(By.cssSelector(".logout")));
        //********************custom wait*********************************************
//        WebElement logOutButton=null;
//        boolean xx = true;
//        while (xx) {
//            try {
//                logOutButton = driver.findElement(By.cssSelector(".logout"));
//            } catch (StaleElementReferenceException|NoSuchElementException ignored) {}
//        }
        //*******************/\HACK/\*********************************************
        WebElement logOutButton = driver.findElement(By.cssSelector(".logout"));
        Assert.assertTrue(logOutButton.isDisplayed());

    }
}
