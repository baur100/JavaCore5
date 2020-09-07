package simpleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Udemy_my {
   private WebDriver driver;
    @BeforeMethod
    public void beforeEveryTest() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.udemy.com");
    }
    @AfterMethod
    public void afterEachTest() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();
    }
    @Test
    public void searchJavaInUdemy_ResultReturned() throws InterruptedException {

        //Act
        WebElement searchField = driver.findElement(By.xpath("(//input)[2]"));
        searchField.sendKeys("Java");
        Thread.sleep(3000);
        WebElement searchButton = driver.findElement(By.xpath("//*[@class='udlite-search-form-autocomplete-input-group udlite-form-group']/*[last()]"));
        searchButton.click();
        Thread.sleep(3000);
        WebElement result = driver.findElement(By.xpath("//*[@class='udlite-heading-md filter-panel--item-count--2JGx3']"));

        //Assert
        Assert.assertTrue(result.getText().contains("10 000"));

    }
    @Test

    public void loginPageUdemyOpen_ResultReturned() throws InterruptedException {

        //Act

        WebElement loginButton = driver.findElement(By.xpath("//*[@data-purpose='header-login']"));
        loginButton.click();
        Thread.sleep(3000);

        //Assert
       WebElement loginMessage = driver.findElement(By.id("auth-to-udemy-title"));
        Assert.assertEquals(loginMessage.getText(), "Log In to Your Udemy Account!");



    }
    @Test

    public void signUpPageOpen_ResultReturned() throws InterruptedException {

        WebElement signUpButton = driver.findElement(By.cssSelector("[data-purpose='header-signup']"));
        signUpButton.click();
        Thread.sleep(3000);

        WebElement signUpMessage = driver.findElement(By.id("auth-to-udemy-title"));
        Assert.assertEquals(signUpMessage.getText(), "Sign Up and Start Learning!");
    }
}
