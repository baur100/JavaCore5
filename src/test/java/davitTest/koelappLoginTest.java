package davitTest;

import com.google.common.base.VerifyException;
import org.openqa.selenium.By;
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
import org.testng.reporters.jq.ResultsByClass;

import java.time.Duration;

public class koelappLoginTest {
    private WebDriver driver;
    private WebDriverWait wait;
    private FluentWait<WebDriver> fluentWait;
    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,10);
        fluentWait = new FluentWait<>(driver)
                .pollingEvery(Duration.ofMillis(100))
                .withTimeout(Duration.ofSeconds(20));
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
        password.sendKeys("student");
        loginButton.click();

        //wait.until(ExpectedConditions.elementToBeSelected(By.cssSelector("[class='error']")));

        WebElement loginError = driver.findElement(By.cssSelector("[class='error']"));

        Assert.assertFalse(loginError.isSelected());

    }
}
