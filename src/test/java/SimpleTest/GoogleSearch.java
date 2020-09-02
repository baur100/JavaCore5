package SimpleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearch {
    @Test
    public void searchJavaInGoogle_Resultreturned() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        //ACT
        WebElement searchField = driver.findElement(By.cssSelector("[name='q']"));
        searchField.sendKeys("java");
        searchField.sendKeys(Keys.ENTER);
        //ASSERT
        try {
            Assert.assertEquals(driver.getTitle(), "Java-Google Search");
        } catch (AssertionError vv) {
            driver.close();
            throw new AssertionError(vv.getMessage());
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ignored) {
        }

        driver.quit();
    }
}
