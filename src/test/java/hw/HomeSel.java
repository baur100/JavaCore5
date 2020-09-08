package hw;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeSel {
    private WebDriver driver;
    private WebDriverWait wait;
    private FluentWait<WebDriver> fluentWait;

    @BeforeMethod
    public void wrongPassword() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 5);
        fluentWait = new FluentWait<>(driver)
                .ignoring(StaleElementReferenceException.class);

        driver.get("https://koelapp.testpro.io");

    }
    @AfterMethod
    public void teatDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
    @Test
    public void login_To_KoellApp_Negative_test(){
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[type='email']")));
        WebElement email = driver.findElement(By.cssSelector("[type='email']"));
        WebElement password = driver.findElement(By.cssSelector("[type='password']"));
        WebElement loginButton = driver.findElement(By.tagName("button"));
        WebElement loginElement = driver.findElement(By.tagName("form"));

        email.sendKeys("koeluser06@testpro.io");
        password.sendKeys("te$t$tudenttttt");
        loginButton.click();

        fluentWait.until(x->x.findElement(By.tagName("form")));
        Assert.assertTrue(loginElement.isDisplayed());
    }
}
