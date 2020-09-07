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

public class Udemy_my_synch_expl1 {
    private WebDriver driver;
    //************************
    private FluentWait <WebDriver> fluentWait;
    //************************
    @BeforeMethod
    public void beforeEveryTest() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        //************************
       fluentWait = new FluentWait <WebDriver> (driver)
       .withTimeout(Duration.ofSeconds(20))
       .pollingEvery(Duration.ofMillis(10))
       .ignoring(ElementNotVisibleException.class)
       .ignoring(NoSuchElementException.class);
        //************************
        driver.get("https://www.udemy.com");
    }


    @AfterMethod
    public void afterEachTest() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();
    }
    @Test
    public void searchJavaInUdemy_ResultReturned() throws InterruptedException {

        fluentWait.until(x->x.findElement(By.xpath("(//input)[2]")));
        WebElement searchField = driver.findElement(By.xpath("(//input)[2]"));
        searchField.sendKeys("Java");
        fluentWait.until(x->x.findElement(By.xpath("//*[@class='udlite-search-form-autocomplete-input-group udlite-form-group']/*[last()]")));
        WebElement searchButton = driver.findElement(By.xpath("//*[@class='udlite-search-form-autocomplete-input-group udlite-form-group']/*[last()]"));
        searchButton.click();


        fluentWait.until(x->x.findElement(By.tagName("h1")));
        WebElement result = driver.findElement(By.tagName("h1"));
        Assert.assertTrue(result.getText().contains("10,000"));

    }
    @Test

    public void loginPageUdemyOpen_ResultReturned() throws InterruptedException {

        //Act

        WebElement loginButton = driver.findElement(By.xpath("//*[@data-purpose='header-login']"));
        loginButton.click();

        //Assert
        WebElement loginMessage = driver.findElement(By.id("auth-to-udemy-title"));
        Assert.assertEquals(loginMessage.getText(), "Log In to Your Udemy Account!");



    }
    @Test

    public void signUpPageOpen_ResultReturned() throws InterruptedException {

        WebElement signUpButton = driver.findElement(By.cssSelector("[data-purpose='header-signup']"));
        signUpButton.click();

        WebElement signUpMessage = driver.findElement(By.id("auth-to-udemy-title"));
        Assert.assertEquals(signUpMessage.getText(), "Sign Up and Start Learning!");
    }
}