package davitTest;

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

import java.time.Duration;

public class sample {
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
        driver.get("https://staging.qliqsoft.com/");

    }
    @AfterMethod
    public void teatDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
    @Test
    public void loginstaging(){
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[value='Login']")));
        WebElement email = driver.findElement(By.cssSelector("[type='email']"));
        WebElement password = driver.findElement(By.cssSelector("[type='password']"));
        WebElement loginButton = driver.findElement(By.cssSelector("[value='Login']"));

        email.sendKeys("jdonut@elmer.test");
        password.sendKeys("jsm108");
        loginButton.click();

        WebElement clickConversation = driver.findElement(By.xpath("//*[contains(@shape,'talk-bubbles')]"));
        clickConversation.click();

        WebElement startConversation = driver.findElement(By.xpath("//*[contains(@class,'v-btn v-btn--contained theme--light v-size--small has-tooltip')]"));
        startConversation.click();

        WebElement enterPatientName = driver.findElement(By.xpath("//*[@id='input-1760']"));
        enterPatientName.sendKeys("dat test");
        

 //       WebElement loginsucces = driver.findElement(By.xpath("//*[@class='dropdown_txt']"));

  //      Assert.assertTrue(loginsucces.isDisplayed());
    }
//    @Test
//    public void loginError(){
//        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[value='Login']")));
//        WebElement email = driver.findElement(By.cssSelector("[type='email']"));
//        WebElement password = driver.findElement(By.cssSelector("[type='password']"));
//        WebElement loginButton = driver.findElement(By.cssSelector("[value='Login']"));
//
//        email.sendKeys("jdonut@elmer.test");
//        password.sendKeys("jsm108");
//        loginButton.click();
//
//        WebElement logout = driver.findElement(By.xpath("//*[@class='action_link'][3]"));
//        logout.click();
//        WebElement logoutAssert = driver.findElement(By.cssSelector("[value='Login']"));
//
//        Assert.assertFalse(logoutAssert.isSelected());
//    }
}
