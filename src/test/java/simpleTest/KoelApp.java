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
import java.util.List;

public class KoelApp {
    private WebDriver driver;
    private WebDriverWait wait;
    private FluentWait<WebDriver> fluentWait;
    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        wait =new WebDriverWait(driver,10);
        fluentWait =new FluentWait(driver)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(NoSuchElementException.class)
                .pollingEvery(Duration.ofMillis(100))
                .withTimeout(Duration.ofSeconds(20));
        driver.get("https://koelapp.testpro.io/");
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void loginKoel(){
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[type = 'email']")));
        WebElement email = driver.findElement(By.cssSelector("[type = 'email']"));
        WebElement password = driver.findElement(By.cssSelector("[type='password']"));
        WebElement loginButton = driver.findElement(By.cssSelector("[type='submit']"));
        email.sendKeys("testpro.user06@testpro.io");
        password.sendKeys("te$t$tudent");
        loginButton.click();

//        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".logout")));
        fluentWait.until(x->x.findElement(By.cssSelector(".logout")));
        WebElement logOutButton = driver.findElement(By.cssSelector(".logout"));

        //******************************************
//        WebElement logOutButton = null;
//        boolean xx = true;
//        while (xx){
//            try {
//                logOutButton = driver.findElement(By.cssSelector(".logout"));
//                xx = false;
//            } catch (StaleElementReferenceException | NoSuchElementException ignored){}
//        }
        //******************************************


        Assert.assertTrue(logOutButton.isDisplayed());

    }
    @Test
    public void login_IncorrectCredentialsLogin() {
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[type = 'email']")));

        WebElement email = driver.findElement(By.xpath("//*[@type='email']"));
        email.sendKeys("testpro.user02@testpro.io");

        WebElement password = driver.findElement(By.xpath("//*[@type='password']"));
        password.sendKeys("te$t$tudent0");

        WebElement submitButton = driver.findElement(By.xpath("//*[@type='submit']"));
        submitButton.click();

        fluentWait.until(x -> x.findElement(By.className("error")));
        List<WebElement> error = driver.findElements(By.xpath("//*[@type='error']"));

        WebElement e = driver.findElement(By.xpath("//*[@class='error']"));
           try{ Assert.assertTrue(e.isDisplayed());
            System.out.println("Test pass");
        } catch (Exception err) {
            System.out.println("Test fail");
        }
//        boolean xx = true;
//        while (xx){
//            try{
//                driver.findElement(By.xpath("//*[@class='error']"));
//                xx=true;
//            } catch (Exception err){
//                System.out.println("pass");
//            }

       // Assert.assertEquals(error.size(), 0, "Element not found");



//    @Test
//    public void negativeLogin() {
//        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[type = 'email']")));
//        var email = driver.findElement(By.xpath("//*[@type='email']"));
//        email.sendKeys("testpro.user02@testpro.io");
//
//        var password = driver.findElement(By.xpath("//*[@type='password']"));
//        password.sendKeys("te$t$tudent08");
//
//        var loginbutton = driver.findElement(By.xpath("//*[@type='submit']"));
//        loginbutton.click();
//
//        Assert.assertFalse(driver.findElement(By.xpath("//*[@class='error']")).isDisplayed());
////        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".logout")));
//        var logout = driver.findElement(By.cssSelector(".logout"));

//        var home = driver.findElement(By.xpath("//*[@class='home active']"));
//        home.click();

//        String actualUrl="https://koelapp.testpro.io/";
//        String expectedUrl= driver.getCurrentUrl();
//        Assert.assertFalse(driver.findElement(By.xpath("//*[@class='error']")).isDisplayed());

//        Assert.assertEquals(expectedUrl,actualUrl);
//        if(actualUrl.equalsIgnoreCase(expectedUrl)) {
//            System.out.println("Test passed");
//        } else { System.out.println("Test failed");
//        }

//        try {
//            WebElement e = driver.findElement(By.xpath("//*[@class='error']"));
//            Assert.assertTrue(e.isDisplayed());
//            System.out.println("Test pass");
//        } catch (Exception err) {
//            System.out.println("Test fail");
//        }
//        boolean xx = true;
//        while (xx){
//            try{
//                driver.findElement(By.xpath("//*[@class='error']"));
//                xx=true;
//            } catch (Exception err){
//                System.out.println("pass");
//            }


    }
}
