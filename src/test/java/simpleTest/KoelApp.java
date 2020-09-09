package simpleTest;

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
    public void startUp(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,10);
        fluentWait = new FluentWait<WebDriver>(driver)
                .pollingEvery(Duration.ofMillis(100))
                .withTimeout(Duration.ofSeconds(20))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class);

        driver.get("https://koelapp.testpro.io");
    }
    @AfterMethod
    public void teatDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void loginKoel(){
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[type='email']")));
        WebElement email = driver.findElement(By.cssSelector("[type='email']"));
        WebElement password = driver.findElement(By.cssSelector("[type='password']"));
        WebElement loginButton = driver.findElement(By.tagName("button"));

        email.sendKeys("koeluser06@testpro.io");
        password.sendKeys("te$t$tudent");
        loginButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".logout")));
//        fluentWait.until(x->x.findElement(By.cssSelector(".logout")));
        WebElement logoutButton = driver.findElement(By.cssSelector(".logout"));
        Assert.assertTrue(logoutButton.isDisplayed());
//***********************************************************
//        WebElement logoutButton=null;
//        boolean xx=true;
//        while (xx) {
//            try {
//                logoutButton = driver.findElement(By.cssSelector(".logout"));
//                xx=false;
//            } catch (StaleElementReferenceException | NoSuchElementException ignored){}
//        }
//************************************************************
    }
    @Test
    public void wrongCredentials(){
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[type='email']")));
        WebElement email = driver.findElement(By.cssSelector("[type='email']"));
        WebElement password = driver.findElement(By.cssSelector("[type='password']"));
        WebElement loginButton = driver.findElement(By.tagName("button"));

        email.sendKeys("koeluser06@testpro.io");
        password.sendKeys("=======");
        loginButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".error")));
        Assert.assertTrue(driver.findElement(By.cssSelector(".error")).isDisplayed());
    }
}
