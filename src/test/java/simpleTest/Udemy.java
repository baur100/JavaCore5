package simpleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Udemy {
    @Test
    public void searchJavaInGoogle_ResultReturned() throws InterruptedException {

        //Arrange
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.udemy.com");

        //Act
        WebElement searchField = driver.findElement(By.xpath("(//input)[2]"));
        searchField.sendKeys("Java");
        Thread.sleep(3000);
        searchField.sendKeys(Keys.ENTER);

        Thread.sleep(3000);
        driver.quit();
    }
}
