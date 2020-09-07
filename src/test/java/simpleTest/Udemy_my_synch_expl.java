package simpleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Udemy_my_synch_expl {
    private WebDriver driver;
    //************************
    private WebDriverWait wait;
    //************************
    @BeforeMethod
    public void beforeEveryTest() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        //************************
        wait = new WebDriverWait(driver, 20);
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
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input)[2]")));

        WebElement searchField = driver.findElement(By.xpath("(//input)[2]"));
        searchField.sendKeys("Java");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='udlite-search-form-autocomplete-input-group udlite-form-group']/*[last()]")));
        WebElement searchButton = driver.findElement(By.xpath("//*[@class='udlite-search-form-autocomplete-input-group udlite-form-group']/*[last()]"));
        searchButton.click();

        wait.until(ExpectedConditions.textToBe(By.tagName("h1"), "10,000 results for “java”"));

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