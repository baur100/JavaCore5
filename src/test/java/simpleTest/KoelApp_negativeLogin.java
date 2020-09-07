package simpleTest;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class KoelApp_negativeLogin {
    private WebDriver driver;
    private FluentWait<WebDriver> fluentWait;

    @BeforeMethod
    public void beforeEveryTest() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofMillis(10))
                .ignoring(ElementNotVisibleException.class)
                .ignoring(NoSuchElementException.class);
        driver.get("https://koelapp.testpro.io/");
    }

    @AfterMethod
    public void teatDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    @Test

    public void loginKoelApp_NegativeTest() {
        fluentWait.until(x -> x.findElement(By.cssSelector("[type='email']")));
        WebElement emailAddress = driver.findElement(By.cssSelector("[type='email']"));
        WebElement password = driver.findElement(By.cssSelector("[type='password']"));
        WebElement logInButton = driver.findElement(By.cssSelector("[type='submit']"));
        emailAddress.sendKeys("koeluser06@testpro.io");
        password.sendKeys("te$t$tuden");
        logInButton.click();

        fluentWait.until(x -> x.findElement(By.cssSelector(".error")));
        WebElement error = driver.findElement(By.cssSelector(".error"));
        Assert.assertTrue(error.isDisplayed());
    }


}
