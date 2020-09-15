package test.java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testFirst {
    @Test
    public void searchGoogle() throws InterruptedException{
        // Arrange
        System.setProperty("webdriver.chrome.driver","chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("Https://www.google.com");

        // Act
        WebElement searchField = driver.findElement(By.cssSelector("[name='q']"));
        searchField.sendKeys("Java");
        searchField.sendKeys(Keys.ENTER);

        // Assert
        Assert.assertEquals(driver.getTitle(),"Java - Google Search");



        Thread.sleep(5000);

        driver.quit();

    }
}

