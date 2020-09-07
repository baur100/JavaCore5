package UdemiTest;

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

import java.util.concurrent.TimeUnit;

public class UdemyTest {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeMethod
    public void runBeforeEveryTest(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        wait= new WebDriverWait(driver,20);
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.get("https://www.udemy.com");
    }
    @AfterMethod
    public void runAfterEveryTest() throws InterruptedException {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }

    @Test
    public void udemySearch() throws InterruptedException {
        //Arrange
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[contains(@placeholder,'?')]")));
        //Act
        WebElement searchField = driver.findElement(By.xpath("//*[contains(@placeholder,'?')]"));
        searchField.sendKeys("Java");
        searchField.sendKeys(Keys.ENTER);
//        WebElement searchButton = driver.findElement(By.xpath("//*([@aria-label='Submit search'])[2]"));
//        searchButton.click();
        //Assert
        wait.until(ExpectedConditions.textToBe(By.tagName("h1"),"10,000 results for “java”"));
        WebElement resultNumber = driver.findElement(By.tagName("h1"));
        Assert.assertTrue(resultNumber.getText().contains("10,000"));
    }

    @Test
    public void udemyClickLoginButton() throws InterruptedException {
        //Arrange
        //Act
        WebElement loginButton = driver.findElement(By.xpath("//*[text()='Log in']/parent::a[@data-purpose='header-login']"));
        loginButton.click();
        WebElement loginMessage=driver.findElement(By.id("auth-to-udemy-title"));
        Assert.assertEquals(loginMessage.getText(),("Log In to Your Udemy Account!"));
    }
    @Test
    public void udemyClickSignUpButton() throws InterruptedException{
        //Arrange
        //Action
        WebElement signupButton=driver.findElement(By.xpath("//*[text()='Sign up']/parent::a[@data-purpose='header-signup']"));
        signupButton.click();
        //Assert
        WebElement signUpMessage=driver.findElement(By.id("auth-to-udemy-title"));
        Assert.assertEquals(signUpMessage.getText(),("Sign Up and Start Learning!"));
    }
}
