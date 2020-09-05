package simpleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UdemyTest {
    @Test
    public void usemySearch() throws InterruptedException {
        // Arrange
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.udemy.com");

//        WebElement searchField = driver.findElement(By.xpath("//*[contains(@placeholder,'?')]"));
//        searchField.sendKeys("Java");
        WebElement loginButton = driver.findElement(By.xpath("//*[text()='Log in']"));
        loginButton.click();

        Thread.sleep(5000);
        driver.quit();
    }
}
