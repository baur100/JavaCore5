package simpleTest;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class UdemyTest {
    private WebDriver driver;
    private WebDriverWait wait;
    private FluentWait<WebDriver> fluentWait;
    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,20);
        fluentWait = new FluentWait<WebDriver>(driver)
                .pollingEvery(Duration.ofMillis(100))
                .withTimeout(Duration.ofSeconds(20))
                .ignoring(NoSuchElementException.class);

//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.get("https://www.udemy.com");
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();
    }
    @Test
    public void udemySearch() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@placeholder,'?')]")));
        WebElement searchField = driver.findElement(By.xpath("//*[contains(@placeholder,'?')]"));
        searchField.sendKeys("Java");
        searchField.sendKeys(Keys.ENTER);

        wait.until(ExpectedConditions.textToBe(By.tagName("h1"),"10,000 results for “java”"));
        WebElement resultNumber = driver.findElement(By.xpath("//h1"));
        Assert.assertTrue(resultNumber.getText().contains("10,000"));
    }
    @Test
    public void udemyClickLoginButton(){
        fluentWait.until(x->x.findElement(By.xpath("//*[text()='Log in']")));
        WebElement loginButton = driver.findElement(By.xpath("//*[text()='Log in']"));
        loginButton.click();

        fluentWait.until(x->x.findElement(By.id("auth-to-udemy-title")));
        WebElement loginMessage = driver.findElement(By.id("auth-to-udemy-title"));
        Assert.assertEquals(loginMessage.getText(),"Log In to Your Udemy Account!");
    }
    @Test
    public void clickSignUpButton() {
        WebElement signUpButton = driver.findElement(By.cssSelector("[data-purpose='header-signup']"));
        signUpButton.click();

        WebElement signUpMessage = driver.findElement(By.id("auth-to-udemy-title"));
        Assert.assertEquals(signUpMessage.getText(),"Sign Up and Start Learning!");
    }
}
