package simpleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Search_my {
    @Test
    public void searchJavaInGoogle_ResultReturned()  {

        //Arrange
        System.setProperty("webdriver.chrome.driver","chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        //Act
        WebElement searchField = driver.findElement(By.cssSelector("[name='q']"));
        searchField.sendKeys("Java");
        searchField.sendKeys(Keys.ENTER);

        //Assert
        try {
            Assert.assertEquals(driver.getTitle(), "Java - Поиск в Google");
        }catch (AssertionError vv){
            driver.quit();
            throw new AssertionError(vv.getMessage());
        }




        try{
        Thread.sleep(5000);
        }catch (InterruptedException ignored){}

        driver.quit();
    }
    @Test
    public void searchJavaInGoogleUsingSearchButton_ResultReturned() {
        //Arrange
        System.setProperty("webdriver.chrome.driver","chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        //Act
        WebElement searchField = driver.findElement(By.cssSelector("[name='q']"));
        searchField.sendKeys("Java");
        WebElement searchButton = driver.findElement(By.cssSelector("[data-ved='0ahUKEwjxgsjuu8nrAhVShOAKHSgWDgUQ4dUDCAk']"));
        searchButton.click();

        //Assert
        try {
            Assert.assertEquals(driver.getTitle(), "Java - Поиск в Google");
        }catch (AssertionError vv){
            driver.quit();
            throw new AssertionError(vv.getMessage());
        }




        try{
            Thread.sleep(5000);
        }catch (InterruptedException ignored){}

        driver.quit();
    }
    }
