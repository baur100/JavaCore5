package SimpleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.NoSuchElementException;

public class NegativeTest {
    private WebDriver driver;
    private WebDriverWait wait;
    private FluentWait<WebDriver> fluentWait;

    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 20);
//           fluentWait = new FluentWait<WebDriver>(driver)
//                    .ignoring(NullPointerException.class)
//                    .ignoring(NoSuchElementException.class)
//                    .pollingEvery(Duration.ofMillis(100))
//                    .withTimeout(Duration.ofSeconds(10));
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
    public void negativeLoginKoel() {
        //Actions
        //  fluentWait.until(x -> x.findElement(By.xpath("//*[@type='email']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@type='email']")));
        WebElement email = driver.findElement(By.xpath("//*[@type='email']"));
        WebElement password = driver.findElement(By.xpath("//*[@type='password']"));
        WebElement loginButton = driver.findElement(By.tagName("button"));

        email.sendKeys("koeluser05@testpro.io");
        password.sendKeys("xxxxxxxxx");
        loginButton.click();

        //Assert
        // fluentWait.until(x -> x.findElement(By.xpath("//*[@class='error']")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='error']")));
        WebElement frameError = driver.findElement(By.xpath("//*[@class='error']"));
        Assert.assertTrue(frameError.isDisplayed());

    }
}
